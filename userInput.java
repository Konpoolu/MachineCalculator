import java.util.Scanner;

public class userInput {
    // user integer input
    public static int integerInput(int low, int high) {
        Scanner input = new Scanner(System.in);
        int selection;

        while (true) {
            if (input.hasNextInt()) {
                selection = input.nextInt();
                if (selection >= low && selection <= high) {
                    break;
                }
            } else {
                input.next();
            }
            System.out.println("Nonvalid integer input, valid integers are between: " + low + " and " + high + ".");
        }

        return selection;
    }
}