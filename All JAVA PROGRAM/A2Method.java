import java.util.Scanner;

//find number odd even or odd using method and take input form user

public class A2Method {
    public static void EvenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+"number is even ");
        }
        else
        {
            System.out.println(n+"number is odd");
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check even or odd");
        num=sc.nextInt();
        EvenOdd(num);
    }
    
}
