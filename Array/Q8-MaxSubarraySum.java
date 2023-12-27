class Demo{
    public static void main(String[] args) {
        int arr[]={1,2,6,-3,4,};
        int curr=0;
        int max=Integer.MIN_VALUE; ;
        for (int i=0; i<arr.length; i++){
            curr+=arr[i];
            max=Math.max(max, curr);
            if (curr < 0) {
                curr = 0;
            }
        }
        System.out.println(max);
    }
}