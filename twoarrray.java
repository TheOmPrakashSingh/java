import java.util.Arrays;
import java.util.Scanner;

public class twoarrray {
    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
       int[][] arr=new int[3][3];
       for(int i=0;i<arr.length;i++){
        System.out.println("Enter the Row Numbers :");
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=take.nextInt();
        }
    }
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
       }
}
