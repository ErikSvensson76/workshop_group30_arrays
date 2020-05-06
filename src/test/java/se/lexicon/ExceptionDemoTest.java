package se.lexicon;

import org.junit.Test;

public class ExceptionDemoTest {

    @Test(expected = NullPointerException.class)
    public void given_null_array_returnBiggestString_throws_NullPointerException(){
        ExceptionDemo.returnBiggestString(null);
    }
}
