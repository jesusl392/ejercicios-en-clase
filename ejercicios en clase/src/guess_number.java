import java.util.Random;
import java.util.Scanner;
public class guess_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v_1=1;
        int v_2=50;
        int num;
        int guess;
        Random ale = new Random();
        num= ale.nextInt((v_2 - v_1 + 1)) + v_1;
        for (int i=2; i>=0; i--){
            System.out.println("trata de adivinar el numero entre el 1-50;  " + num);
            guess = sc.nextInt();
            if (i != 0 && guess < num ){
                System.out.println("el numero es mayor");
            } else if (i != 0 && guess > num) {
                System.out.println("el numero es menor");
            }else if (i != 0 && guess == num){
                System.out.println("ganaste");
                break;
            } else if (i == 0){
                System.out.println("este era tu ultimo intento, el numero era: " + num);

            }
        }
    }
}
