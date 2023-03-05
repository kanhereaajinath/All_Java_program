public class InstacaceMetod {
    public int add(int a, int b)
    {System.out.println("it is example of instace method");
        int z=a+b;
        return z;
    }
    public static void main(String[] args) {
        InstacaceMetod obj=new InstacaceMetod();
        
        System.out.println("the sum is "+obj.add(100,300));
    }

}
