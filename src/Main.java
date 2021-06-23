import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number 1-10 or I - X :");
        String inputStr = scanner.nextLine();
        Calculator calculator = new Calculator(new Parser(inputStr));
        System.out.println("Output \n" + calculator.printResult());

    }
}
