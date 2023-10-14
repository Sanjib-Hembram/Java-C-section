class Block
{
    void display()
    {
        System.out.println("Fourth");
    }
    Block()
    {
        System.out.println("Third ");
    }
    {
        System.out.println("Second ");
    }
    static
    {
        System.out.println("First");
    }
    public static void main(String[] args)
    {
        Block obj=new Block();
        obj.display();
    }
}