package singleResponsiblityPrinciple;

public class Test {

    public static void main(String[] args) {
        // Class to manipulate the book properties
        Book book = new Book("Java Solid Principle", "JavaT Point", "Description for Java", 150);
        System.out.println(book.replaceWordInText("for", "on"));
        System.out.println(book.isWordInText("for"));
        System.out.println(book.getBookNameLettersCount());

        // Class to manage the printing for book properties
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printTextToConsole(book.getName());
        bookPrinter.printTextWithDot(book.getName());
        bookPrinter.printTextWithSemiColon(book.getName());
        bookPrinter.printBookNameWithStringBookName(book.getName());
    }
}
