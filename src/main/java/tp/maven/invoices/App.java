package tp.maven.invoices;
import java.util.*;


public class App
{
    private static boolean exiting = false;

    public static void main(final String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        while (!exiting) //loop for creating and working on invoices
        {
            System.out.println("Select action:\n1. add - add a new invoice\n2. view - view invoices for client\n3. exit - exit program");
            String action = myScan.nextLine();

            switch (action) //actions described in println above
            {
                case "add":
                    System.out.println("Input customer:");
                    String customer = myScan.nextLine();
                    Operations.add(customer);
                    break;
                case "view":
                    System.out.println("Input customer:");
                    String client = myScan.nextLine();
                    Operations.view(client);
                    break;
                case "exit":
                    exiting = true;
                    break;
                default:
                    System.out.println("Unrecognized action\n");
            }

        }
    }
}
