public class ArraySum {
    public static void main(String[] args) {
        int []marks={34,45,35,57,76};
      int  sum=0;
        for (int i : marks) 
        {
         sum=sum+i;   
        }
        System.out.println("Addition of array is"+sum);
    }
}
