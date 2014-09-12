/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stageonedivetimerv0.pkg02;

/**
 *
 * @author dave
 */
public class DepthGauge {
    //Variable declarations
    double currentDepthFromSensor, previousDepth, currentDepth, depthDifferential, doubleRate;
    int arrayIndex = 0;
    String velocity;
    int rate, cRate, pRate;
    Thread myThread;
    //This array is some fake data that would be collected from the depth sensor.
    final double[] depthArray1 = {3.00, 5.00, 7.00, 10.00, 12.00, 15.00, 14.00, 12.00, 11.00, 8.00, 3.00};
    
    public double getCurrentDepth() {
        //sample the depth sensor and write the value to double currentDepth.
        //Fake depth descender for testing purposes.
        currentDepthFromSensor = depthArray1[arrayIndex];
        //System.out.println(currentDepthFromSensor);
        return currentDepthFromSensor;
    }
}