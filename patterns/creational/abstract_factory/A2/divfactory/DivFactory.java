package patterns.creational.abstract_factory.A2.divfactory;

import patterns.creational.abstract_factory.A2.factory.Factory;
import patterns.creational.abstract_factory.A2.factory.Link;
import patterns.creational.abstract_factory.A2.factory.Page;
import patterns.creational.abstract_factory.A2.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
