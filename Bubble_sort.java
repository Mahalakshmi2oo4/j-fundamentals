class Bubble_sort{
    public static void main(String args[]){
        int arr[]={10,6,7,11,3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int num:arr)
        System.out.print(num+" ");
    }
}