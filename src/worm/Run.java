/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worm;

import java.awt.Color;

/**
 *
 * @author darnesey
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Visualizer vizzy = new Visualizer();
        Network test = vizzy.getNetwork();
        //test.paint(Color.yellow);
        vizzy.setVisible(true);
        
    }
    
}
