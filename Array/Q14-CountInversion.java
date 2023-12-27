//brute force solution
// static int getInvCount(int n)
//     {
//         int inv_count = 0;
//         for (int i = 0; i < n - 1; i++)
//             for (int j = i + 1; j < n; j++)
//                 if (arr[i] > arr[j])
//                     inv_count++;
 
//         return inv_count;
//     }



//using merge sort 

// step1- make global var in merge class private static long inversionCount = 0;  
//step2-  merge function ke else condition me add inversionCount += (mid - idx1 + 1);
// //step3- public static long getInversionCount() {
//         return inversionCount;
//     }
//step 4 call this method using class name.getInversionCount