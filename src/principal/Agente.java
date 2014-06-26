/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

public class Agente {

    int potencia, velocidad, salto, precision;
    int area_juego[];

    Agente(int habilidades[]) {

        this.potencia = habilidades[0];
        this.precision = habilidades[1];
        this.salto = habilidades[2];
        this.velocidad = habilidades[3];
    }

}
