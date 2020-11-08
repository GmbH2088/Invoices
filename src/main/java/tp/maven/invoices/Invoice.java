package tp.maven.invoices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class representing invoice
//GRASP Creator
public class Invoice
{
    private final int index;  //stores index
    private final String customer;    //stores customer name
    private final List<Record> records = new ArrayList<>(); //stores records in invoice

    //sets fields for new invoice
    public Invoice(final int i, final String client)
    {
        this.index = i;
        this.customer = client;
    }

    //creates records for invoice
    public void add()
    {
        boolean ending = false;   //flag to finish adding records
        while (!ending) //loop for adding records
        {
            Scanner myScan = new Scanner(System.in);

            System.out.println("Input product name:");
            String product = myScan.nextLine();
            System.out.println("Input amount:");
            int amount = Integer.parseInt(myScan.nextLine());
            System.out.println("Input price:");
            float price = Float.parseFloat(myScan.nextLine());

            Record record = new Record(product, amount, price);
            records.add(record);

            System.out.println("Type 'end' to finish adding products.");
            String toEnd = myScan.nextLine();
            if (toEnd.equals("end")) { ending = true; }
        }
    }

    //used to return customer for purposes of finding invoices by their customer
    public String returnCustomer()
    {
        return customer;
    }

    //used to print records from this invoice
    //GRASP Information expert
    public void printInvoice()
    {
        System.out.println("Invoice no " + index + " for customer " + customer);
        for (Record record: this.records) { record.printRecord(); }
        System.out.print("\n");
    }

}
