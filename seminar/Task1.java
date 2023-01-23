//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.print("Введите число:");
    Integer n = x.nextInt();
    int resultsum = 0;
    for (int i = 1; i <= n; i++){
        resultsum = resultsum + i;
    }
    System.out.println("сумма чисел от 1 до "+ n + " равно: " + resultsum);
    int result = 1;
    for (int i = 1; i <= n; i++){
        result = result * i;
    }
    System.out.println("произведение чисел от 1 до "+ n + " равно: " + result);
    }
}