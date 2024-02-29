import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double[] vect = new double[100];

        for (int i = 0; i < 100; i++) {
            vect[i] = number;
            number = number/2;
        }

        for (int i = 0; i < 100; i++)
            System.out.println("N[" + i + "] = " + String.format("%.4f",vect[i]));

        sc.close();

    }
}