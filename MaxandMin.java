public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {32,48,-23,39,94,-84};
        int[]arr2=search(arr);
        System.out.println("Maximum is "+arr2[0]+" and Minimum is"+arr2[1]);
           
    }
    static int[] search(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        return new int[]{max,min};
    }
}
