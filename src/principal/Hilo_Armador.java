/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JLabel;

/**
 *
 * @author Josafat
 */
public class Hilo_Armador extends Thread {

    JLabel Armador;

    Hilo_Armador(JLabel Imagen) {
        Armador = Imagen;
    }

    @Override
    public void run() {
        System.out.println("Agente Armador En espera...");
    }
    
    
    public void Recibe_Balon(){
        
    }
    
    public void Pasar_Balon(){
        
    }
    
    public void Definir_Atacante(){
        
    }
    
    

}
