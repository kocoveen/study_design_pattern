package patterns.behavioral.interpreter.A1.turtle;

import patterns.behavioral.interpreter.A1.language.Executor;
import patterns.behavioral.interpreter.A1.language.ExecutorFactory;

public class TurtleExecutorFactory implements ExecutorFactory {
    private final TurtleCanvas canvas;

    // 내부 클래스("go" 실행)
    public class GoExecutor implements Executor {
        @Override
        public void execute() {
            canvas.go(TurtleCanvas.UNIT_LENGTH);
        }
    }

    // 내부 클래스("left" 실행)
    public class LeftExecutor implements Executor {
        @Override
        public void execute() {
            canvas.setRelativeDirection(TurtleCanvas.RELATIVE_DIRECTION_LEFT);
        }
    }

    // 내부 클래스("right" 실행)
    public class RightExecutor implements Executor {
        @Override
        public void execute() {
            canvas.setRelativeDirection(TurtleCanvas.RELATIVE_DIRECTION_RIGHT);
        }
    }

    // 생성자
    public TurtleExecutorFactory(TurtleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public Executor createExecutor(String name) {
        return switch (name) {
            case "go" -> new GoExecutor();
            case "right" -> new RightExecutor();
            case "left" -> new LeftExecutor();
            default -> throw new IllegalArgumentException("Error: Unknown <primitive command> '" + name + "'");
        };
    }
}
