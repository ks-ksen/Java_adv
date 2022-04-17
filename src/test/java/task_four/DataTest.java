package task_four;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {

    /*@Before
    public void setUp(){
        Data oper = new Data(5,5);
    }*/


    @org.junit.Test
    public void add() {
        Data oper = new Data(2,5);
        double res = oper.add(2,5);
        assertTrue(res == 7);

    }

    @org.junit.Test
    public void subtract() {
        Data oper = new Data(5,5);
        double res = oper.subtract(5, 5);
        assertEquals(0, res, 0.0);
    }

    @org.junit.Test
    public void times() {
        Data oper = new Data(5,5);
        double res = oper.times(5, 5);
        assertEquals(25, res, 0.0);
    }


    @org.junit.Test
    public void div(){
        Data oper = new Data(5,5);
        double res = oper.div(5,5);
        assertEquals(1, res, 0.0);

    }

    @Test(expected = ArithmeticException.class)
    public void divException() {
        new Data (2,0).div(2,0);

    }
}