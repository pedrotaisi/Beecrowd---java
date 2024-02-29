import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[20];

        //variaveis para acessar a primeira e ultima posicao do vetor respectivamente
        int a = 0;
        int b = 19;

        //variavel auxiliar
        int aux;

        //lendo vaolres do vetor
        for (int i = 0; i < 20; i++)
            vect[i] = sc.nextInt();

        do {
            aux = vect[b];
            vect[b] = vect[a];
            vect[a] = aux;

            //atualizando a e b
            a++;
            b--;
        } while (a < b);


        // imprimindo valores do vetor
        for (int i = 0; i < 20; i++)
            System.out.println("N[" + i + "] = " + vect[i]);


        sc.close();

    }
}