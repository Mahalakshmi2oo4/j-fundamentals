class ternaryop{
    public static void main(String args[])
    {
        int a=10,b=23,c=58;
        int max1=(a>b)?a:b;
        System.out.println(max1);
        int max2=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println(max2);
    }
}