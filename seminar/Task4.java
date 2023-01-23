// Дополнительно*+ Задано уравнение вида x + y = z. И (x, y, z) >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.Вывод 24 + 45 = 69
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Введите уравнение вида x + y = z, через пробел. ");
        String op = y.nextLine();
    
        op=op.replace('?','0'); // заменили ? на 0
        String [] primer = op.split(" "); // сделали массив
        int a= Integer.parseInt(primer[0]);
        int b= Integer.parseInt(primer[2]);
        int c= Integer.parseInt(primer[4]);
        int result = (c-a-b);
        System.out.println(" Под знаком вопроса стоит цифра: ");
        if (result%11 == 0){
            System.out.println(result/11);
        }
        else if (result%20 == 0){
            System.out.println(result/20);
        }
        else if (result<20 && result%2==0){
            System.out.println(result/2);
        }   
        else {
            System.out.println("Решения нет");
        }
      
       

        
        
        

    }
}
