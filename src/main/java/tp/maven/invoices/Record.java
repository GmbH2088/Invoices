package tp.maven.invoices;

//Stores item in invoice
public class Record
{
    private final String product;   //product name
    private final int amount;   //amount of product
    private final float price;  //price per unit

    //sets the fields for Record
    public Record(final String pro, final int a, final float prc)
    {
        this.product = pro;
        this.amount = a;
        this.price = prc;
    }

    //prints record at request
    public void printRecord()
    {
        System.out.println(product + " " + amount + " " + price);
    }
}
