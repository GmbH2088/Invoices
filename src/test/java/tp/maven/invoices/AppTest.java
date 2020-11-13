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
}
