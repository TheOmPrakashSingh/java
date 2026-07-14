public class even_digit {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int check=0;
        for(int i=0;i<arr.length;i++){
            if(count(arr[i])%2==0) check++;

        }
        System.out.println("Total number having even digit are:"+check);
    }
    static int count(int num){
     if(num<0) num*=-1;
     return (int) Math.log10(num)+1;
    }
}
