package ru.netology;

public class Book {
    public String title;
    public int relaseYear;
    Author author;
    public int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle(){
        StringBuilder fullTitle = new StringBuilder();
        fullTitle.append(title)
                .append(", ")
                .append(relaseYear);
        return fullTitle.toString();
    }

    public boolean isBig() {
        return (pages > 500);
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) ||author.surname.contains(word);
    }

    public int estimatePrice (int rating){
        int price = (pages * 3)*(int)Math.floor(Math.sqrt(rating));
        return Math.max(price, 250);
    }
}
