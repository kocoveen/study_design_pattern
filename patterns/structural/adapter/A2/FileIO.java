package patterns.structural.adapter.A2;

import java.io.IOException;

public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeFromFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
