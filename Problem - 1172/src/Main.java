import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vect = new int[10];

        for(int i = 0; i < 10; i++) {
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            int number = (vect[i] <= 0) ? 1 : vect[i];
            System.out.println("X[" + i + "] = " + number);
        }

        sc.close();
    }
}