package patterns.creational.abstract_factory.A2.listfactory;

import patterns.creational.abstract_factory.A2.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "\t<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
