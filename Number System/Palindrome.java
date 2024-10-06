class Palindrome {
    public static void main(String[] args) {
        int num = -121;
        int rev = 0;
        int temp = num;
        while(num != 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        if(rev == temp){
            System.out.println(" Palindrome");
        }
        else{
            System.out.println(" Not a palindrome");
        }
    }
}