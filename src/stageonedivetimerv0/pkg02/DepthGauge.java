/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stageonedivetimerv0.pkg02;

import java.text.DecimalFormat;

/**
 *
 * @author dave
 */
public class DepthGauge {
    //Variable declarations
    double previousDepth, depthDifferential, doubleRate, currentDepth;
    double currentSensorValue = 512;
    double sensorMaxVal = 1023;
    double sensorMaxMilliBar = 1400;
    double sensorMinMilliBar = 100;
    double sensorResolution = (sensorMaxVal / (sensorMaxMilliBar - sensorMinMilliBar));;

    public double getCurrentDepth() {
        //sample the depth sensor and write the value to double currentDepth.
        //Divide by 10 to convert to m.
        DecimalFormat df = new DecimalFormat("#.00");
        currentDepth = (currentSensorValue / sensorResolution)/10;
        //System.out.println(currentDepthFromSensor);
        return Double.parseDouble(df.format(currentDepth));
    }
}