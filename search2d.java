import java.util.Arrays;
public class search2d {
    public static void main(String[] args) {
        int[][] arr={
            {12,32,43,47,28},
            {72,5,34,56},
            {32,45,3,67,88,36,367,45,2},
            {23,23},
               };
               int target=67;
               int[] result=search(arr,target);
               System.out.println(Arrays.toString(result));

    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
