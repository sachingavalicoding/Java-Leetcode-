public class B07_SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.err.println(" Before Swapping A : " + a + " B : " + b);
        
        int temp = a;
        a = b ;
        b = temp;
        System.err.println(" After Swapping A : " + a + " B : " + b);
    }
}
