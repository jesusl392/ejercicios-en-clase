import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rondas;
        int v_1 =1;
        int v_2=10;
        int dado_max=6;
        int dado_min=1;
        int res1=0;
        int res2=0;
        Random ale = new Random();
        rondas= ale.nextInt((v_2 - v_1 + 1)) + v_1;
        System.out.println("rondas" + rondas);
        System.out.println("______________________");
        for (int i=1; i<=rondas; i++){
            int r;
            r= ale.nextInt((dado_max - dado_min + 1)) + dado_min;
            System.out.println("dado 1 = " + r);
            res1 = r + res1;
            r= ale.nextInt((dado_max - dado_min + 1)) + dado_min;
            System.out.println("dado 2 = " + r);
            res2 = r + res2;
            System.out.println("-------------------");
        }
        System.out.println("dado 2 = " + res2 + "____ dado1= " + res1);
        if (res2 > res1){
            System.out.println("el dado 2 sumo mas");
        } else if (res1 > res2) {
            System.out.println("el dado 1 sumo mas");
        }else {
            System.out.println("sumaron lo mismo");
        }
    }
}