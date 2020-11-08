package tp.maven.invoices;

public class Record
{
    private final String product;
    private final int amount;
    private final float price;

    public Record(String product, int amount, float price)
    {
        this.product=product;
        this.amount=amount;
        this.price=price;
    }

    public void print_record()
    {
        System.out.println(product + " " + amount + " " + price);
    }
}
