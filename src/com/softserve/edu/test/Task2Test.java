package com.softserve.edu.test;

import com.softserve.edu.firsthomework.task2.ConsoleHelper;
import com.softserve.edu.firsthomework.task2.Envelope;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class Task2Test {

    @Test
    public void calculateAreaOfEnvelopeWithCorrectDateTest() {
	    //Arrange
        double sideA = 12;
        double sideB = 12;
        double expected;
        Envelope envelope = new Envelope("12", "12");
        envelope.calculateAreaOfEnvelope();
        double actual;
	
	    //Act
        expected = sideA * sideB;
        actual = envelope.getAreaOfEnvelope();
	
	    //Assert
        assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void calculateAreaOfEnvelopeWithNullDateTest() {
	    //Arrange
        double sideA = 0;
        double sideB = 0;
        double expected;
        Envelope envelope = new Envelope("12", "12");
        envelope.calculateAreaOfEnvelope();
        double actual;
	
	    //Act
        expected = sideA * sideB;
        actual = envelope.getAreaOfEnvelope();
	
	    //Assert
        assertNotEquals(actual, expected, 0.00001);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void calculateAreaOfEnvelopeWithNegativeSideADateTest() {
        Envelope envelope = new Envelope("-12", "12");
    }
    
    @Test
	public void checkExitFunctionWithValidYDataExpectedTrueTest() {
	    //Arrange
	    ConsoleHelper helper = new ConsoleHelper();
	    
	    //Act
	    boolean result = helper.exit("Y");
	    
	    //Assert
	    assertTrue(result);
    }
	
	@Test
	public void checkExitFunctionWithValidYesDataExpectedTrueTest() {
		//Arrange
		ConsoleHelper helper = new ConsoleHelper();
		
		//Act
		boolean result = helper.exit("YES");
		
		//Assert
		assertTrue(result);
	}
	
	@Test
	public void checkExitFunctionWithInvalidDataExpectedFalseTest() {
		//Arrange
		ConsoleHelper helper = new ConsoleHelper();
		
		//Act
		boolean result = helper.exit("No");
		
		//Assert
		assertFalse(result);
	}

	@Test
	public void checkPrintErrorExpectedPrintErrorInformationTest(){
		//Arrange
		ConsoleHelper helper = new ConsoleHelper();
		
		Exception e = new IOException("Test");
		
		//Act
		helper.sayUserAboutError(e);
		
		//Assert
		assertEquals("Test", e.getMessage());
	}
	
	@Test
	public void checkResultOfCompareExpectedTrueTest() {
		//Arrange
		Envelope firstEnvelope = new Envelope("12", "12");
		firstEnvelope.calculateAreaOfEnvelope();
		
		Envelope secondEnvelope = new Envelope("11", "11");
		secondEnvelope.calculateAreaOfEnvelope();
		
		//Act
		Boolean result = firstEnvelope.compareEnvelope(secondEnvelope.getAreaOfEnvelope());
		
		//Assert
		assertTrue(result);
	}
	
	@Test
	public void checkResultOfCompareExpectedFalseTest() {
		//Arrange
		Envelope firstEnvelope = new Envelope("11", "11");
		firstEnvelope.calculateAreaOfEnvelope();
		
		Envelope secondEnvelope = new Envelope("12", "12");
		secondEnvelope.calculateAreaOfEnvelope();
		
		//Act
		Boolean result = firstEnvelope.compareEnvelope(secondEnvelope.getAreaOfEnvelope());
		
		//Assert
		assertFalse(result);
	}
}
