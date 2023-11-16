package patterns.creational.builder.A2;

public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("====================================").append("\n");
        sb.append("[").append(title).append("]").append("\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("■ ").append(str).append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append("· ").append(s).append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("====================================").append("\n");
    }

    public String getTextResult() {
        return sb.toString();
    }
}
