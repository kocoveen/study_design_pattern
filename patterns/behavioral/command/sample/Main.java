package patterns.behavioral.command.sample;

import patterns.behavioral.command.sample.command.Command;
import patterns.behavioral.command.sample.command.MacroCommand;
import patterns.behavioral.command.sample.drawer.DrawCanvas;
import patterns.behavioral.command.sample.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력
    private MacroCommand history = new MacroCommand();

    // 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    // 삭제 버튼
    private JButton clearButton = new JButton("clear");

    // 생성자
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // MouseMotionListener 용
    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener 용
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override public void windowOpened(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
