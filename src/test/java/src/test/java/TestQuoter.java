package src.test.java;
import nl.utwente.di.bookQuote.*;
import org.junit.*;
public class TestQuoter {
    @Test
    public void testBook1() throws Exception {
        Quoter quoter = new Quoter();
        double price = quoter.getBookPrice("1");
        Assert.assertEquals("Price of book 1", 10.0, price, 0.0);
        price = quoter.getBookPrice("2");
        Assert.assertEquals("Price of book 2", 45.0, price, 0.0);
        price = quoter.getBookPrice("3");
        Assert.assertEquals("Price of book 3", 20.0, price, 0.0);
        price = quoter.getBookPrice("4");
        Assert.assertEquals("Price of book 4", 35.0, price, 0.0);
        price = quoter.getBookPrice("5");
        Assert.assertEquals("Price of book 5", 50.0, price, 0.0);
        price = quoter.getBookPrice("6");
        Assert.assertEquals("Price of book 6", 0.0, price, 0.0);
        price = quoter.getBookPrice(null);
        Assert.assertEquals("Price of book 6", 0.0, price, 0.0);
    }
}