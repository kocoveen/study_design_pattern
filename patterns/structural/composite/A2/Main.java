package patterns.structural.composite.A2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");

        Directory usrDir = new Directory("usr");
        rootDir.add(usrDir);

        Directory jang = new Directory("jang");
        usrDir.add(jang);

        File file = new File("Composite.java", 200);
        jang.add(file);

        // 전체 디렉토리 조회
        rootDir.printList();

        System.out.println("file = " + file.getFullName());
        System.out.println("jang = " + jang.getFullName());
    }
}
