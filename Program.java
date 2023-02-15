
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите a: ");
        double a = iScanner.nextDouble();
        System.out.printf("Введите b: ");
        double b = iScanner.nextDouble();
        if (pow(a, b) == 0) {
            System.out.println("Не определено");
        } else {
            double c = pow(a, b);
            if (c%1!=0){
                System.out.print(c);
            } else {
                int res = (int)c;
                System.out.print(res);
            }
        }
        iScanner.close();
    }

    public static double pow(double value, double powValue) {
        double result = 1;
        if (powValue == 0) {
            return result;
        } else if (powValue < 0) {
            powValue = powValue * -1;
            for (int i = 1; i <= powValue; i++) {
                result = result * value;
            }
            return result = 1 / result;
        } else if (value == 0) {
            return result = 0;
        } else {
            for (int i = 1; i <= powValue; i++) {
                result = result * value;
            }
            return result;
        }
    }
}
