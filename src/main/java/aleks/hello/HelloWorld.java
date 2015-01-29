package aleks.hello;

/**
 * Created by Alex on 21.03.14.
 */

public class HelloWorld{

    private String name;
    private String date;
    private String idn;

    public void print(String s, HelloWorld helloWorld)throws WrongString {
        helloWorld.setName(s);
        helloWorld.getDate();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }



    public static void main(String[] arg)  {
        HelloWorld hw = new HelloWorld();
        String s = null;
        try {
            hw.print(s, hw);
        } catch (WrongString wr) {
            System.out.println("Empty string!\n"+wr.getMessage());
        }
        System.out.println("Hello Aleks!");
    }
}
