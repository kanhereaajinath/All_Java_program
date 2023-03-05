public class MethodOverloding {
    public static void add(int a,int b)
    {
        int z;
        z=a+b;
        System.out.println("additon is"+z);
    }
    public static int add(int  a,int b)
    {
        float p;
        p=a+b;
        return p;
    }
    public static void add(String a,String b)
    {
        String z;
        z=a+b;
        System.out.println("sting is"+z);

    }
    public static void main(String[] args) {
        add("hello","world");

        add(23,45);
        add(45.3f,64.f);

    }
}
