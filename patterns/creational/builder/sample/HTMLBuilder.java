package patterns.creational.builder.sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HTMLBuilder extends Builder {
    private static final String PATH = "patterns/creational/builder/sample/";

    private String filename = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        sb.append("<!DOCTYPE html>").append("\n");
        sb.append("<html>").append("\n");
        sb.append("<head>");
        sb.append("<title>").append(title).append("</title>");
        sb.append("</head>").append("\n");
        sb.append("<body>").append("\n");
        sb.append("<h1>").append(title).append("</h1>").append("\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>").append(str).append("</p>").append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>").append("\n");
        for (String s : items) {
            sb.append("<li>").append(s).append("</li>").append("\n");
        }
        sb.append("</ul>").append("\n\n");
    }

    @Override
    public void close() {
        sb.append("</body>").append("\n");
        sb.append("</html>").append("\n");
        try {
            Writer writer = new FileWriter(PATH + filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHTMLResult() {
        return filename;
    }
}
