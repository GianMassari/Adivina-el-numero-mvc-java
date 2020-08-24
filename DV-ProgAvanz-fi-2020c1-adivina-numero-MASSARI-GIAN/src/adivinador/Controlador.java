
package adivinador;

import adivinador.excepciones.DatoInvalidoException;
import adivinador.excepciones.NumeroInvalidoException;
import adivinador.modelo.Modelo;
import adivinador.vistas.JFrameAdivinador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author gian marco massari
 */
public class Controlador {
    private JFrameAdivinador vista;
    private Modelo modelo;
   

    public Controlador(JFrameAdivinador vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void iniciar() {
        this.vista.addHandlerAdivinar(new HandlerAdivinar());
        this.vista.addHandlerReiniciar(new HandlerReiniciar());
        this.vista.addHandlerReglas(new HandlerReglas());
        this.vista.setVisible(true);
    }
   
    public void adivinar(){
        try{
          this.vista.informarEstado(this.modelo.juego(verificarNumeroIngresado(this.vista.getNumero())),this.modelo.intentosUsados());
          this.vista.informarIntentos(this.modelo.getIntentos());
            if (this.modelo.gano(verificarNumeroIngresado(this.vista.getNumero()))) {
                 reiniciar();
            }else if(this.modelo.perdio()){
               this.vista.perdio(this.modelo.getNumero());
                reiniciar();
            }
        }catch (DatoInvalidoException | NumeroInvalidoException ex){
            this.vista.numeroInvalido();
           this.vista.mostrarError(ex.getMessage());
        }
    }
    
     private int verificarNumeroIngresado(String numeroVista){
    int numeroIngresado = numeroParseado(numeroVista);
   return numeroIngresado;   
  }
  
   
     
  private boolean esEntero(String numeroVista){ 
      try{
      Integer.parseInt(numeroVista);
      return true;
    } catch(RuntimeException e){
  return false;
          }
  }
  
  private int numeroParseado(String numeroVista)throws DatoInvalidoException{
      int convertido=0;
      if (esEntero(numeroVista)){
         convertido=Integer.parseInt(numeroVista);
          return convertido;
      }else{
          throw new DatoInvalidoException("Ingresa un numero valido\nSolo se permiten numeros enteros");
          
      }
  }
      private void reiniciar(){
        this.modelo.reiniciar();
         this.vista.reiniciar(); 
    }
      private void reglas(){
       this.vista.mostrarReglas(this.modelo.getReglas());
    }
    
    private class HandlerAdivinar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            adivinar();
        }
    
}
    private class HandlerReiniciar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            reiniciar();
        }
        
    }
    private class HandlerReglas implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            reglas();
        }
        
    }
}
