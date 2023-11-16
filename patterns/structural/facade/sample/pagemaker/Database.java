package patterns.structural.facade.sample.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {
    }

    // 데이터베이스 이름에서 Properties 얻음
    public static Properties getProperties(String dbName) throws IOException {
        String fileName = dbName + ".atxt";
        Properties prop = new Properties();
        prop.load(new FileReader(fileName));
        return prop;
    }
}
