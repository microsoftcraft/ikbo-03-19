import java.util.Scanner;

public class ThrowsDemo
{
    public void getKey()
    {
        for (int i=0;i<2;i++)
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            try {
                String key = myScanner.nextLine();
                printDetails(key);

            } catch (Exception e) {
            }
        }
    }
    public void printDetails(String key) throws Exception
    {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception
    {
        if(key.equals(""))
        {
            throw new Exception( "Key set to empty string" );
        }

        return "data for " + key;
    }

    public static void main(String [] args)
    {
        ThrowsDemo a=new ThrowsDemo();
        a.getKey();
    }
}

