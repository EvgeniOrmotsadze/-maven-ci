import ge.evgo.sdp.Increment;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root_pc on 5/8/2016.
 */
public class IncrementTest {


    @Test
    public void testIncrementByOne(){
        Increment increment = new Increment();
        assertEquals(2,increment.incByOne(1));
    }

    @Test
    public void testIncrementBySelf(){
        Increment increment = new Increment();
        assertEquals(10,increment.incBySelf(5));
    }


}
