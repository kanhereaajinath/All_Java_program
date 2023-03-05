import java.util.Scanner;

public class StaticMetodEx {
    public static int add(int a,int b)
    {
        int z=a+b;
        return z;
    }
    public static void main(String[] args) {
        int p,q;
        System.out.println("enter two number");
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();

    
System.out.println("addtion is"+add(p,q));
    }
}
