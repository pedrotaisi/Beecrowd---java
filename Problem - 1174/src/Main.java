import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vect =  new double[100];

        for(int i = 0; i < 100; i++){

            vect[i] = sc.nextDouble();

            if(vect[i] <= 10){

                //imprime a saida com uma casa decimal
                System.out.println("A[" + i + "] = " + String.format("%.1f", vect[i]));
            }
        }

        sc.close();
    }
}