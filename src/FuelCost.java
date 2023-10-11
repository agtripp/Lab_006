import java.util.Scanner;

public class FuelCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gasInTank = 0;
        double milesPerGallon = 0;
        double dollarsPerGallon = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " and is not a valid number.");
            }
        }while(!done);
        done = false;

        do {
            System.out.print("MPG: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " and is not a valid number.");
            }
        }while(!done);
        done = false;

        do {
            System.out.print("Price of gas per gallon: ");
            if (in.hasNextDouble()) {
                dollarsPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " and is not a valid number.");
            }
        }while(!done);
        done = false;
        System.out.println("Cost to go 100 miles is " + (dollarsPerGallon * (100/milesPerGallon)) + " dollars.");
        System.out.println("With your current tank, you can go " + (gasInTank * milesPerGallon) + " miles.");
    }
}