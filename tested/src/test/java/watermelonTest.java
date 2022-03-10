import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class watermelonTest {
    @Test
    public void test1(){
        String data="8";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
       assertEquals(watermelon.wm(),"YES");}
        @Test
        public void test2(){
       String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(watermelon.wm(),"NO");}
        @Test
        public void test3(){
       String data="822";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(watermelon.wm(),null);
    }

}