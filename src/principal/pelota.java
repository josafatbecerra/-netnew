/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Humberts90
 */
public class pelota extends Thread{
    Pintar pinta;
    boolean lado = true;
    public pelota(Pintar pin) {
        pinta = pin;
    }

    @Override
    public void run() {
        super.run();
        
        while(true){
            boolean var;
            if(lado){
            var = 
                    pinta.balon.getBounds().intersects(pinta.J1.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J2.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J3.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J4.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J5.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J6.getBounds()); 
                    if(var)
                        lado = false;
            }else{
            
            var =
                    pinta.balon.getBounds().intersects(pinta.J7.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J8.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J9.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J10.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J11.getBounds()) ||
                    pinta.balon.getBounds().intersects(pinta.J12.getBounds());
                    if(var)
                        lado = true;
            }
            try {
                pinta.balonx+=pinta.DirX;
                pinta.balony-=pinta.DirY;

                //Controlo que cuando toca el borde, cambie de direccion
                if ((pinta.balonx-45) <= 0 || var)
                pinta.DirX*= -1;
                
                else if ((pinta.balonx+45) >= pinta.w || var)
                pinta.DirX*= -1;

                if ((pinta.balony-45) <= 0 || var)
                pinta.DirY*= -1;
                else if ((pinta.balony+45) >= pinta.h || var)
                pinta.DirY*= -1; 
                
                pinta.balon.setLocation(pinta.balonx, pinta.balony);
               

// System.out.println(pinta.balon.getBounds().intersects(pinta.balon.getBounds()));
  
                
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(pelota.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
