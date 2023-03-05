import javax.lang.model.util.ElementScanner14;

public class FactUsingRecursion {
    public static int fact (int n)

    {
if(n==0|| n==1)
{
    return 1;
}
else 
{
return n*fact(n-1);

}
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println("the value of factorial is"+fact(x));
    }
}
