public class Substring{
    public static void main(String args[]){
        String s="hello world";
        String sub=s.substring(0,5);
        System.out.println("Substring from String object:"+sub);
        StringBuffer str=new StringBuffer(s);
        String subBuffer=str.substring(6,11);
        System.out.println("Substring from StringBuffer:"+subBuffer);
        StringBuilder sr=new StringBuilder(s);
        String subBuilder=sr.substring(1,9);
        System.out.println("Substring from StringBuider:"+subBuilder);
    }
}
