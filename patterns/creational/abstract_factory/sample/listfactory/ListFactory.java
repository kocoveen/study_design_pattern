package patterns.creational.abstract_factory.sample.listfactory;

import patterns.creational.abstract_factory.sample.factory.Factory;
import patterns.creational.abstract_factory.sample.factory.Link;
import patterns.creational.abstract_factory.sample.factory.Page;
import patterns.creational.abstract_factory.sample.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
