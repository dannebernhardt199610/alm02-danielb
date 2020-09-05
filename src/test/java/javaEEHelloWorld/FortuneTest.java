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

    @Test
    public void testAdd(){
        fortune.setColor("blue");
        fortune.setName("danne");
        fortune.setFood("tacos");
        assertEquals(fortune.getColor(), "blue");
        assertEquals(fortune.getName(), "danne");
        assertEquals(fortune.getFood(), "tacos");
    }

    @Test
    public void testMsg(){
        fortune.setMsg("Invalid name");
        assertEquals(fortune.getMsg(), "Invalid name");
        fortune.setMsg("");
        assertEquals(fortune.getMsg(), "");
    }

    @Test
    public void testAnything(){
    }



}
