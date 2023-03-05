//write a program to find outwhatever a given integer present in a arry or not
public class Arr4 {
    public static void main(String[] args) {
        int []marks={90,40,60,70,80,90};
        int num=45;
        boolean isInArry=false;
        for (int elements : marks) {
            if(num==elements)
            {
                isInArry=true;
                break;

            }
            
        }
        if(isInArry)
        {
            System.out.println("the value is present int the arry");
        }
        else{
            System.out.println("the value is not present in the");
        }

    }

}
