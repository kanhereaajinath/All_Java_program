//calculate the avrage marks form arry contaning marks of student in physic using for each loop
public class AvarageUsingArry {
    public static void main(String[] args) {
        
    
    int []marks={30,40,50,60,70,80};
    int sum=0;
   for (int elements : marks) {
    sum=sum+elements;
    
   }
System.out.println("the avarage is of arry is "+sum/marks.length);
    }
    }
    

