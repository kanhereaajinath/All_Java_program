public class TwoDimesionalArry {
    public static void main(String[] args) {
        int [][]flats=new int [2][3];
        flats[0][0]=100;
        flats[0][1]=200;
        flats[0][2]=140;
        flats[1][0]=130;
        flats[1][1]=105;
        flats[1][2]=103;
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
        }
        
        


    }
}
