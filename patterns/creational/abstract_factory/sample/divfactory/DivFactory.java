package patterns.creational.abstract_factory.sample.divfactory;

import patterns.creational.abstract_factory.sample.factory.Factory;
import patterns.creational.abstract_factory.sample.factory.Link;
import patterns.creational.abstract_factory.sample.factory.Page;
import patterns.creational.abstract_factory.sample.factory.Tray;

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
