//step find k  3 1 4 2 isme k=1 hoga kyonki abhi 42 ke aage 
//koi or nhi aa skta 4 se bda koi nhi hai lekin 142 ke aage kuch aa 
//skta kyonki abhi 2 hai arr me so k=1 ho jayega or 2 hoga next greater element 
//than k and step 3 is swap k =1 and 2 to get next permutation
//how find k  use loop n-2 se 0 tk 3 1 4 2 we use loop from 4 isliye n-2
//now if(nums[i] < nums[i+1])  i=k    this line compare i=4 i+1=2 then compare 1,4 and so on
// if(nums[i] > nums[k])  use this to find next greater element than k 
//now swap to get next permutation



class Solution {
    public void nextPermutation(int[] nums) {
      int n=nums.length;
      //k is breaking point
      int k=-1;
          for(int i = n-2; i >= 0 ; i--){
        if(nums[i] < nums[i+1]){
            k = i ;
            break;
        }
    }

    if(k == -1) reverse(nums, 0, n-1);
    else {
        for(int i = n - 1 ; i >= k; i--){
        if(nums[i] > nums[k]){
            swap(nums, i, k);
            break;
        }
    }     
    reverse(nums, k+1, n-1);
    }
}

public void swap(int[] arr, int  i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public void reverse(int[] arr, int i , int j){
    while(i <= j)
        swap(arr, i++, j--);
}  
    
}