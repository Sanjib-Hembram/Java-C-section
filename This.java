import java.util.Scanner;
class A
{
    int a,b;
    void init(int a,int b)
    {
        this.a=a;
        this.b=b;
        
    }
    void show()
    {
        System.out.printf(" The value is %d %d",a,b);
    }
}
class This
{
    public static void main(String[] args)
    {
        A obj=new A();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the value of A ");
        int a=sc.nextInt();
        System.out.printf("Enter the value of B ");
        int b=sc.nextInt();
        obj.init(a,b);
        obj.show();
    }
}