 //approaches we use two pointer
 //you can use 1-recursion 2-stack 3-built in methods 4- fast and slow
 
 //errors i forget start ++ and end --
 
 class Demo {
    static void Reverse(int[]arr, int start, int end){
while(start < end){
    int temp=arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
for(int value:arr)
System.out.print(value);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
Reverse(arr,0,arr.length-1);
    }
}
