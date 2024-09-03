public class SumOfEvenNum {
    public static void main(String[] args) {
        int n = 10;
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i <= n ; i++){
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
            else{
                oddSum += i;
            }
        }
        System.out.println(" even Sum 1 to N is " + evenSum);
        System.out.println(" odd Sum 1 to N is " + oddSum);
    }
}
