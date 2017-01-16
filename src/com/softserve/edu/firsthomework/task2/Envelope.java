package com.softserve.edu.firsthomework.task2;

/**
 * Class that save data of envelope and compare envelop and calculate area of envelop
 *
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
    public void areaOfEnvelope(){
        areaOfEnvelope = this.sideA * this.sideB;

    }

    /**
     * Constructor for class Envelope that created new envelope
     *
     * @param sideA
     * @param sideB
     */
    public Envelope(String sideA, String sideB) {
        if (sideA.startsWith("0") || sideA.startsWith("-")){
            System.out.println(App.help);
            System.exit(0);
        } else {
            try {
                this.sideA = Double.parseDouble(sideA);
            } catch (NumberFormatException e){
                System.out.println(App.help);
                System.exit(0);
            }
        }

        if (sideB.startsWith("0") || sideB.startsWith("-")){
            System.out.println(App.help);
            System.exit(0);
        } else {
            try {
                this.sideB = Double.parseDouble(sideB);
            } catch (NumberFormatException e){
                System.out.println(App.help);
                System.exit(0);
            }
        }
    }

    /**
     * Method that compare two envelopes
     *
     * @param areaOfEnvelope

     * @param areaSecondOfEnvelope
     * @return String with answer about compare
     */
    public static String compareEnvelope(double areaOfEnvelope, double areaSecondOfEnvelope){
        if (areaOfEnvelope > areaSecondOfEnvelope){
            return "First envelope bugger then second";
        } else {
            if (areaOfEnvelope == areaSecondOfEnvelope){
                return "First and second envelopes are equals";
            } else {
                return "Second envelope bugger then first";
            }
        }
    }


}
