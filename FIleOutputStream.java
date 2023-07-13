import  java.io.FileOutputStream;
public class FIleOutputStream {
    public static void main(String[] args) {
        String data="This is the java program ";
        try{
            FileOutputStream  out=new FileOutputStream("new.txt");
            
            byte[] st=data.getBytes();
           out.write(st);

        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
