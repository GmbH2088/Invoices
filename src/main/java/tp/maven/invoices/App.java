package tp.maven.invoices;
import java.util.*;


public class App
{
    static boolean exiting = false;

    public static void main( String[] args )
    {
        Scanner myScan = new Scanner(System.in);
        while(!exiting)
        {
            System.out.println("Select action:\n1. add - add a new invoice\n2. view - view invoices for client\n3. exit - exit program");
            String action = myScan.nextLine();

            switch (action)
            {
                case "add":
                    Operations.add();
                    break;
                case "view":
                    Operations.view();
                    break;
                case "exit":
                    exiting=true;
                    break;
                default:
                    System.out.println("Unrecognized action\n");
            }

        }
    }
}
