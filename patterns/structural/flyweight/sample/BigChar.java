package patterns.structural.flyweight.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    // 문자의 이름
    private char charName;

    // 큰 문자를 표현하는 문자열('#' '.' '\n' 으로 이루어진 열)
    private String fontData;

    // 생성자
    public BigChar(char charName) {
        this.charName = charName;
        try {
            String filename = "big" + charName + ".txt";
            StringBuilder sb = new StringBuilder();
            for (String line : Files.readAllLines(Path.of(filename))) {
                sb.append(line).append('\n');
            }
            this.fontData = sb.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    // 큰 문자 표시
    public void print() {
        System.out.println(fontData);
    }
}
