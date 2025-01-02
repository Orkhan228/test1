import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value for operand1:");
        double operand1 = scanner.nextDouble(); // Ispolzuyu tip double, tak kak normalniy kalkulator doljen resat i drobniye cisla
        boolean power = true; // Ispolzuyu peremennuyu bulevogo tipa dlya raboti s siklom While
        while (power) {
            System.out.println("Input value for operand2:");
            double operand2 = scanner.nextDouble();
            System.out.println("Choose the operation:");
            System.out.println("Operations: C(reset), S(power off), +, -, *, /");
            char operation = scanner.next().charAt(0);
            switch ( operation ) {
                case 'S':
                    power = false;
                    System.out.println("The calculator is powered off!");
                    break;
                case '+':
                     operand1 += operand2;
                    break;
                case '-':
                      operand1 -= operand2;
                    break;
                case '*':
                      operand1 *= operand2;
                    break;
                case '/':
                    if (operand2 != 0) {
                          operand1 /= operand2;
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case 'C':
                    operand1 = 0;
                    System.out.println("Result is reset!");
                    break;
                default:
                    System.out.println("You choose wrong operation!");
                    operand1 = 0;
            }
            System.out.println("Salam Aleykum" + operand1);
        }
    }
}