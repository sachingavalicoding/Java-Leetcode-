import java.util.Scanner;

public class B04_MaxInTwoNum {
    public static void main(String[] args) {
        int a , b ;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Two Numbers ");
        a = sc.nextInt();
        b = sc.nextInt();

        // check which is max 
        if(a > b){
            System.out.println(" A ");
        }
        else{
            System.out.println(" B ");
        }
        sc.close();
    }
}
