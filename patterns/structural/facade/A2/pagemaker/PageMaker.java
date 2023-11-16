package patterns.structural.facade.A2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String filename) {
        try {
            Properties mailProp = Database.getProperties("mailData");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s Web Page");
            writer.paragraph("Welcome to " + username + "'s Web Page!");
            writer.paragraph("Nice to meet you!");
            writer.link(mailAddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link Page");
            Properties mailProp = Database.getProperties("mailData");
            for (String mailAddr : mailProp.stringPropertyNames()) {
                String username = mailProp.getProperty(mailAddr, "(unknown)");
                writer.mailto(mailAddr, username);
            }
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
