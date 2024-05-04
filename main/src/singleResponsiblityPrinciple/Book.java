package singleResponsiblityPrinciple;

public class Book {
    private String name;
    private String author;
    private String description;
    private int papersCount;

    public Book(String name, String author, String description, int papersCount) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.papersCount = papersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getPapersCount() {
        return papersCount;
    }

    public void setPapersCount(int papersCount) {
        this.papersCount = papersCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", papersCount=" + papersCount +
                '}';
    }

    // methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord){
        return description.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return description.contains(word);
    }
    public String findWordAndDeleteOnDescription(String word) {
        if (description.contains(word)) {
            description = description.replace(word, "");
        }
        return description;
    }
    public int getBookNameLettersCount(){
        return name.length();
    }



}
