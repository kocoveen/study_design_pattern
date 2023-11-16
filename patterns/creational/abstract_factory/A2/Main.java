package patterns.creational.abstract_factory.A2;

import patterns.creational.abstract_factory.A2.factory.Factory;
import patterns.creational.abstract_factory.A2.factory.Link;
import patterns.creational.abstract_factory.A2.factory.Page;
import patterns.creational.abstract_factory.A2.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listNaver.html patterns.creational.abstract_factory.A2.listfactory.ListFactory");
            System.out.println("Example 2: java Main divNaver.html patterns.creational.abstract_factory.A2.divfactory.DivFactory");
            System.exit(0);
        }

        String filename = args[0];
        String classname = args[1];

        Factory factory = Factory.getFactory(classname);

       // Page
        Page page = factory.createNaverPage();

        page.output(filename);
    }
}
