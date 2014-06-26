/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JLabel;

/**
 *
 * @author Maverick
 */
public class AgenteDefensor extends Agente {

    private JLabel Imagen;

    public AgenteDefensor(int Habilidades[], JLabel Jugador) {

        super(Habilidades);
        this.Imagen = Jugador;
    }

    public void iniciar_Armador() {
        Hilo_defensor x = new Hilo_defensor(Imagen);
        x.start();
    }
}
