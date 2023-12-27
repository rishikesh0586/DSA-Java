
class GFG{
 
static int maxtwobuysell(int arr[],int size) {
    int first_buy = Integer.MIN_VALUE;
      int profit1= 0;
      int second_buy = Integer.MIN_VALUE;
      int totalprofit = 0;
       
      for(int i = 0; i < size; i++) {
         
          first_buy = Math.max(first_buy,-arr[i]); 
          profit1 = Math.max(profit1,first_buy+arr[i]); 
          second_buy = Math.max(second_buy,profit1-arr[i]);
          totalprofit= Math.max(totalprofit,second_buy+arr[i]);
       
    }
     return totalprofit;
}
}