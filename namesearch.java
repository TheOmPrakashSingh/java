 import java.util.*;
public class namesearch {
    public static void main(String[] args) {
        Scanner take= new Scanner(System.in);
        System.out.println("Enter the names : ");
        ArrayList<String> names =new ArrayList<>();
     while (true) { 
       String input=take.nextLine();
       if(input.isEmpty()){
        break;
       }  
       names.add(input);
     }
     System.out.println("Enter the name");
     String name=take.next();
     boolean check=names.contains(name);
     System.out.println(check ?"Found":"Not Found");

    }
  
    
}
