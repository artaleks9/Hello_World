package mock;

import aleks.hello.HelloWorld;
import aleks.hello.WrongString;
import org.junit.Test;

import static org.mockito.Mockito.*;
/**
 * Created by My on 06.01.2015.
 */
public class MockitoTestHelloWorld {

    //HelloWorld hwMock;
    //HelloWorld hw = new HelloWorld();
    //hwMock = mock(HelloWorld.class);
    //String s = "Hello";

    @Test
    public void test() throws WrongString {
        HelloWorld hwMock;
        HelloWorld hw = new HelloWorld();
        hwMock = mock(HelloWorld.class);
        String s = null;
        hwMock.print(s);
        verify(hwMock).print(s);
    }
}
