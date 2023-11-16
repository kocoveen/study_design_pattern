package patterns.structural.adapter.A2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties properties = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        properties.load(new FileReader(filename, StandardCharsets.UTF_8));
    }

    @Override
    public void writeFromFile(String filename) throws IOException {
        properties.store(new FileWriter(filename, StandardCharsets.UTF_8), "Written By FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}
