import java.util.Random;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        char sign;
        int a;
        int b;
        double res = 0;
        do {
            a = ale.nextInt((100 - 1 + 1)) + 1;
            b = ale.nextInt((100 - 1 + 1)) + 1;
            System.out.println("los numeros generados son: " + a + ", " + b);
            System.out.println("ingrese el signo para realizar la operacion");
            System.out.println("signos disponibles: + , - , * , / , % , ^ ");
            sign = sc.next().charAt(0);
            res = switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> (double) a / b;
                case '^' -> Math.pow(a, b);
                case '%' -> a % b;
                default -> res;
            };
            System.out.println("la respuesta es: " + res);
            System.out.println("\nseguir calculando? \n si: y\n no: n");
            char seguir;
            seguir = sc.next().charAt(0);
            if (seguir == 'y'){
                again = true;
            }
            else if (seguir == 'n'){
                again = false;
                System.out.println("gracias por usar el programa");
            } else {
                System.out.println("ingrese una opcion valida");
                break;
            }
        }while (again);
    }
}
