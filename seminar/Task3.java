//Реализовать простой калькулятор 
/**
 * Task3
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer num1 = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("Введите оператор: ");
        String op = y.nextLine();
        Scanner z = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer num2 = z.nextInt();
        Integer result=0;

        switch(op){
            case "+":
            result=num1 + num2; 
            break;
            case "-":
            result=num1 - num2; 
            break;
            case "*":
            result=num1 * num2; 
            break;
            case "/":
            result=num1 / num2; 
            break;
        }

        // if (op.equals("+")) {
        //     result=num1 + num2; 
        // } else if (op.equals("-")) {
        //     result=num1 - num2; 
        // } else if (op.equals("*")) {
        //     result=num1 * num2; 
        // } else if (op.equals("/")) {
        //     result=num1 / num2; 
        // }

        System.out.println(num1+ op + num2 + "=" + result);
    }

}
