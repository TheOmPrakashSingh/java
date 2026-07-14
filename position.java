import java.util.*;
public class position {
    public static void main(String[] args) {
        int[] arr={1,3,4,4,4,4,4,5,7,10};
        int number=4;
       boolean findStartindex=true;
        int start=search(arr,number, findStartindex);
        int end=search(arr,number, !findStartindex);
        int ans[]={-1,-1};
        ans[0]=start+1;
        ans[1]=end+1;
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] arr,int target,boolean findStartindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findStartindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
