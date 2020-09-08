package javaEEHelloWorld;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class FortuneTest {

    private final static Logger LOGGER = Logger.getLogger(Fortune.class.getName());
    Fortune fortune = new Fortune();



    @Test
    public void testResult(){
        fortune.setResult("hej");
        assertEquals(fortune.getResult(),"hej");
        LOGGER.info(fortune.getResult());
    }

    @Test
    public void testAdd(){
        fortune.setColor("blue");
        fortune.setName("danne");
        fortune.setFood("tacos");
        assertEquals(fortune.getColor(), "blue");
        LOGGER.info(fortune.getColor());
        assertEquals(fortune.getName(), "danne");
        LOGGER.info(fortune.getName());
        assertEquals(fortune.getFood(), "tacos");
        LOGGER.info(fortune.getFood());
    }

    @Test
    public void testMsg(){
        fortune.setMsg("Invalid name");
        assertEquals(fortune.getMsg(), "Invalid name");
        LOGGER.info(fortune.getMsg());
        fortune.setMsg("");
        assertEquals(fortune.getMsg(), "");
        LOGGER.info(fortune.getMsg());
    }

    @Test
    public void testCheck(){
        fortune.setName("danne");
        fortune.setFood("tacos");
        fortune.setColor("green");
        fortune.check();
    }

    @Test
    public void testTellFortune(){
        fortune.setName("daniel");
        fortune.setFood("Pizza");
        fortune.setColor("green");
        fortune.tellFortune();
        assertEquals(fortune.getResult(), "Say hello to others. You will have a happier day.");
        LOGGER.info(fortune.getResult());
    }



}
