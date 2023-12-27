public class Recursion {
    static int Demo(){
        int n=10;
        if(n==0){
            return 0;
        }
System.out.println("hello world");
n--;
return Demo();
    }
    public static void main(String[] args) {
        Recursion.Demo();
    }
}
