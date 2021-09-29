import java.util.Scanner;
public class EndlessStrings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        System.out.println("Enter word");
        userInput = keyboard.nextLine();
        while (userInput.length() > 0) {
            System.out.println(userInput.toUpperCase());
            System.out.println("Enter word");
            userInput = keyboard.nextLine();
        }
    }
}
