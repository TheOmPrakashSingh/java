
import java.util.*;

public class searchofword {
    public static void main(String[] args) {
        Scanner take= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String ch=take.next();
        System.out.print("Enter the word: ");
        char word=take.next().charAt(0);
         String n=search(ch,word);
         if(n.length()==0 ||n.charAt(0)==-1){
            System.out.println("What not found");
         }
         else{
            for(int i=0;i<n.length();i++){
                System.out.println("Match found at "+n.charAt(i));
            }
         }
    }
    static String search(String arr,char word){
        if(arr.length()==0) return "-1";
        String result="";
        int check=0;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)==word && check==0){ 
                result+=(i+1);
                check++;
                   }
            else if(arr.charAt(i)==word){
                result=result+(i+1);
            }
            
        }
        return result;
    }
}
