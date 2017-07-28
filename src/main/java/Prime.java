import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        int num = 1;
        int count = 1;
        int i;
        String loop = "y";

        System.out.println("This application will find you any prime, in order, from first prime number on");

        while (loop.equals("y")) {
            System.out.println("Which prime number are you looking for?");
            input = scnr.nextInt();
            System.out.println("The " + input + "th prime number is " + primeNumber(input));
            System.out.println("Do you want to find another prime number? (y/n)");
            scnr.nextLine();
            loop = scnr.nextLine();

        }

    }

    public static int primeNumber(int input) {
        int num = 1;
        int count = 1;
        int i;

        while (count < input + 1) {
            num += 1;

            for (i = 2; i < num + 1; i++) {
                if (num % i == 0) {
                    break;
                }

            }
            if (i == num) {
                count += 1;
            }
        }
        return num;
    }

}
