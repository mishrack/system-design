package solid.principle;

public class SingleResponsibility {
    /**
     * A class should have only one reason to change
     * Each class should have methods which are related to single objective
     */
}
// Marker Entity
class Marker {
    String name;
    String colour;
    int year ;
    int price ;

    public Marker(String name, String colour, int year, int price) {
        this.name = name;
        this.colour = colour;
        this.year = year;
        this.price = price;
    }
}

class Invoice{
    Marker marker ;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (this.marker.price)*(this.quantity);
        return  price ;
    }
}
class InvoiceDao{
    Invoice invoice ;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveVoice(){
        // save invoice into DB
    }
}
class PrintInvoice{
    Invoice invoice ;

    public PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public void printInvoice(){
        // print the invoice details here
    }
}

