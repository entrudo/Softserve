package com.softserve.edu.firsthomework.task2;

/**
 * Class that save data of envelope and compare envelop and calculate area of envelop
 * <p>
 * <>sideA save data of one side envelope</>
 * <>sideA save data of one side envelope</>
 * <>areaOfEnvelope save data about area of envelop</>
 *
 * @author Alex
 * @version 1.0
 */

public class Envelope {
	
	private double sideA = 0;
	private double sideB = 0;
	private double areaOfEnvelope = 0;
	
	
	/**
	 * Method that return value of area of the envelope
	 *
	 * @return areaOfEnvelope
	 */
	public double getAreaOfEnvelope() {
		return areaOfEnvelope;
	}
	
	/**
	 * Method for calculate area of envelope
	 */
	public void calculateAreaOfEnvelope() {
		areaOfEnvelope = this.sideA * this.sideB;
		
	}
	
	/**
	 * Constructor for class Envelope that created new envelope
	 *
	 * @param sideA
	 * @param sideB
	 */
	public Envelope(String sideA, String sideB) {
		if (sideA.startsWith("0") || sideA.startsWith("-") || sideB.startsWith("0") || sideB
				.startsWith("-")) {
			throw new NumberFormatException();
		} else {
			this.sideA = Double.parseDouble(sideA);
			this.sideB = Double.parseDouble(sideB);
		}
	}
	
	/**
	 * Method that compare two envelopes
	 *
	 * @param areaSecondOfEnvelope
	 * @return String with answer about compare
	 */
	public boolean compareEnvelope(double areaSecondOfEnvelope) {
		return this.areaOfEnvelope > areaSecondOfEnvelope;
	}
}
