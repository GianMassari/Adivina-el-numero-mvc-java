
package adivinador;

import adivinador.modelo.Modelo;
import adivinador.vistas.JFrameAdivinador;


public class Principal {
   public static void main(String[] args) {
        JFrameAdivinador v = new JFrameAdivinador("Adivina el numero");
        Modelo m = new Modelo();
        Controlador c = new Controlador(v,m);
        c.iniciar();
    }

} 

