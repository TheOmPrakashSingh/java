
import java.util.ArrayList;
import java.util.Scanner;
import jdk.jshell.spi.ExecutionControl;



public class arraylist {
    public static void main(String[] args) {
        Scanner take= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(123);
        list.add(234);
        list.add(3499);
        list.add(878);
        list.add(344);
        System.out.println(list);
        list.set(0,23);
        list.set(4,2353);
        System.out.println(list);
        list.addFirst(234);
        System.out.println(list);
        System.out.print(list.size());
   
        
    }
}
