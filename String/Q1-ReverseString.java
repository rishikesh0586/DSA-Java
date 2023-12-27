 //reverse string  visit 1
 //method 1 use char array and two pointer while left<right swap(left,right)
 //method 2 stringbuilder.reverse();
 
 class Demo {


    public static void main(String[] args) {
        char[] str={'a', 'b', 'c', 'd', 'e',};
        //reverse logic two pointers
        int left =0;
        int right =str.length-1;
        while(left < right){
            char temp= str[left];
            str[left] = str[right];
str[right]=temp;
left++;
right--;
        }
        System.out.println(str);
    }
}
