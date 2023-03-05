import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) {
       int []  marks=new int[5];
        System.out.println("enter arry element");
       
        for(int i=0;i<5;i++)
        {
            Scanner st=new Scanner(System.in);
            marks[i]=st.nextInt();
        
    }
    int sum=0;
    System.out.println("Array element is ");
    for(int j=0;j<marks.length;j++)
    {
   System.out.println(marks[j]);
   sum=sum+marks[j];
    }
    System.out.println("sum of array is"+sum);
    
}
}



