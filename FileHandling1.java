import java.io.File;
public class FileHandling1 {
    public static void main(String[] args) {
        File file=new File("new.txt");
        try{
            boolean value=file.createNewFile();
            if(value)
            {
                System.out.println("file is created");
            }
            else{
                System.out.println("the file is alredy difind");
            }
        }
        catch(Exception e){
            e.getStackTrace();

        }

    }
    
}