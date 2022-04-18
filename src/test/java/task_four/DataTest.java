package task_four;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {
    Data oper;

    @Before
    public void setUp(){
       oper = new Data();
    }


    @org.junit.Test
    public void add() {
        assertEquals( 7, 7, 5.2);
    }

    @org.junit.Test
    public void subtract() {
        assertEquals(0, 0, 5.5);
    }

    @org.junit.Test
    public void times() {
        assertEquals(25, 25, 5.5);
    }

    @org.junit.Test
    public void div1(){
        assertEquals(1, 1, 10.10);
    }

    @Test(expected = ArithmeticException.class)
    public void div() {
            oper.div(2,0);
    }
}