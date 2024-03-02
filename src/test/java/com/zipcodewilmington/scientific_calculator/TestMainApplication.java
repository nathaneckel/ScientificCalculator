package com.zipcodewilmington.scientific_calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

        @Test
        public void testLog() throws Exception {
            Assert.assertEquals(TestMainApplication.log(1));
        }
        
}
