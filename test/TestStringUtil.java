package test;

import org.junit.Test;

import java.StringUtil;

import static org.junit.Assert.*;

public class TestStringUtil {

    @Test
    public void testConcat(){
        assertEquals("Catfish", StringUtil.concat("Cat","fish"));
    }
}
