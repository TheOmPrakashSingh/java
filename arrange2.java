
import java.util.Arrays;

public class arrange2 {
    public static void main(String[] args) {
        int[] arr ={23,12,27,34,45,49,83,25};
        int[] arr2=new int[arr.length];
        int len=arr.length;
        int count=1;
        int index=0;
        int i=0;
        int max=arr[0];
        while(count!=len+1){
            if(max<arr[i]) {
                max=arr[i];
                index=i;
                if(i==len-1){
                    arr2[len-count]=max;
                    max=arr[0];
                    arr[index]=0;
                    index=0;
                count++;i=0;}
                else i++;
            }
            else if(i==len-1){
                arr2[len-count]=max;
                 arr[index]=0;
                    index=0;
                    max=arr[0];
                count++;
                i=0;
            }
            else i++;
            
        }
        System.out.println(Arrays.toString(arr2));
    }
}
