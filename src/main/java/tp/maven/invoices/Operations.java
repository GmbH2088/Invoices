package tp.maven.invoices;

import java.util.ArrayList;
import java.util.List;

//Performs operations on Invoices as requested by App
//GRASP Indirection, Controller
public class Operations
{
    static List<Invoice> invoices = new ArrayList<>();   //Stores invoices
    private static int listindex = 1;   //auto increments to use as next invoices index

    //Creates new Invoice and adds items to it
    //GRASP Creator
    public static void add(final String customer)
    {
        Invoice invoice = new Invoice(listindex, customer); //create new invoice
        invoice.add();  //add records to it
        invoices.add(invoice);  //add new invoice to the list
        listindex = listindex + 1;  //increment index for next invoice
    }

    //used to print contents of a specific customers invoices
    //GRASP information expert
    public static void view(final String customer)
    {
        for (Invoice invoice: invoices)
        {
            if (customer.equals(invoice.returnCustomer())) { invoice.printInvoice(); }
        }
    }
}
