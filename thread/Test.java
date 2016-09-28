public class Test
{
    public static void main(String[] args)
    {
        Buffer b = new Buffer(5);
        new Thread(new Producteur(b)).start();
        System.out.println(b.toString);
    }
}