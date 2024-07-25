package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 999);
        Book evgenyOnegin = new Book("Evgeny Onegin", 99);
        Book redHat = new Book("Red Hat", 9);
        Book cleanCode = new Book("Clean Code", 1);
        Book[] books = new Book[4];
        books[0] = warAndPeace;
        books[1] = evgenyOnegin;
        books[2] = redHat;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPagesCount());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPagesCount());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPagesCount());
            }
        }
    }
}
