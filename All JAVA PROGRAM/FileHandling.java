import java.util.Scanner;

import java.lang.String;
import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) {
        try
        {
            File r=new File("C:\Users\91930\OneDrive\Desktop\assigment1 ddms.txt");
            Scanner sc=new Scanner(r);
            while (sc.hasNextLine())
            {
                System.out.println(sc.hasNextLine());
                System.out.println(sc.hasNextLine());
                System.out.println(sc.hasNextLine());
                System.out.println(sc.hasNextLine());

            }
        }
    }
}
