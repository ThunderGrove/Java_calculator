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

    @Test
    public void testDivi(){
        Calc theCalc = new Calc();

        assertEquals(2,theCalc.divi(4,2),"4/2 must be 2");
        assertEquals(3,theCalc.divi(9,3),"9/3 must be 3");
        assertEquals(11,theCalc.divi(55,5),"55/5 must be 11");
        assertEquals(1,theCalc.divi(10,10),"10/10 must be 1");
        assertEquals(321,theCalc.divi(963,3),"963/3 must be 321");
    }

    @Test
    public void testSecret(){
        Calc theCalc = new Calc();

        assertEquals(0,theCalc.secret(10,10),"The secret must be 0");
        assertEquals(200,theCalc.secret(15,5),"The secret must be 200");
        assertEquals(8,theCalc.secret(3,1),"The secret must be 8");
        assertEquals(3,theCalc.secret(2,1),"The secret must be 3");
        assertEquals(60000,theCalc.secret(250,50),"The secret must be 60000");
    }
}