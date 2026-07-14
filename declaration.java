
import java.util.Arrays;
import java.util.Scanner;



public class declaration {
    public static void main(String[] args) {
        Scanner take= new Scanner(System.in);
        // Syntax
        // datatype [] variable_name = new datatype[size];
       int[] roll_no = new int[5];
       System.out.println("Enter the Numbers:");
     for(int i=0;i<roll_no.length;i++){
            roll_no[i]=take.nextInt();
     }
    //    for(int num:roll_no){
    //     System.out.print(num+" ");
    //    }
    System.out.println(Arrays.toString(roll_no));
    }
}
