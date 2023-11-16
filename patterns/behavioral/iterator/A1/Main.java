package patterns.behavioral.iterator.A1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("광장"));
        bookShelf.appendBook(new Book("날개"));
        bookShelf.appendBook(new Book("삼대"));
        bookShelf.appendBook(new Book("무정"));
        bookShelf.appendBook(new Book("토지"));

        //명시적 Iterator 사용
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
        System.out.println();

        //확장 for 문 사용
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}
