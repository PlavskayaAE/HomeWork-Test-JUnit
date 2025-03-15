package ru.netology;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Джоан ", "Роулинг", 4);

        Book book = new Book();
        book.title= "Гарри поттер и философский камень";
        book.relaseYear = 1995;
        book.pages = 100;
        book.author = author;

        System.out.println(book.getFullTitle());
        System.out.println(book.isBig());
        System.out.println(book.matches("камень"));
        System.out.println(book.estimatePrice(author.rating));
    }
}

