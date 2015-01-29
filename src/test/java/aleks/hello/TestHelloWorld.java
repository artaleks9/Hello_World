package aleks.hello;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Created by Alex on 21.03.14.
 */
public class TestHelloWorld {

        @Test
        public  void printTest( )throws WrongString {
            HelloWorld hw = new HelloWorld();
            String s = null;
            try{
                hw.print(s, hw);
                Assert.fail("You must enter hello word!\nShould have thrown hello WrongStringException");
            }catch (WrongString wr){
                Assert.assertEquals("You must enter hello word!",wr.getMessage());
            }
        }
}
