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
    
    public double getCurrentDepth() {
        //sample the depth sensor and write the value to double currentDepth.
        //Fake depth descender for testing purposes.
        currentDepthFromSensor = 5;
        //System.out.println(currentDepthFromSensor);
        return currentDepthFromSensor;
    }
}