import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();

        if ((num % 2) == 0){
            System.out.printf("Число " + num + " четное");
        }
        else System.out.printf("Число " + num + " нечетное");

    }
}