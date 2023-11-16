package patterns.behavioral.command.A1;

import patterns.behavioral.command.A1.command.Command;
import patterns.behavioral.command.A1.command.MacroCommand;
import patterns.behavioral.command.A1.drawer.ColorCommand;
import patterns.behavioral.command.A1.drawer.DrawCanvas;
import patterns.behavioral.command.A1.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력
    private MacroCommand history = new MacroCommand();

    // 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    // 삭제 버튼
    private JButton clearButton = new JButton("clear");
    private JButton redButton = new JButton("red"); // 빨간 버튼
    private JButton greenButton = new JButton("green"); // 초록 버튼
    private JButton blueButton = new JButton("blue"); // 파란 버튼

    // 생성자
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(e -> {
            history.clear();
            // canvas.init();
            canvas.repaint();
        });
        redButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        });
        greenButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        });
        blueButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
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
