//1 .cereate abstract class pen with methods write() and refile() as abstract method
//
abstract class pen 
{
   abstract  void write();
    abstract void refile();
}
class Fountanpen extends pen
{
    void write()
    {
System.out.println("my name is Aajinth ");
  }
  void refile()
  {
System.out.println("refile name is pentic");
  }
  void changeNib()
  {
System.out.println("the chage the nib petin to cello");
  }
    
}
public class AssigmentAbstaractClass {
    
    public static void main(String[] args) {
        Fountanpen f=new Fountanpen();
        f.write();
        f.refile();
        f.changeNib();
    }
}
