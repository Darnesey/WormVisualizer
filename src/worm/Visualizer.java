/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author darnesey
 */
public class Visualizer extends javax.swing.JFrame {

    /**
     * Creates new form Visualizer
     */
    
    Network test = new Network();
    int reinfectionLevels = 50;
    int spreadRate = 50;
    int notVulnerable = 1000;
    
    public Visualizer() {
        initComponents();
        //Graphics g = new Graphics();
        test.protect(notVulnerable);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        environment = test;
        reinfected = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wormReproduction = new javax.swing.JSlider();
        vulnerables = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        simulate = new javax.swing.JButton();
        cleanScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Worms Visualizer");
        setBounds(new java.awt.Rectangle(0, 0, 1024, 700));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 700));

        environment.setBackground(new java.awt.Color(255, 255, 255));
        environment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        environment.setToolTipText("");
        environment.setPreferredSize(new java.awt.Dimension(1000, 1000));
        environment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reinfected.setMajorTickSpacing(50);
        reinfected.setMinorTickSpacing(10);
        reinfected.setPaintLabels(true);
        reinfected.setPaintTicks(true);
        reinfected.setSnapToTicks(true);
        reinfected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reinfectedMouseReleased(evt);
            }
        });

        jLabel1.setText("Reinfection Probability (%)");

        jLabel5.setText("Spread Rate per Worm");

        wormReproduction.setMajorTickSpacing(100);
        wormReproduction.setMaximum(500);
        wormReproduction.setMinorTickSpacing(50);
        wormReproduction.setPaintLabels(true);
        wormReproduction.setPaintTicks(true);
        wormReproduction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                wormReproductionMouseReleased(evt);
            }
        });

        vulnerables.setMajorTickSpacing(5000);
        vulnerables.setMaximum(10000);
        vulnerables.setPaintLabels(true);
        vulnerables.setPaintTicks(true);
        vulnerables.setValue(9000);
        vulnerables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vulnerablesMouseReleased(evt);
            }
        });

        jLabel9.setText("Number of Computers Vulnerable");

        simulate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        simulate.setText("Run Test");
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });

        cleanScreen.setText("Clean");
        cleanScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(cleanScreen))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reinfected, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wormReproduction, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vulnerables, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)))))
                .addGap(18, 18, 18)
                .addComponent(environment, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(environment, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reinfected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wormReproduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vulnerables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cleanScreen)
                .addGap(18, 18, 18)
                .addComponent(simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        // TODO add your handling code here:
        test.runTest(spreadRate, reinfectionLevels, notVulnerable);
    }//GEN-LAST:event_simulateActionPerformed

    private void vulnerablesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vulnerablesMouseReleased
        // TODO add your handling code here:
        notVulnerable = 10000 - vulnerables.getValue();
        test.protect(notVulnerable);
        
    }//GEN-LAST:event_vulnerablesMouseReleased

    private void cleanScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanScreenActionPerformed
        // TODO add your handling code here:
        test.clean();
    }//GEN-LAST:event_cleanScreenActionPerformed

    private void reinfectedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reinfectedMouseReleased
        // TODO add your handling code here:
        reinfectionLevels = reinfected.getValue();
    }//GEN-LAST:event_reinfectedMouseReleased

    private void wormReproductionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wormReproductionMouseReleased
        // TODO add your handling code here:
        spreadRate = wormReproduction.getValue();
    }//GEN-LAST:event_wormReproductionMouseReleased

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanScreen;
    public javax.swing.JPanel environment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider reinfected;
    private javax.swing.JButton simulate;
    private javax.swing.JSlider vulnerables;
    private javax.swing.JSlider wormReproduction;
    // End of variables declaration//GEN-END:variables

    public Network getNetwork(){
        return test;
    }
}

class Network extends JPanel {
        JPanel subLayout;
        Computer machine = new Computer(0,0);
        Computer[][] comps = new Computer[100][100];
        Random rand = new Random();
        int spreadRate;
        int infected = 1;
        float reinfLimit;
        float current = (float) (infected / 10000.0); //patient zero
        int pos_x = 5;
        int pos_y = 4;
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        ArrayList<Computer> list = new ArrayList<>();
        
        
        public Network() {
            drawNetwork();
        }
        
        public void runTest(int spreadRate, int reinfectionRate, int notVulnerable) {
            //clean tester
            cleanNotGreen();
            
            
            
            this.spreadRate = spreadRate;
            reinfLimit = (float) (reinfectionRate / 100.0);
            
            //For now, make computer 0,0 patient zero
            comps[0][0].clean();
            infect(comps[0][0]);
            list.add(comps[0][0]);
            //Pause... for effect...
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Network.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            spread();
            repaint();
            
        }
        
        public void drawNetwork(){
            
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    machine.setPos_x(pos_x);
                    machine.setPos_y(pos_y);
                    
                    comps[i][j] = machine;
                    repaint(machine.getPos_x(), machine.getPos_y(),
                            machine.COMP, machine.COMP);
                    
                    pos_x += 10;
                    machine = new Computer(i,j);
                }
                pos_x = 5; //reset width
                pos_y += 9;
            }
            pos_y = 4;
        }
        
        public void protect(int protection) {
            
            int x;
            int y;
            //Clear Screen
            clean();
            
            for (int i = 0; i < protection; i++) {
                do {
                    x = rand.nextInt(100);
                    y = rand.nextInt(100);
                } while (comps[x][y].getColor().equals(Color.GREEN));
                    comps[x][y].protect();
            }
            repaint();
        }
        
        public void clean() {
            infected = 1;
            current = infected / 10000;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    comps[i][j].clean();

                }
            }
            repaint();
        }
        
        private void cleanNotGreen() {
            infected = 1;
            current = infected / 10000;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (comps[i][j].color != Color.GREEN) {
                        comps[i][j].clean();
                    }
                }
            }
            repaint();
        }
        
        public boolean infect(Computer victim) {
            
            if(victim.infect()){
                
                repaint();
                return true;
            } else
                return false;
        }
        
        public void spread() {
            
            Computer attacker;
            int x;
            int y;
            int coorX;
            int coorY;
            int shift = 1;
            
            while (!list.isEmpty()) {
                attacker = list.remove(0);
                x = attacker.square_x;
                y = attacker.square_y;
                
                
                for (int i = 0; i < spreadRate; i++) {
                    coorX = rand.nextInt(100);
                    coorY = rand.nextInt(100);
                    if (coorX == x && coorY == y) { //shift to following computers to save run time
                        coorX = (coorX + shift) % 100;
                        shift++;
                    }
                    if (attacker.getWorms() == 0 || attacker.getWorms() >= 1 && current < reinfLimit){ //check reinfection limit
                        if (comps[coorX][coorY].infect()) { //try to infect, and then spread
                            list.add(comps[coorX][coorY]);
                            infected++;
                            current = (float) (infected / 10000.0);
                        }
                    }
                }
            }
        }
        

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    comps[i][j].paintComputer(g);
                }
            }        
        }
        
    }
