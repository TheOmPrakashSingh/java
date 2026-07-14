public class floorNumber {
    public static void main(String[] args) {
        int[] arr={23,27,34,54,65,76,92};
        int target=12;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
         if(target<arr[0]) return -1;
         if(target>arr[arr.length-1]) return arr[arr.length-1];
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+((end-start)/2);
                if(arr[mid]==target) return arr[mid];
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            return arr[end];
    }
}
