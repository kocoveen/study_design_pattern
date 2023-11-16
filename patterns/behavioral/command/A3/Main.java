package patterns.behavioral.command.A3;

import patterns.behavioral.command.A3.command.Command;
import patterns.behavioral.command.A3.command.MacroCommand;
import patterns.behavioral.command.A3.drawer.DrawCanvas;
import patterns.behavioral.command.A3.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {
    // 그리기 이력
    private MacroCommand history = new MacroCommand();

    // 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    // 삭제 버튼
    private JButton clearButton = new JButton("clear");

    // 생성자
    public Main(String title) {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });

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

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
