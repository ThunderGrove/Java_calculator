import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest{

    @Test
    public void testAdd(){
        Calc theCalc = new Calc();

        assertEquals(0,theCalc.add(0,0),"0+0 must be 0");
        assertEquals(2,theCalc.add(1,1),"1+1 must be 2");
        assertEquals(2,theCalc.add(2,0),"2+0 must be 2");
        assertEquals(20,theCalc.add(10,10),"10+10 must be 20");
        assertEquals(444,theCalc.add(123,321),"123+321 must be 444");
    }

    @Test
    public void testSub(){
        Calc theCalc = new Calc();

        assertEquals(0,theCalc.sub(0,0),"0-0 must be 0");
        assertEquals(0,theCalc.sub(1,1),"1-1 must be 0");
        assertEquals(2,theCalc.sub(2,0),"2-0 must be 2");
        assertEquals(0,theCalc.sub(10,10),"10-10 must be 0");
        assertEquals(-198,theCalc.sub(123,321),"123-321 must be -198");
    }

    @Test
    public void testMulti(){
        Calc theCalc = new Calc();

        assertEquals(0,theCalc.multi(0,0),"0*0 must be 0");
        assertEquals(1,theCalc.multi(1,1),"1*1 must be 1");
        assertEquals(4,theCalc.multi(2,2),"2*2 must be 4");
        assertEquals(100,theCalc.multi(10,10),"10*10 must be 100");
        assertEquals(39483,theCalc.multi(123,321),"123*321 must be 39483");
    }
}