package Model;

import org.junit.Assert;
import org.junit.Test;



public class TeenageBookTest {

     TeenageBook teenageBook = new TeenageBook("Martin","Comic","1994","Hell and Back");;

    @Test
    public void getTitle() {

        String expected = "Hell and Back";
        String actual = teenageBook.getTitle();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTeenBooks() {
        int expected = 4;
        int actual = teenageBook.getTeenBooks().length;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void searchTeenageBook() {
        String expected = teenageBook.getYear() + teenageBook.getAuthor();
        String actual = teenageBook.searchTeenageBook("Hell and Back");
        Assert.assertEquals(expected,actual);

    }
}