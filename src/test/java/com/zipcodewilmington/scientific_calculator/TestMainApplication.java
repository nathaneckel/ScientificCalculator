package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicOperations;
import jdk.dynalink.Operation;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

        // (+) Test
        public void testAdd() throws Exception {
            Assert.assertEquals(4, BasicOperations.add(1, 3));
        }

        // (-) Test
        public void testSubtract() throws  Exception {
            Assert.assertEquals(6, BasicOperations.subtract(9, 3))
        }
        // (*) Test
          public void testMultiply() throws Exception {
            Assert.assertEquals(12, BasicOperations.multiply(4, 3));
        }
        // (/) Test
          public void testDivide() throws Exception {
            Assert.assertEquals(3, BasicOperations.divide(9, 3));
         }
        // (Sin) Test
        public void testSin() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.087155742748, Operation.sine(5), delta);
        }

        // (Cos) Test
        public void testCos() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(1.0, Operation.cosine(0), delta);
           }
        // (Tan) Test
        public void testTan() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.0874886635, Operation.tangent(5), delta);
                  }

        // (ArcSin) Test
        public void testArcSin() throws Exception {
            double delta = 0.001;
            Assert.assertEquals(1.57079633, Operation.inverseSin(1), delta);
        }

        // (ArcCos)
        public void testArcCos() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(1.04719755, Operation.inverseCosine(0.5), delta);
        }

        // (ArcTan) Test
        public void testArcTan() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.785398163, Operation.inverseTangent(1), delta);
            // Add more test cases if needed
}


// log
// inverseLog
// naturalLog
// eX
// factorial
//I amd adding things