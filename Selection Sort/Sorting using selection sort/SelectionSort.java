public class SelectionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr={1,-3,10,2,13,12,40};
        print(arr);
        for(int x=0; x<arr.length-1; x++){
            int min=Integer.MAX_VALUE;
            int minIndex=Integer.MIN_VALUE;
            for(int i=x; i<arr.length; i++){
                if(arr[i]<min){
                    min=arr[i];
                    minIndex=i;
                }
            }
            int temp=arr[x];
            arr[x]=arr[minIndex];
            arr[minIndex]=temp;
        }
        print(arr);
    }
}
