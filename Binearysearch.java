public class Binearysearch {
    public static void main(String[] args) {
        int[] arr={12,14,16,23,43,45,56,67,89};
        int target=34;
        int first=0;
        int last=arr.length-1;
        int result=binearysearch(arr,first,last,target);
        System.out.println(result >=0?"Index Number is: "+result:"Not found");
    }
    static int binearysearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target) return mid ;
            if(arr[start]<arr[end]){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
