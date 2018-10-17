package GuessingGame;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessInt();
        AI();
    }

    public static void guessInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess my secret number: ");
        int num = 2;
        int guess = input.nextInt();
        while (!(num == guess)) {
            if ((num == guess)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
                guess = input.nextInt();
            }
        }
    }

    public static void AI()
    {
        Scanner input = new Scanner(System.in);
        int max = 100;
        int newnum = max/2;
        int min = 0;
        int index = 0;
        System.out.println("Is your number " + newnum + " or greater or lower?");
        while (!(input.nextLine().equals("correct")))
        {
            if (input.nextLine().equals("lower"))
            {
                max = newnum;
                newnum = (min + newnum) / 2;
                System.out.println("Is your number " + newnum + " or greater or lower?");
                input = new Scanner(System.in);
                index = index + 1;
            }

            if (input.nextLine().equals("higher"))
            {
                min = newnum;
                newnum = (newnum + max) / 2;
                System.out.println("Is your number " + newnum + " or greater or lower?");
                input = new Scanner(System.in);
                index = index + 1;
            }

        }
        System.out.println("The number is " + newnum + "!");
    }
    }

