import javax.tools.Diagnostic;

//Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create 
//another class smart telephone and demonstrate polymorphism 
abstract class telephone {
    abstract void with();
    abstract void lift();
    abstract void disconnected ();

}
interface camera{
    void takeSnap();
    
}
interface whtsapp{
    void sendMessage();
    void reciveMessage();

}
class smartphone extends telephone implements camera,whtsapp{
    public void with()
    {
        System.out.println("i am with");
    }
    public void lift()
    {
        System.out.println("lift");
    }
    public void disconnected()
{
    System.out.println("telephone is disconnectd");

}

public void takeSnap()
{
    System.out.println("plase take snap");
}
public void sendMessage()
{
    System.out.println("i Like you");
}
public void reciveMessage()
{
    System.out.println("good morining");
}

}

public class Assigment_polymorphism {
    public static void main(String[] args) {
        camera cam=new smartphone();
        cam.takeSnap();
        smartphone sm=new smartphone();
        sm.sendMessage();
        sm.reciveMessage();
        sm.with();
        sm.lift();
        sm.disconnected();
    }
}
