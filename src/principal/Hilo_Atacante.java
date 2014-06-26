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
public class Hilo_Atacante extends Thread {

    JLabel Atacante;

    Hilo_Atacante(JLabel Imagen) {
        Atacante = Imagen;
    }

    @Override
    public void run() {
        System.out.println("Agente Atacante En espera...");
    }

    public void Recibe_Balon() {

    }

    public void Pasar_Balon() {

    }
    
    public void Encontrar_Zona_Ataque(){
        
    }
    public void Definir_estrategia(){
        
    }

}
