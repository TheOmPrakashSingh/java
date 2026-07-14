public class recursionlinear {
    public static void main(String[] args) {
        int[] arr={23,34,22,53,64,26,74};
        int check=22;
        int index=0;
        System.out.println(search(arr,check,index) ?"Found":"Not Found");
    }
    static boolean search(int[] arr,int check,int index){
        if(arr[index]==check) return true;
        if(index==arr.length) return false;
        return search(arr,check,index+1);
    }
}
