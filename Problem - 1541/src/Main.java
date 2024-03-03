import java.util.Scanner;

public class Main {
    public static void areaSize(int a, int b, int percentage) {

        int Area = a * b;
        double possible = Area/(percentage/100.0f);

        System.out.println((int)(Math.sqrt(possible)));
    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        while(true){

            int a = sc.nextInt();

            if(a == 0)
                break;

            int b = sc.nextInt();
            int c = sc.nextInt();

            areaSize(a,b,c);
        }

        sc.close();


    }
}