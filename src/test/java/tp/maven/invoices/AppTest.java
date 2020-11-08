package tp.maven.invoices;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

//very simple tests
public class AppTest 
{

    //test to see if invoices can be properly added to their list
    @Test
    public void addInvoicesTest()
    {
        Invoice inv1 = mock(Invoice.class);
        Invoice inv2 = mock(Invoice.class);
        Operations.invoices.add(inv1);
        Operations.invoices.add(inv2);

        assertEquals(Operations.invoices.size(), 2);
    }

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
