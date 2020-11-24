package Model;

import org.junit.Assert;
import org.junit.Test;



public class ChildBookTest {
    ChildBook childBook = new ChildBook();

    @Test
    public void getChildBooks() {
        int expected = 4;
        int actual = childBook.getChildBooks().length;
        Assert.assertEquals(expected,actual);
    }
}