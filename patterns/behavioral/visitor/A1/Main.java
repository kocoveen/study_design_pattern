package patterns.behavioral.visitor.A1;

public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("v1", 10000));
        binDir.add(new File("latex", 20000));

        Directory jang = new Directory("jang");
        Directory kim = new Directory("kim");
        Directory park = new Directory("park");
        usrDir.add(jang);
        usrDir.add(kim);
        usrDir.add(park);
        jang.add(new File("diary.html", 100));
        jang.add(new File("Composite.java", 200));
        kim.add(new File("memo.tex", 300));
        kim.add(new File("index.html", 350));
        park.add(new File("game.docx", 400));
        park.add(new File("junk.mail", 500));

        FileFindVisitor ffv = new FileFindVisitor(".html");
        rootDir.accept(ffv);

        System.out.println("HTML files are: ");
        for (File file : ffv.getFoundFiles()) {
            System.out.println(file);
        }

    }
}
