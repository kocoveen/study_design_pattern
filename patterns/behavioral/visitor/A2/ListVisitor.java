package patterns.behavioral.visitor.A2;

public class ListVisitor extends Visitor {
    private String currentDir = ""; // 현재 주목하는 디렉터리 이름

    // File 방문 시
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        for (Entry entry : directory) {
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
