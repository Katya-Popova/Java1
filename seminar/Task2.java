//Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i=i+1) {
            boolean isPrimeNumber = true;

            for (int j = 3; j < i; j=j+2) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
   }
}
