
import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// user input 
        int age;
        String name;

        System.out.println(" Enter age  ");
        age = sc.nextInt();
        System.out.println(" Enter name  ");
        name = sc.next();
// out put 

        System.out.println(" My name is " + name);
        System.out.println(" My age is " + age);
        sc.close();
    }
}
