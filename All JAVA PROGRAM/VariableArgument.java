public class VariableArgument {
    public static int sum(int ...arr)
    {
        int result=0;
        for (int a : arr) {
            result+=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("the addition is "+sum(23,4,33,33));
    System.out.println("the addtion is"+sum(30,6,45,234,64,33,344));  
    System.out.println("sum of 3,4,5is"+sum(3,4,5));
  }
}
