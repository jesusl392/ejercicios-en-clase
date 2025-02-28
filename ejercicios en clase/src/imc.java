import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso;
        float alt;
        System.out.println("ingrese la altura");
        alt = sc.nextFloat();
        System.out.println("ingrese el peso");
        peso = sc.nextFloat();
        float imc = peso/(alt*alt);
        if (imc<18.5){
            System.out.println("bajo peso");
        } else if (imc>18.5 && imc<24.9) {
            System.out.println("peso normal");
        } else if (imc>25 && imc<26.9) {
            System.out.println("sobrepeso");
        }else if (imc>27 && imc<29.9) {
            System.out.println("sobrepeso tipo 2");
        }else if (imc>30 && imc<34.9) {
            System.out.println("obesidad");
        }else if (imc>35 && imc<39.9) {
            System.out.println("obesidad tipo 2");
        }else if (imc>40 && imc<49.9) {
            System.out.println("obesidad tipo 3 (morbida)");
        }else if (imc>50){
            System.out.println("obesidad tipo 4 (extrema)");
        }
    }
}

