public class OrdrinList {
    static String name[]={"pune","dhule","jalna","parbhani"};

    public static void main(String[] args) {
int size=name.length;
String temp=null;
for(int i=0;i<size;i++)
{
    for(int j=0;j<size;j++)
    {
        if()
        {
            temp=name[i];
            name[i]=name[j];
            name[j]=temp;
        }
    }
}
for(int k=0;k<size;k++)
{
    System.out.println(name[k]);
}

    }
}
