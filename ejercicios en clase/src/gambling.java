import java.util.Random;
import java.util.Scanner;

public class gambling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ale = new Random();
        int dinero;
        boolean seguir = true;
        int rand;
        int next;
        System.out.println("ingrese la cantidad de dinero que va a apostar");
        dinero = sc.nextInt();
        do{
            rand = ale.nextInt((3 - 1 + 1)) + 1;
            if (rand == 1){
                dinero = dinero*2;
                System.out.println("ganaste y duplicaste tu dinero, ahora tienes: " + dinero);
                System.out.println("seguir jugando?");
                System.out.println("si: 1     no: 2");
                next = sc.nextInt();
                if (next == 1){
                    System.out.println("sigue el juego...");
                }else if ( next == 2){
                    System.out.println("te llevaste: " + dinero);
                    seguir = false;
                }
            } else if (rand == 2) {
                dinero = dinero/2;
                System.out.println("perdiste la mitad de tu dinero, ahora tienes: " + dinero);
                System.out.println("seguir jugando?");
                System.out.println("si: 1     no: 2");
                next = sc.nextInt();
                if (next == 1){
                    System.out.println("sigue el juego...");
                }else if ( next == 2){
                    System.out.println("te llevaste:" + dinero);
                    seguir = false;
                }
            } else {
                dinero = 0;
                System.out.println("la suerte no te favorecio y perdiste todo");
                seguir = false;
            }
        }while (seguir);
    }
}
