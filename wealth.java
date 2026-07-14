public class wealth {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {2,6,3,8},
            {4,3,7,5},
        };
        int wealth=counter(arr);
        System.out.println("Wealth is : "+wealth);
    }
    static int counter(int[][] arr){
        int max=0;
        for(int[] num:arr){
            int total=0;
            for(int num2:num){
               total+=num2;
            }
            if(total>max) max=total;
        }
        return max;
    }
}
