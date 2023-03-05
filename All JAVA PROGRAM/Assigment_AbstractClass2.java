//Create a class monkey with jump ( ) and bite ( ) methods Create a class human 
//which inherits this monkey class and implements basicanimal interface with eat ( )
 //and sleep() methods
 class monkey
 {
    void jump()
    {
        System.out.println("monky is jumping");

    }
    void bite()
    {
        System.out.println("bite");
    }


 }
 class human extends monkey implements basicanimal{
   public void eat()
    {
        System.out.println("eating");
    }
   public void sleep()
    {
        System.out.println("sleeping");
    }

 }
 interface basicanimal
 {
    void eat();
    void sleep();
    
 }
 public class Assigment_AbstractClass2 {
    public static void main(String[] args) {
        human obj=new human();
        obj.eat();
        obj.bite();
        obj.sleep();
        obj.jump();
    }
    
  }