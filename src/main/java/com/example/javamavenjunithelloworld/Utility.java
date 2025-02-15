import java.util.Scanner;

public class Utility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greet();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void greet() {
        System.out.println("Hi!,I'm Sai Nimmala");
    }
}