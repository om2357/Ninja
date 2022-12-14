import java.sql.SQLOutput;

public class Recurtion {
    public static void main(String [] args)
    {
        Message();
    }
    static void Message()
    {
        System.out.println("Hello 1");
        Message2();
    }
    static void Message2()
    {
        System.out.println("Hello 2");
        Message3();
    }
    static void Message3()
    {
        System.out.println("Hello 3");
    }
}



