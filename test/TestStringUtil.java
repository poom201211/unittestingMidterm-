
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStringUtil {

    @Test
    public void testTypicalConcat(){
        assertEquals("Catfish", StringUtil.concat("Cat","fish"));
        assertEquals("Yedkay", StringUtil.concat("Yed","kay"));
    }

    @Test
    public void testEdgeConcat(){
        assertEquals("  ",StringUtil.concat(" "," "));
    }

    @Test
    public void testErrorConcat(){
        assertNull(StringUtil.concat(null,null));
    }

    @Test
    public void testTypicalRemoveDuplicate(){
        assertEquals("Helo",StringUtil.remove_duplicate("Heeelloooo"));
        assertEquals("Uns",StringUtil.remove_duplicate("Unnns"));
    }

    @Test
    public void testEdgeRemoveDuplicate(){
        assertEquals("o",StringUtil.remove_duplicate("o"));
        assertEquals("o",StringUtil.remove_duplicate("o"));
        assertEquals("p",StringUtil.remove_duplicate("p"));
        assertEquals("s",StringUtil.remove_duplicate("s"));
    }

    @Test(expected = NullPointerException.class)
    public void testErrorRemoveDuplicate(){
        assertNull(StringUtil.remove_duplicate(null));
    }

    @Test
    public  void testTypicalDuplicate(){
        assertEquals("dududu",StringUtil.duplicate("du",3));
    }


}
