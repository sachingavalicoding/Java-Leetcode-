// import java scanner package 
import java.util.Scanner;

public class B06_ScannerUse {
    public static void main(String[] args) {
        // Scanner object create 
        Scanner sc = new Scanner(System.in);

        int a;
        float b;
        double c;
        String e;
        boolean f ;
        System.out.println( " Enter int Num ");
        a = sc.nextInt();
        System.out.println(a);

        System.out.println( " Enter Decimal Number ");
        b = sc.nextFloat();
        System.out.println(b);

        System.out.println( " Enter Decimal Number ");
        c = sc.nextDouble();
        System.out.println(c);

        System.out.println(" Enter String ");
        e = sc.nextLine();
        System.out.println(e);

        System.out.println(" Enter Boolean ");
        f = sc.nextBoolean();
        System.out.println(f);

        sc.close();

    }
}
