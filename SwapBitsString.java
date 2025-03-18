public class SwapBitsString {
    public static int swapBits(int num, int i, int j) {
        String binaryStr=String.format("%32s",Integer.toBinaryString(num)).replace(' ','0');
        StringBuilder binary=new StringBuilder(binaryStr);
        char bit1=binary.charAt(31-i);
        char bit2=binary.charAt(31-j);
        if (bit1 != bit2) {
            binary.setCharAt(31-i,bit2);
            binary.setCharAt(31-j,bit1);
        }
        return Integer.parseInt(binary.toString(),2);
    }
    public static void main(String[] args){
        int num=37; 
        int i=2,j=29; 
        int result=swapBits(num,i,j);
        System.out.println("Original: "+ String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0'));
        System.out.println("Modified: "+ String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));
    }
}