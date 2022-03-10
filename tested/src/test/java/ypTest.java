import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class ypTest {
    @Test
public void test_case1() {
        String data = "10\n" +
                "-6 21 18\n" +
                "20 -11 -8\n" +
                "37 -11 41\n" +
                "-5 8 33\n" +
                "29 23 32\n" +
                "30 -33 -11\n" +
                "39 -49 -36\n" +
                "28 34 -49\n" +
                "22 29 -34\n" +
                "-18 -6 7";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(yp.yoPy(), "NO");//TESTING NO
    }
    @Test
    public void test_case2() {
     String   data = "10\n" +
                "-6 21 18\n" +
                "20 -11 -8\n" +
                "37 -11 41\n" +
                "-5 8 33\n" +
                "29 23 32\n" +
                "30 -33 -11\n" +
                "39 -49 -36\n" +
                "28 34 -49\n" +
                "22 29 -34\n" +
                "-18 -6 1000";//1000 is out of range
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(yp.yoPy(), null);//Testing input bigger than 100
    }
    @Test
    public void test_case3() {
     String   data = "14\n" +
                "43 23 17\n" +
                "4 17 44\n" +
                "5 -5 -16\n" +
                "-43 -7 -6\n" +
                "47 -48 12\n" +
                "50 47 -45\n" +
                "2 14 43\n" +
                "37 -30 15\n" +
                "4 -17 -11\n" +
                "17 9 -45\n" +
                "-50 -3 -8\n" +
                "-50 0 0\n" +
                "-50 0 0\n" +
                "-16 0 0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(yp.yoPy(), "YES");//testing Yes
    }
    @Test
    public void test_case4() {
    String    data="0\n" +//cant be less than 1
                "43 23 17\n" +
                "4 17 44\n" +
                "5 -5 -16\n" +
                "-43 -7 -6\n" +
                "47 -48 12\n" +
                "50 47 -45\n" +
                "2 14 43\n" +
                "37 -30 15\n" +
                "4 -17 -11\n" +
                "17 9 -45\n" +
                "-50 -3 -8\n" +
                "-50 0 0\n" +
                "-50 0 0\n" +
                "-16 0 0";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(yp.yoPy(),null);//testing incorrect first line (out of range)
}
}