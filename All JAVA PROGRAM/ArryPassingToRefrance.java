import java.net.Socket;

public class ArryPassingToRefrance {
    static void change2(int [] arr)
    {
        arr[0]=24;
    }
    public static void main(String[] args) {
        int []marks={23,53,43,64,64,75};
        change2(marks);
        System.out.println("after passing array to the running change is"+marks[0]);
    }
}
