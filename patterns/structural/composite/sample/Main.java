package patterns.structural.composite.sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("v1", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.printList();
        System.out.println();

        System.out.println("Making user entries...");
        Directory jang = new Directory("jang");
        Directory kim = new Directory("kim");
        Directory park = new Directory("park");
        usrDir.add(jang);
        usrDir.add(kim);
        usrDir.add(park);
        jang.add(new File("diary.html", 100));
        jang.add(new File("Composite.java", 200));
        kim.add(new File("memo.tex", 300));
        park.add(new File("game.docx", 400));
        park.add(new File("junk.mail", 500));
        rootDir.printList();
    }
}
