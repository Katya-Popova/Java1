import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n Привет! Это программа\n для подбора ноутбука!");
        Set<Notebook> set=new HashSet<>();
        set.add(new Notebook(100, 16, 512, "Windows", "ASUS", "black"));
        set.add(new Notebook(101, 4, 256, "Windows", "Lenovo", "silver"));
        set.add(new Notebook(102, 32, 512, "Mac3", "Apple", "silver"));
        set.add(new Notebook(103, 8, 256, "Mac", "Apple", "silver"));
        set.add(new Notebook(104, 8, 512, "Windows", "ASUS", "black"));
        set.add(new Notebook(105, 4, 128, "Windows", "Lenovo", "blue"));
        Operation operation = new Operation(set);
        operation.start();
        System.out.println("\nБыло приятно иметь с вами дело!");
 
    }

    
}