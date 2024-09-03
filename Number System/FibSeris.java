public class FibSeris {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int n = 20;
        for(int i = 0; i <= n ; i++){
           num3 = num1 + num2;
           System.out.print(num1 + " ");
           num1 = num2;
           num2 = num3;
        }
    }
}
