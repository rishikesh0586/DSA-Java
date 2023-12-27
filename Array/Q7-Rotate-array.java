/**
 * Demo
 */
 class Demo {
    static void Reverse(int[]arr, int start, int end){
        while(start < end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int k=1;
        k=k%n;
Reverse(arr, 0,n-1);
Reverse(arr, 0,k-1);
Reverse(arr, k,n-1);
for(int elem:arr) {
    System.out.print(elem);
}
    }
}