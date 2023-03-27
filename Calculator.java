import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your Operation");
        System.out.println("1 for Addition");
        System.out.println("2 for Substraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");

        int read = input.nextInt();

        System.out.println("Enter Two Numbers");
        int x = input.nextInt();
        int y = input.nextInt();

        if (read == 1){
            System.out.println("The ansver is: " + add(x, y));
        } else if (read == 2) {
            System.out.println("The ansver is: " + sub(x, y));
        } else if (read == 3) {
            System.out.println("The ansver is: " + mul(x, y));
        } else if (read == 4) {
            System.out.println("The ansver is: " + div(x, y));
        } else {
            System.out.println("You're out of range!");
        }
    }
    public static int add(int x, int y){
        int result;
        result = x + y;
        return result;
    }

    public static int sub(int x, int y){
        int result;
        result = x - y;
        return result;
    }

    public static int mul(int x, int y){
        int result;
        result = x * y;
        return result;
    }

    public static int div(int x, int y){
        int result;
        result = x / y;
        return result;
    }
}