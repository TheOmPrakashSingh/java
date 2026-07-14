public class linear {
    public static void main(String[] args) {
        int arr[]={23 , 34, 43, 45, 67, 26};
        int target = 54;
        System.out.println(search(arr,target)?true:false);
    }
    static boolean search(int arr[],int target){
          if(arr.length==0){
            return false;
          }
            for(int element:arr){
                if(element==target) return true;
            }
             return false;
          }
    }

