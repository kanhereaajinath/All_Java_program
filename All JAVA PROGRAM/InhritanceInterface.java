interface Interface1
{
void meth();
void meth2();

}
 interface interface2 extends Interface1
{
void meth3();
void meth4();

}
class timepass implements interface2
{
    public void meth()
    {
        System.out.println("hello world");
    }
    public void meth2()
    {
       System.out.println("hello friend"); 
    }
    public void meth3()
    {
        System.out.println("hello java");
    }
    public void meth4()
    {
        System.out.println("i like java");
    }
}




public class InhritanceInterface {
    public static void main(String[] args) {
        timepass obj=new timepass();
        obj.meth();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        
    }
    
}
