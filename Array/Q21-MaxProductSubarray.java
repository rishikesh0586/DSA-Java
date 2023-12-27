class Solution {
    long maxProduct(int[] arr, int n) {
         long ans=arr[0];
        long max=ans;
        long min=ans;
         for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                long temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],max*arr[i]);
            min=Math.min(arr[i],min*arr[i]);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}