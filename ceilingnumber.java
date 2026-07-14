public class ceilingnumber {
    public static void main(String[] args) {
        int[] arr={23,37,42,47,58,63,67};
        int check=59;
        int result=search(arr,check);
        System.out.println("The ceiling number is:"+result);
        
    }
    static int search(int[] arr,int check){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==check) return arr[mid];
            else if(arr[mid]<check){
                    start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       return arr[start];
    }

}
