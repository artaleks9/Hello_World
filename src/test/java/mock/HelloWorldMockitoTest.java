package mock;

import aleks.hello.HelloWorld;
import aleks.hello.WrongString;
import org.junit.Test;

import static org.mockito.Mockito.*;
/**
 * Created by aleks
 * on 06.01.2015.
 */
public class HelloWorldMockitoTest {

    HelloWorld hw = new HelloWorld();
    String s = "Hello,Artem!";


    @Test
    public void test() throws WrongString {

        HelloWorld hwMock;
        hwMock = mock(HelloWorld.class);

        hwMock.getName();


        verify(hwMock).getDate();
        verify(hwMock).setName(s);
        verify(hwMock).getName();
    }
}
