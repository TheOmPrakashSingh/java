public class steps {
    public static void main(String[] args) {
        int a=16;
        int b=16;
        int c=16;
        int counter=0;
        while(true){
            if(a==0 || b==0 || c==0) break;
            else {
           
            if(a==b && a>c){
               b=b-1;
               a=a-1;
            counter++;
           }
           else if (a==b && a<c){
            c=c-1;
            a=a-1;
            counter++;
           }
           else if(b==c && b<a){
               a=a-1;
               c=c-1;
            counter++;
           }
           else if(b==c && b>a){
            b=b-1;
            c=c-1;
            counter++;
           }
           else if(a==c && a<b){
            a=a-1;
            b=b-1;
            counter++;
           }
           else if(a==c && a>b){
            c=c-1;
            a=a-1;
            counter++;
           }
           else if(a<b && a<c){
             if(b<c){
                int gap=b-a;
                counter+=gap;
                b=a;
                c=c-gap;
            }
            else{
                int gap=c-a;
                counter+=gap;
                c=a;
                b=b-gap;
            }
        }
            
             else if(b<c && b<a){
               if(a<c){
                int gap=a-b;
                counter+=gap;
                a=b;
                c=c-gap;
            }
            else{
                int gap=c-b;
                counter+=gap;
                c=b;
                a=a-gap;
            }
            }
           else if(c<a && c<b){
            if(a<b){
                int gap=a-c;
                counter+=gap;
                a=c;
                b=b-gap;
            }
            else{
                int gap=b-c;
                counter+=gap;
                b=c;
                a=a-gap;
            }
           }
            else if(a==b && a==c){
            a=a-1;
            b=b-1;
            counter++;
           }
        }

        }
        System.out.println("total step:"+counter);
    }
}
