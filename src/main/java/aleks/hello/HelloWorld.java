package aleks.hello;

/**
 * Created by Alex on 21.03.14.
 */

public class HelloWorld{

    private String name;
    private String date;
    private String idn;

    public void print(String s)throws WrongString {
        if(s!= null)
            System.out.println(s);
        else
            throw new WrongString();
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getIdn() {
        return idn;
    }



    public static void main(String[] arg)  {
        HelloWorld hw = new HelloWorld();
        String s = null;
        try {
            hw.print(s);
        } catch (WrongString wr) {
            System.out.println("Empty string!\n"+wr.getMessage());
        }
        System.out.println("Hello Aleks!");
    }

}
