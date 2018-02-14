import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int mpgRating;
        double tankCapacity;
        double percentGasTankFilled;
        int rawRange;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpgRating = input.nextInt();
        if (mpgRating <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }
        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        tankCapacity = input.nextDouble();
        if (tankCapacity <= 0) {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }
        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        percentGasTankFilled = input.nextDouble();
        if (percentGasTankFilled < 0 || percentGasTankFilled > 100) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }
        if (mpgRating > 0 && tankCapacity >0 && percentGasTankFilled >= 0 && percentGasTankFilled <= 100) {
            rawRange = (int)(mpgRating * tankCapacity * (percentGasTankFilled * 0.01));
            if (rawRange <= 25) {
                System.out.print("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
            } else {

                System.out.print("Keep driving! Your current estimated range is: " + rawRange + " miles!");
            }
        }
    }
}
