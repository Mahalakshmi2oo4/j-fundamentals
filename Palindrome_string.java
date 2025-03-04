public class Palindrome_string
{
	public static void main(String[] args) {
	    String s="mam";
	    String reverse="";
	    for(int i=s.length()-1;i>=0;i--){
	        reverse+=s.charAt(i);
	    }
	    if(s.equals(reverse)){
	        System.out.println("String:"+s+" is palindrome");
	    }
	    else{
	        System.out.println("String:"+s+" is not a palindrome");
	    }
	    StringBuffer str=new StringBuffer(s);
	    str.reverse();
	    if(s.equals(str.toString())){
	        System.out.println("StringBuffer:"+str+" is palindrome");
	    }
	    else{
	        System.out.println("StringBuffer:"+str+" is not a palindrome");
	    }
	    StringBuilder sr=new StringBuilder(s);
	    sr.reverse();
	    if(s.equals(sr.toString())){
	        System.out.println("StringBuilder:"+sr+" is palindrome");
	    }
	    else{
	        System.out.println("StringBuilder:"+sr+" is not a palindrome");
	    }
	}
}