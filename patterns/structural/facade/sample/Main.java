package patterns.structural.facade.sample;

import patterns.structural.facade.sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("lavigne@example.com", "welcome.html");
    }
}
