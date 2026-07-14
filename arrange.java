
import java.util.Arrays;
import java.util.Scanner;




public class arrange {
    public static void main(String[] args) {
       Scanner take= new Scanner(System.in);
        int[] arr={21,32,54,47,79,45,56,67,23};
        for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j>=1;j--){
                 if(arr[j]<arr[j-1]){ 
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                 }
                 else break;
                }
           
        }
        System.out.println(Arrays.toString(arr));
    }
}
