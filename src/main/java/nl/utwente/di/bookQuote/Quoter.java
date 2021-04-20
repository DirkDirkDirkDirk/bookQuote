package nl.utwente.di.bookQuote;

public class Quoter {


    public double getBookPrice(String isbn) {
        double price = 0.0;

        isbn = (isbn == null) ? "" : isbn;
        switch (isbn){
            case "1":
                price = 10;
                break;
            case "2":
                price = 45;
                break;
            case "3":
                price = 20;
                break;
            case "4":
                price = 35;
                break;
            case "5":
                price = 50;
                break;
            default :
                price = 0;
        }
        return price;
    }
}
