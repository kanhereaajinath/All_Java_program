// 6.Create an interface TVremote and use it to inherit another interface smart TVremote 
//7.Create a class TV which implements TVremote interface from Q6
interface TVremote{
    void swithOF();
    void on();
}
class smartTvreomte implements TVremote
{
    public void swithOF()
    {
        System.out.println("please click on the swith of the button");
    }
    public void on()
    {
        System.out.println("please click the on button ");
    }
    class TV extends smartTvreomte{
        public void newfeture()
        {
            System.out.println("this is the new version ov remote");
        }


    }
}
public class Assigment_Abstract_class3 {
    public static void main(String[] args) {
        smartTvreomte remote=new smartTvreomte();
remote.swithOF();
TVremote tv=new smartTvreomte();
tv.swithOF();
    }
    
}
