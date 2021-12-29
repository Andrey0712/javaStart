package program;

import lombok.Data;



@Data
public class Book {


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
    private String name;
    private String author;
    private String publishing;
    private String genre;
    private int year;
    private int pages;

    public Book(String name,String author,String publishing,String genre,int year,int pages){
        this.name=name;
        this.author=author;
        this.genre=genre;
        this.publishing=publishing;
        this.year= year;
        this.pages=pages;

    }

}
