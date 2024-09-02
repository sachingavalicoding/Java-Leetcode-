import java.util.Scanner;

public class B05_ValidatedAge {
    public static void main(String[] args) {
        // get input for age 
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Your age  ");
        int age = sc.nextInt();
        // check age is validated for voting or not 

        if(age > 18){
            System.out.println( " Yes  ");
        }
        else{
            System.out.println(" No  ");
        }
        sc.close();

    }
}
