package javaEEHelloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FortuneTest {

    Fortune fortune = new Fortune();

    @Test
    public void testResult(){
        fortune.setResult("");
        assertEquals(fortune.getResult(),"");
    }
}
