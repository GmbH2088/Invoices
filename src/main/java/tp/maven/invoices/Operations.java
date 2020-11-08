package tp.maven.invoices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations
{
    static Scanner newScan = new Scanner(System.in);
    private static final List<Invoice> invoices= new ArrayList<>();
    static int listindex = 1;

    public static void add()
    {
        System.out.println("Input customer:");
        String customer = newScan.nextLine();
        Invoice invoice = new Invoice(listindex, customer);
        invoices.add(invoice);
        listindex = listindex + 1;
    }

    public static void view()
    {
        System.out.println("Input customer:");
        String customer = newScan.nextLine();

        for(Invoice invoice: invoices)
        {
            if(customer.equals(invoice.return_customer())) { invoice.print_invoice(); }
        }
    }
}
