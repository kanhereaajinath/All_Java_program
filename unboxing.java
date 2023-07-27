public class unboxing {
    public static void main(String[] args) {
        Integer a=new Integer(30);
        int i=a.intValue();
        int j=a;
        System.out.println(a+" "+j+" "+i);
    }
}
