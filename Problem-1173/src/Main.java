import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];
        vect[0] = sc.nextInt();

        for(int i = 1; i < 10; i++)
            vect[i] = vect[i-1]*2;

        for(int i = 0; i < 10; i++)
            System.out.println("N[" + i + "] = " + vect[i]);

        sc.close();
    }
}