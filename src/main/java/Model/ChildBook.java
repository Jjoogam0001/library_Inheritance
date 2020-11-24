package Model;

public class ChildBook extends Book {

    private static ChildBook [] childBooks = new ChildBook[4];

    static {
        childBooks [0] = new ChildBook("Martin","Comic","1994");
        childBooks [1] = new ChildBook("Lenon","Romance","2018");
        childBooks [2] = new ChildBook("Richard","Thriller","2010");
        childBooks [3] = new ChildBook("Benny","Comic","200");
    }


    public ChildBook() {

    }


    public ChildBook(String author, String category, String year) {
        super(author, category, year );
    }


    public ChildBook [] getChildBooks(){

     return childBooks;
    }




}
