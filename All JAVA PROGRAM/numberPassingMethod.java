public class numberPassingMethod {
    static void change(int a)
    {
        a=98;
    }
    public static void main(String[] args) {
        int a=23;
        change(a);
        System.out.println("the value of a after running change is "+a);
    }
}
