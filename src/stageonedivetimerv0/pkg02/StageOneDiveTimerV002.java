/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stageonedivetimerv0.pkg02;

import java.io.IOException;

/**
 *
 * @author dave
 */
public class StageOneDiveTimerV002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Instantiate status Manager
        StatusManager newstatusManager = new StatusManager();

        //Instantiate main Display
        MainDisplay newMainDisplay = new MainDisplay(newstatusManager);
        newMainDisplay.setVisible(true);

        //Instantiate the depth gauge
        DepthGauge newDepthGauge = new DepthGauge();

        //Instantiate the stop watch
        Timer newTimer = new Timer();

        //Instantiate logging facility
        LogToFile newLogFile = new LogToFile();
        newLogFile.openFile();

        while (newstatusManager.getStatus().equals(StatusManager.NOT_DIVING)) {
            //System.out.println("Waiting");
            try {
                Thread.sleep(100); // Sleep for 1 sec 
            } catch (InterruptedException e) {
            }
        }
        while (newstatusManager.getStatus().equals(StatusManager.DIVING)) {
            //Time
            String timeData;
            timeData = newTimer.getTimeElapsed();
            newMainDisplay.setTimeDisplay(timeData);
            //Depth
            double doubleDepthData = newDepthGauge.getCurrentDepth();
            String depthData = String.valueOf(doubleDepthData);
            newMainDisplay.setDepthDisplay(depthData);
            //Log data
            String diveData = timeData + "," + depthData + "\n";
            newLogFile.writeFile(diveData);
            //Sleep
            try {
                Thread.sleep(1000); // Sleep for 1 sec 
            } catch (InterruptedException e) {
            }
        }
        newLogFile.closeFile();
    }
}
