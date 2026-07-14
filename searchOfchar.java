public class searchOfchar{
    public static void main(String[] args) {
    char[][] arr={{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};    
    char target='s';
        boolean check=false;
        for (char[] arr1 : arr) {
            for (char arr2:arr1) {
                if (arr2== target) {
                    check=true;
                }
            }
        }
        System.out.println(check ?"character found" :"character not found");
    }
}