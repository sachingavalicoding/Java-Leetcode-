public class FactorTralingZero {
    public static void main(String[] args) {
        long num = 10;
        long fact = 1;
        int count = 0;
        for (long i = 1; i <= num; i++) {
            fact *=  i;
			System.out.println(i + " = " + fact);
        }
        while (fact != 0 && (fact % 10 ) == 0) {
            fact = fact / 10;
            count++;
        }
        System.out.println(count);
    }
}
