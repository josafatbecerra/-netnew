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
public class Hilo_defensor extends Thread {

    JLabel Defensor;

    Hilo_defensor(JLabel Imagen) {
        Defensor = Imagen;
    }

    

    @Override
    public void run() {
        System.out.println("Agente Defensor En espera...");
    }

    public void Recibe_Balon() {

    }

    public void Pasar_Balon() {

    }

    public void Definir_pase() {

    }

}
