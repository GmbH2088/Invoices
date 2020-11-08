package tp.maven.invoices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Invoice
{
    int index;
    String customer;
    private final List<Record> records = new ArrayList<>();


    public Invoice(int index, String client)
    {
        this.index=index;
        this.customer=client;

        add();

        print_invoice();
    }

    public void add()
    {
        boolean ending=false;
        while (!ending)
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
            if(toEnd.equals("end")) { ending=true; }
        }
    }

    public String return_customer()
    {
        return customer;
    }

    public void print_invoice()
    {
        System.out.println("Invoice no " + index + " for customer " + customer);
        for(Record record: this.records) { record.print_record(); }
        System.out.print("\n");
    }

}
