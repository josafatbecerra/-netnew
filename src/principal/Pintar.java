/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.*;

/**
 *
 * @author Maverick
 */
public class Pintar {

    public int balonx = 155;
    public int balony = 385;
    public int DirX=balonx % (25 + (int)(Math.random()*35))+1; //Dirección de la pelota
    public int DirY=balony % 25 +1; //Dirección de la pelota 
    
    public int w = 800, h = 600;
    public JLabel balon, J1, J2, J3, J4, J5, J6, J7,J8, J9, J10, J11, J12;
    public void pintarcancha() {
        JFrame vent = new JFrame("Volleyball Team UNET");
        JLabel fondo = new JLabel(new ImageIcon("cancha.jpg"));
        J1 = new JLabel(new ImageIcon("4m.png"));
        J2 = new JLabel(new ImageIcon("3m.png"));
        J3 = new JLabel(new ImageIcon("3m.png"));
        J4 = new JLabel(new ImageIcon("3m.png"));
        J5 = new JLabel(new ImageIcon("4m.png"));
        J6 = new JLabel(new ImageIcon("4m.png"));
        
        
        J7 = new JLabel(new ImageIcon("1.png"));
        J8 = new JLabel(new ImageIcon("2m.png"));
        J9 = new JLabel(new ImageIcon("2m.png"));
        
        J10 = new JLabel(new ImageIcon("1.png"));
        J11 = new JLabel(new ImageIcon("1.png"));
        J12 = new JLabel(new ImageIcon("2m.png"));
        
        balon = new JLabel(new ImageIcon("balon.png"));
        vent.setBounds(0, 0, 800, 600);

        J2.setBounds(700, 100, 60, 90);
        J1.setBounds(690, 250, 60, 90);
        J3.setBounds(700, 370, 60, 90);

        J5.setBounds(540, 100, 60, 90);
        J4.setBounds(599, 250, 60, 90);
        J6.setBounds(560, 370, 60, 90);
        
        
        
        J7.setBounds(100, 100, 60, 90);
        J8.setBounds(190, 250, 60, 90);
        J9.setBounds(100, 370, 60, 90);

        J10.setBounds(240, 100, 60, 90);
        J11.setBounds(299, 250, 60, 90);
        J12.setBounds(260, 370, 60, 90);
        
        
        balon.setBounds(balonx, balony, 30, 30);
        
        vent.getContentPane().add(balon);
        vent.getContentPane().add(J12);
        vent.getContentPane().add(J11);
        vent.getContentPane().add(J10);
        vent.getContentPane().add(J9);
        vent.getContentPane().add(J8);
       vent.getContentPane().add(J7);
        
        vent.getContentPane().add(J6);
        vent.getContentPane().add(J5);
        vent.getContentPane().add(J4);
        vent.getContentPane().add(J3);
        vent.getContentPane().add(J2);
        vent.getContentPane().add(J1);
        vent.getContentPane().add(fondo);
        vent.setVisible(true);
        vent.setResizable(false);
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void movercontrarios() {

    }

}
