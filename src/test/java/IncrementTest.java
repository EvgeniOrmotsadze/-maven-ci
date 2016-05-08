import ge.evgo.sdp.Increment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;

/**
 * Created by root_pc on 5/8/2016.
 */
public class IncrementTest {

    private Increment increment;

    @Before
    public void init(){
        increment = new Increment();
    }


    @Test
    public void testIncrementByOne(){
        assertEquals(2,increment.incByOne(1));
    }

    @Test
    public void testIncrementBySelf(){
        assertEquals(10,increment.incBySelf(5));
    }

    @Test
    public void testIncByValue(){
        Increment inc = spy(Increment.class);
        assertEquals(15,inc.incByValue(10,5));
    }


}
