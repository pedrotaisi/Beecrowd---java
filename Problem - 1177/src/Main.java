import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[1000];
        int number = sc.nextInt();
        int aux = 0;


        for (int i = 0; i < 1000; i++) {

            if (aux == number)
                aux = 0;

            vect[i] = aux;
            aux++;
        }

        for (int i = 0; i < 1000; i++)
            System.out.println("N[" + i + "] = " + vect[i]);

        sc.close();


    }
}