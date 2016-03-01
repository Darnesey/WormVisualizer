/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worm;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author darnesey
 */
public class Computer {
    int pos_x = 5;
    int pos_y = 4;
    final int COMP = 5;
    Color color = Color.WHITE;
    int worms = 0;
    boolean vulnerable = true;
//    public Computer(int pos_x, int pos_y){
//        this.pos_x = pos_x;
//        this.pos_y = pos_y;
//        
//    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }
    
    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWorms() {
        return worms;
    }
    
    public void protect() {
        vulnerable = false;
        this.setColor(Color.BLACK);
    }

    public boolean infect() {
        worms = worms+1;
        if (!vulnerable)
            return false;
        if (worms == 1){
            this.setColor(Color.ORANGE);
        } else if(worms > 1){
            this.setColor(Color.RED);
        }
        else{
            this.setColor(Color.BLACK);
        }            
        return true;
    }
    
    public void clean() {
        worms = 0;
        vulnerable = true;
        this.setColor(Color.WHITE);
    }
    
    
    public void paintComputer(Graphics g) {

        g.setColor(color);
        g.fillRect(pos_x, pos_y, COMP, COMP);
        g.setColor(Color.BLACK);
        g.drawRect(pos_x, pos_y, COMP, COMP); 

    }

    
}
