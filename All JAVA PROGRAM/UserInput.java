import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String s="Welcome to ditms";
        System.out.println("------------------enter your details---------------");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name");
        String s1=sc.next();
        System.out.println("Name:"+s1);
        System.out.println("enter your age");
        int i=sc.nextInt();
        System.out.println("Age:"+i);
        System.out.println("enter your salary");
        double d=sc.nextDouble();
        System.out.println("salary:"+d);
    }
}
