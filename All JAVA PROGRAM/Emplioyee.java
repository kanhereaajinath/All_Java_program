class Employee
{
    int id ;
    String name;
    float salary;
    void insert(int i,String n,float s)
    {
        id=i;
        name=n;
        salary=s;
    }
    void dislay()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}
public class Emplioyee{
    public static void main(String[] args) {

        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
     e1.insert(101, "Aajinath" ,30000);
     e2.insert(102, "Rushikesh", 44500);
     e3.insert(103,"parmeshwar",30000);
     e1.dislay();
     e2.dislay();
     e3.dislay();
     
     
    }
}