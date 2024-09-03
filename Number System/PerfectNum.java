public class PerfectNum {
    public static void main(String[] args) {
        int num = 6;
        int factSum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0 ){
                factSum += i;
            }
        }
        if(factSum == num){
            System.out.println( " is a  Perfect number  ");
        }
        else{
            System.out.println(" Is not a Perfect number ");
        }
    }
}
