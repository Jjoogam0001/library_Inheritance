package Model;

public class Book {

    private String Author;
    private String Category;
    private String Year;
    private final int Pages;



    public Book(String author, String category, String year) {
        Author = author;
        Category = category;
        Year = year;
        Pages = 100;
    }

    public Book() {
        Pages = 100;
    }

    public String getAuthor() {
        return Author;
    }

    public String getCategory() {
        return Category;
    }

    public String getYear() {
        return Year;
    }

    public int getPages() {
        return Pages;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setYear(String year) {
        Year = year;
    }
}
