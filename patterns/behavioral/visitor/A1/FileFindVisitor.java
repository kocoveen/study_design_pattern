package patterns.behavioral.visitor.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
    private String fileType;
    private List<File> foundFiles = new ArrayList<>();

    // ".txt"처럼 확장자를 피리어드(.)를 붙여 지정
    public FileFindVisitor(String fileType) {
        this.fileType = fileType;
    }

    // 발견한 파일을 가져옴
    public Iterable<File> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }
}
