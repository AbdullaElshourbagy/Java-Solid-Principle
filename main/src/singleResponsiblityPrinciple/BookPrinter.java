package singleResponsiblityPrinciple;

public class BookPrinter {


    void printTextToConsole(String text) {
        System.out.println(text);
    }

    void printTextWithDot(String text) {
        System.out.println(text+".");

    }

    void printTextWithSemiColon(String text) {
        System.out.println(text+";");

    }

    void printBookNameWithStringBookName(String bookName) {
        System.out.println("The Book Name: "+ bookName);

    }
}
