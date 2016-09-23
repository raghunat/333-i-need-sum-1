package com.example.raghunat.ineedsum1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CalcControllerUnitTest {
    @Test
    public void operationArrayOrder () {
        assertEquals("+", CalcController.operations[0]);
    }
    @Test
    public void calculateAddition() {
        CalcController.insert("2");
        CalcController.insert("+");
        CalcController.insert("2");
        double answer = CalcController.calculate();
        assertEquals(answer, 4, 0.00);
    }
    @Test
    public void calculateSubtraction() {
        CalcController.insert("6");
        CalcController.insert("-");
        CalcController.insert("2");
        double answer = CalcController.calculate();
        assertEquals(answer, 4, 0.00);
    }
}
