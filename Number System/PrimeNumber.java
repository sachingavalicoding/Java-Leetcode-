public class PrimeNumber {
    public static void main(String[] args) {
        int n = 27;
        boolean isPrime = true;
        for(int i = 2; i < n ; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println( " Prime number ");
        }
        else{
            System.out.println(" not a Prime Number ");
        }
    }
}
