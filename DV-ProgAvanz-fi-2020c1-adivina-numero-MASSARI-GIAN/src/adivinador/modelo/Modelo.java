
package adivinador.modelo;
import adivinador.excepciones.NumeroInvalidoException;
import java.util.Random;

public class Modelo {
private int numero=0;
private final int N_INICIO = 1;
private final int N_FINAL = 100;
private final int N_INTENTOS = 7;
private int intentos=7;

    public Modelo() {
        generarNumero();
        
    }
    
    public int juego(int numeroVista){
    int respuesta;
    verificarRango(numeroVista);
    restarIntento();
    respuesta=estado(numeroVista);
    return respuesta;
    }
    
    public boolean perdio(){
        return intentos<1;
    }
    
    public boolean gano(int numeroVista){
        return this.numero==numeroVista;
    }
    
    
  public int estado(int numeroVista){
      int respuesta;
      if (numeroVista==this.numero){
          respuesta=0;
      }else if(numeroVista>this.numero){
          respuesta=1;
      }else{
          respuesta=-1;
      }
      return respuesta;
  }  
  private void restarIntento(){
      intentos--;
  }

  private void verificarRango(int numeroVista) throws NumeroInvalidoException{
      if (numeroVista < this.N_INICIO || numeroVista > this.N_FINAL){
          throw new NumeroInvalidoException("Ingrese un numero entre 1 y 100");
      }
  } 
  private void generarNumero(){
        Random r = new Random();
        numero=r.nextInt(100)+1;
  }
  
  public int intentosUsados(){
      return N_INTENTOS-this.intentos;
  }
  public String getReglas(){
      return "Bienvenido a Adivina el numero\nEl juego consiste en adivinar un numero entre 1 y 100\nTenes 7 intenos para adivinarlo\n"
              + "Con la estrategia correcta el juego es matematicamente imposible de perder\nUna pista , siempre es la mitad\nPara jugar podes apretar el boton adivinar o apretando enter";
  }
  public int getNumero(){
      return this.numero;
  }
  
  public int getIntentos(){
      return this.intentos;
  }
  
  public void reiniciar() {
      generarNumero();
      this.intentos=7;
    }
}



