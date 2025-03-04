public class Char_printing{
    public static void main(String args[]){
        String s="t6hj7ui";
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int count=c -'0';
                for(int j=0;j<count;j++){
                System.out.print(result);
            }
            result="";
            }
            else{
                result+=c;
                if(i==s.length()-1){
                    if(result!=""){
                        System.out.print(result);
                    }
                }
            }
        }
    }
}
