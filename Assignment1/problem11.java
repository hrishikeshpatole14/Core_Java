import java.util.Scanner;

public class problem11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character: ");

        // Take only first character of input
        char ch = sc.next().charAt(0);

        char prev = (char) (ch - 1);
        char next = (char) (ch + 1);

        System.out.println("The previous character is: " + prev);
        System.out.println("The next character is: " + next);

        sc.close();
    }
}
