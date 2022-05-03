import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");

        input.nextLine();

        System.out.println("Wow - Interesing. Tell me more about yourself!");

        input.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");

        input.close();
    }
}
