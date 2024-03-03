import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        while(sc.hasNext()){
            int number = sc.nextInt();
            String mens = (number == 0) ? "vai ter copa!" : "vai ter duas!";
            System.out.println(mens);

        }

        sc.close();
    }
}