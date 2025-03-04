import java.util.*;
class Reverse_line_of_strings{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.nextLine();
        String result="";
        String reverse="";
         for(int i=str.length()-1;i>=0;i--){
           char c=str.charAt(i);
            if(c==' '){
                if(!result.isEmpty()){
                    reverse+=result+" ";
                    result="";
                }
         }
            else{
            result=c+result;
            }
         }
         if(!result.isEmpty()){
             reverse+=result;
         }
         System.out.print(reverse);
    }
}