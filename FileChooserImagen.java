
package ejemplohilo;

//Librerías necesarios para el programa
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class FileChooserImagen extends javax.swing.JFrame {

    public FileChooserImagen() {//Constructor
        initComponents();
        	this.setLocationRelativeTo(null);//La ventana aparece en el centro de la pantalla
		setTitle("IMAGEN CON FILECHOOSER");//Establece el título del frame
                this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jlbImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abrir imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlbImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton1)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Llama a la acción prevista con este método
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Final: los atributos de la clase no pueden ser cambiados
        JLabel imgen = new JLabel();//Se instancia el JLabel
        imgen.setPreferredSize(new Dimension(200,200));//Se establece dimensiones
        imgen.setHorizontalAlignment(JLabel.CENTER);//Que se ponga en el centro
        
        JFileChooser window=new JFileChooser();//creado el FileChooser
        window.setAccessory(imgen);//El FileChooser va a adquirir este acceso(a la imagen)
                                  //Vista previa
        window.addPropertyChangeListener(new PropertyChangeListener(){//Devuelve un texto null
        
            @Override
            public void propertyChange(PropertyChangeEvent evt){
                
                try{//Necesario para que sólo muestre imágenes
                    
                    if(evt.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)){
                        imgen.setText("");/*En caso de que se haya quedado guardado un texto,
                                            se borra el texto*/
                        //Para que tome la url de la imagen
                        imgen.setIcon(new ImageIcon(window.getSelectedFile().getPath()));
                    }
                    
                }catch(Exception e){
                    //Muestra un mensaje en caso de que no se selecciona un imagen
                    imgen.setText("El elemento no es una imagen");
                    //No contendrá nada en caso de que seleccione una carpeta
                    imgen.setIcon(new ImageIcon());
                }  
            }
        });//Propiedad para mostrar la imagen
        
            int Open = window.showOpenDialog(window);//(this)
            //En caso de que haya presionado una imagen y aceptar jalará la url de la img
            if(Open==JFileChooser.APPROVE_OPTION){
                String link= window.getSelectedFile().getPath();//Jala la url
                jlbImagen.setIcon(new ImageIcon(link));
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileChooserImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChooserImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChooserImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChooserImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChooserImagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlbImagen;
    // End of variables declaration//GEN-END:variables
}
