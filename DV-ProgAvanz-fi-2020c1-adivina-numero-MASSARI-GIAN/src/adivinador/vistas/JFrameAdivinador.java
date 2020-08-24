
package adivinador.vistas;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class JFrameAdivinador extends javax.swing.JFrame {

 
    public JFrameAdivinador(String titulo) {
        super(titulo);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonAdivinar = new javax.swing.JButton();
        jLabelPistas = new javax.swing.JLabel();
        jTextFieldNumeroIngresado = new javax.swing.JTextField();
        jLabelIngresaNumero = new javax.swing.JLabel();
        jLabelIntentos = new javax.swing.JLabel();
        jButtonReiniciar = new javax.swing.JButton();
        jButtonReglas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Adivina el Numero");

        jButtonAdivinar.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        jButtonAdivinar.setText("Adivinar");
        jButtonAdivinar.setToolTipText("");
        jButtonAdivinar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelPistas.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabelPistas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPistas.setText("Adivine el numero del 1 al 100");

        jLabelIngresaNumero.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabelIngresaNumero.setText("Ingresa el numero:");

        jLabelIntentos.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabelIntentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIntentos.setText("Tenes 7 intentos");

        jButtonReiniciar.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        jButtonReiniciar.setText("Reiniciar");

        jButtonReglas.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        jButtonReglas.setText("Reglas");
        jButtonReglas.setMaximumSize(new java.awt.Dimension(95, 23));
        jButtonReglas.setMinimumSize(new java.awt.Dimension(95, 23));
        jButtonReglas.setPreferredSize(new java.awt.Dimension(95, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIntentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPistas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonReglas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIngresaNumero)
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldNumeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonAdivinar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPistas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIngresaNumero)
                    .addComponent(jTextFieldNumeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonAdivinar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
        public void informarIntentos(int intentos){
            this.jLabelIntentos.setForeground(new Color(100, 200, 100));
            this.jLabelIntentos.setText("Te quedan "+intentos+" intentos");
        }
        
    public String getNumero(){
       return jTextFieldNumeroIngresado.getText();
    }
    
    public void informarEstado(int estado , int intentos){
       final int N_GANO=0;
       final int N_MAYOR=1;
       final int N_MENOR=-1;
        switch (estado) {
            case N_GANO:
                this.jLabelPistas.setForeground(new Color(100, 200, 100));
                this.jLabelPistas.setText("Muy alto");
                mostrarMensaje("Ganaste\nAdivinaste en "+ intentos +" intentos.","GANASTE!!!!");
                break;
            case N_MAYOR:
                this.jLabelPistas.setForeground(new Color(200, 100, 100));
                this.jLabelPistas.setText("Muy alto");
                break;
            case N_MENOR:
                this.jLabelPistas.setForeground(new Color(200, 100, 100));
                this.jLabelPistas.setText("Muy bajo");
                break;
            default:
                break;
        }
    }
    
     public void perdio(int numero){
        mostrarError("Perdiste el numero era " + numero +"\nCon la estrategia correcta es imposible perder el juego.");
    }
    
   public void reiniciar(){
       this.jLabelIntentos.setText("Tenes 7 intentos");
       this.jLabelPistas.setText("Adivine el numero del 1 al 100");
       this.jLabelPistas.setForeground(new Color(0, 0, 0));
       this.jLabelIntentos.setForeground(new Color(0, 0, 0));
       this.jTextFieldNumeroIngresado.setText("");
       mostrarMensaje("Se reinicio el juego","SE REINICIO");
   }
    public void numeroInvalido(){
        this.jTextFieldNumeroIngresado.setText("");
    }
    
    public void addHandlerAdivinar(ActionListener al){
        this.jButtonAdivinar.addActionListener(al);
        this.jTextFieldNumeroIngresado.addActionListener(al);
    }
    public void addHandlerReiniciar(ActionListener al){
        this.jButtonReiniciar.addActionListener(al);
    }
    public void addHandlerReglas(ActionListener al){
        this.jButtonReglas.addActionListener(al);
    }
    
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mostrarMensaje(String mensaje ,String titulo){
         JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostrarReglas(String mensaje){
         JOptionPane.showMessageDialog(this, mensaje, "Reglas", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdivinar;
    private javax.swing.JButton jButtonReglas;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabelIngresaNumero;
    private javax.swing.JLabel jLabelIntentos;
    private javax.swing.JLabel jLabelPistas;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldNumeroIngresado;
    // End of variables declaration//GEN-END:variables
}
