package patterns.creational.builder.A3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();
        Director director = new Director(frameBuilder);
        director.construct();
        JFrame frame = frameBuilder.getFrameResult();
        frame.setVisible(true);
    }
}
