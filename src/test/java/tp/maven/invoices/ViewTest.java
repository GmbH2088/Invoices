package tp.maven.invoices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViewTest
{
    //test to see if searching invoices by customer name works properly
    @Test
    public void viewInvoicesTest()
    {
        Invoice inv1 = new Invoice(1, "adam");
        Operations.invoices.add(inv1);
        Invoice inv2 = new Invoice(2, "pawel");
        Operations.invoices.add(inv2);
        Invoice inv3 = new Invoice(3, "adam");
        Operations.invoices.add(inv3);

        int count = 0;
        for(Invoice invoice: Operations.invoices)
        {
            if("adam".equals(invoice.returnCustomer())) { invoice.printInvoice(); count = count+1; }
        }

        assertEquals(count, 2);
    }
}
