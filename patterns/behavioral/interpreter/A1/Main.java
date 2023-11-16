package patterns.behavioral.interpreter.A1;

import patterns.behavioral.interpreter.A1.language.*;
import patterns.behavioral.interpreter.A1.turtle.TurtleCanvas;
import patterns.behavioral.interpreter.A1.turtle.TurtleExecutorFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
    private TurtleCanvas canvas = new TurtleCanvas(400, 400);
    private InterpreterFacade facade = new InterpreterFacade(new TurtleExecutorFactory(canvas));
    private TextField programTextField = new TextField("program repeat 4 go right go left go left end end");

    // 생성자
    public Main(String title) {
        super(title);

        canvas.setExecutor(facade);

        setLayout(new BorderLayout());

        programTextField.addActionListener(e -> parseAndExecute());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(programTextField, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        pack();
        setVisible(true);

        parseAndExecute();
    }

    private void parseAndExecute() {
        String programText = programTextField.getText();
        System.out.println("programText = " + programText);
        try {
            facade.parse(programText);
            canvas.repaint();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Main("Interpreter Pattern simple");
    }
}
