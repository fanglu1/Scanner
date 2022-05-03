import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String text = input.nextLine();
        System.out.println("Enter an integer: ");
        int text2 = Integer.valueOf(input.nextLine());
        System.out.println("Enter a double: ");
        double text3 = Double.valueOf(input.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean text4 = Boolean.valueOf(input.nextLine());

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + text2);
        System.out.println("Your double is " + text3);
        System.out.println("Your boolean is " + text4);

        input.close();
}
}