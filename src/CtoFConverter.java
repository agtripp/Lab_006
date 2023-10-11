import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cTemp = 0;
        int fTemp = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temp in Celcius: ");
            if (in.hasNextInt()) {
                cTemp = in.nextInt();
                fTemp = (cTemp * 9/5) + 32;
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You put " + trash + " and is not a valid temp.");
            }
        }while(!done);
        System.out.println(cTemp + " Your degrees in Celcius is " + fTemp + " degrees Farenhight");
    }
}