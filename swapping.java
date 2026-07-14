

import java.util.Scanner;
import java.util.Arrays;
public class swapping {
    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        int[] arr =new int[6];
        System.out.println("Enter array Numbers:");
        for(int i=0;i<6;i++){
            arr[i]=take.nextInt();
        }
        for(int i=0,j=arr.length-1;i<j;i++,j--){
              int temp=arr[i];
                arr[i]=arr[j];
                    arr[j]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
