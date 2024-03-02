package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicOperations;
import com.zipcodewilmington.scientificcalculator.ScientificCalculations;
import jdk.dynalink.Operation;
import org.junit.Test;
import org.junit.Assert;
import org.sonatype.aether.metadata.Metadata;

import javax.swing.plaf.basic.BasicArrowButton;

import static com.zipcodewilmington.scientificcalculator.ScientificCalculations.cosine;
import static com.zipcodewilmington.scientificcalculator.ScientificCalculations.tangent;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

//Arithmetic operators
        // (+) Test
        public void add() throws Exception {
            Assert.assertEquals(4, BasicOperations.add(1, 3));
        }

        // (-) Test
        public void subtract() throws Exception {
            Assert.assertEquals(6, BasicOperations.subtract(9, 3))
        }

        // (*) Test
        public void multiply() throws Exception {
            Assert.assertEquals(12, BasicOperations.multiply(4, 3));
        }

        // Exponentiation Test
//        public void Exponentiation() throws Exception {
//        Assert.assertEquals(64, BasicOperations.exponentiation(4, 3));
//        }

        // (/) Test
        public void divide() throws Exception {
            Assert.assertEquals(3, BasicOperations.divide(9, 3));
        }


// Trigonometry
        // (Sin) Test
            public void sine() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.087155742748, ScientificCalculations.sine(5), delta);
        }

        // (Cos) Test
        public void cosine() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(1.0, ScientificCalculations.cosine(0), delta);
        }

        // Tangent) Test
        public void tangent() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(0.0874886635, ScientificCalculations.tangent(5), delta);
        }
        // (Inverse Sine) Test
        public void inverseSine() throws Exception {
            double delta = 0.001;
            Assert.assertEquals(1.57079633, ScientificCalculations.inverseSine(1), delta);
        }

        // (Inverse Cosine) Test
        public void inverseCosine() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(1.04719755, ScientificCalculations.inverseCosine(0.5), delta);
        }

        // (Inverse Tangent) Test
        public void inverseTangent() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(0.785398163, ScientificCalculations.inverseTangent(1), delta);
        }
//Logarithm
        //(Log) Test
        public void Log() throws Exception {
            double delta = 0.0001;
            Assert.assertEquals(1.07918125, ScientificCalculations.log(15), delta);
         }

        // (Inverse Log) Test
        public void inverseLog() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(1.07918125, ScientificCalculations.inverseLog(12), delta);
        }

        // (Natural Log) Test
        public void naturalLog() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(2.48490665, ScientificCalculations.naturalLog(12), delta);
        }

        // (E^X) Test
        public void eX() throws Exception {
        double delta = 0.0001;
        Assert.assertEquals(7.3890560989, ScientificCalculations.eX(12), delta);
        }

        // (Factorial) Test
         public void factorial() throws Exception {
         Assert.assertEquals(120, ScientificCalculations.log(5));
      }

}


// log
// inverseLog
// naturalLog
// eX
// factorial
//I amd adding things