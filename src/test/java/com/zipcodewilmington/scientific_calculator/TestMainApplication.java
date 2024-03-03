package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicOperations;
import com.zipcodewilmington.scientificcalculator.ScientificCalculations;
import org.junit.Test;
import org.junit.Assert;
import org.sonatype.aether.metadata.Metadata;
import javax.swing.plaf.basic.BasicArrowButton;


/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

        //Arithmetic operators
        @Test
        // (+) Test
        public void add() throws Exception {
            Assert.assertEquals(4, BasicOperations.add(1, 3), 0.00001);
        }
        @Test
        // (-) Test
        public void subtract() throws Exception {
            Assert.assertEquals(6.0, BasicOperations.subtract(9.0, 3.0), 0.000001);
        }

        @Test
        // (*) Test
        public void multiply() throws Exception {
            Assert.assertEquals(12, BasicOperations.multiply(4, 3), 0.00001);
        }

//        @Test
        // Exponentiation Test
        // public void Exponentiation() throws Exception {
        // Assert.assertEquals(64, BasicOperations.exponentiation(4, 3));
        // }

        @Test
        // (/) Test
        public void divide() throws Exception {
            Assert.assertEquals(3.0, BasicOperations.divide(9.0, 3.0), 0.00001);
        }
        @Test
        // Trigonometry
        // (Sin) Test
        public void sine() throws Exception {double delta = 0.0001;
            Assert.assertEquals(0.087155742748, ScientificCalculations.sine(5), delta);
        }

        @Test
        // (Cos) Test
        public void cosine() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(1.0, ScientificCalculations.cosine(0), delta);
        }

        @Test
        // Tangent) Test
        public void tangent() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(0.0874886635, ScientificCalculations.tangent(5), delta);
        }

        @Test
        // (Inverse Sine) Test
        public void inverseSine() throws Exception {
            double delta = 0.001;
            Assert.assertEquals(1.57079633, ScientificCalculations.inverseSine(1), delta);
        }

        @Test
        // (Inverse Cosine) Test
        public void inverseCosine() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(1.04719755, ScientificCalculations.inverseCosine(0.5), delta);
        }

        @Test
        // (Inverse Tangent) Test
        public void inverseTangent() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.785398163, ScientificCalculations.inverseTangent(1), delta);
        }

        @Test
//Logarithm
        //(Log) Test
        public void Log() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.77815125038, ScientificCalculations.log(6), delta);
         }

        @Test
        // (Inverse Log) Test
        public void inverseLog() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(1000, ScientificCalculations.inverseLog(3), delta);
        }

        @Test
        // (Natural Log) Test
        public void naturalLog() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(2.48490665, ScientificCalculations.naturalLog(12), delta);
        }

        @Test
        // (E^X) Test
        public void eX() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(20.08553664464, ScientificCalculations.eX(3), delta);
        }

        @Test
        // (Factorial) Test
         public void factorial() throws Exception {
         Assert.assertEquals(6, ScientificCalculations.factorial(3), 0.00001);
      }

}


// log
// inverseLog
// naturalLog
// eX
// factorial
//I amd adding things