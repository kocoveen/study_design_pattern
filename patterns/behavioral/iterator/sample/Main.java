package patterns.behavioral.iterator.sample;

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
        extracted(iterator);
        System.out.println();

        //확장 for 문 사용
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }

    private static <T> void extracted(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            T t = iterator.next();
            print(t);
        }
    }

    private static <T> void print(T t) {

    }
}
