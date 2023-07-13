import java.io.FileInputStream;
public class FileInputStr {
    public static void main(String[] args) {
        try{
            FileInputStream input=new FileInputStream("new.txt");
            int i=0;
            while((i=input.read())!=-1)
            {
                System.out.print((char)i);

            }

        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
