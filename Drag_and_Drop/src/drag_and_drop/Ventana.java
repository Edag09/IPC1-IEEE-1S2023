package drag_and_drop;

import java.io.*;
import javax.swing.*;
import Clases.ListaSimple_Usuarios;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private String user_ = "Eduardo";
    ListaSimple_Usuarios usuarios = new ListaSimple_Usuarios();
    private String contrasenia_ = "gatitos93";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sesion = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sesion.setBackground(new java.awt.Color(204, 255, 102));
        sesion.setFont(new java.awt.Font("Candara", 3, 20)); // NOI18N
        sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar-sesion.png"))); // NOI18N

        btn_login.setFont(new java.awt.Font("Candara", 3, 22)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_registro.setFont(new java.awt.Font("Candara", 3, 22)); // NOI18N
        btn_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro-en-linea.png"))); // NOI18N
        btn_registro.setText("Registrarse");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Consolas", 3, 20)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("Usuario");

        password.setFont(new java.awt.Font("Consolas", 3, 20)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Contraseña");

        txt_user.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N

        title.setFont(new java.awt.Font("Candara", 3, 22)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Inicio de Sesión");

        txt_password.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Candara", 3, 22)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subir.png"))); // NOI18N
        jButton1.setText("Carga Masiva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(btn_login)
                .addGap(18, 18, 18)
                .addComponent(btn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_password))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sesion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesion)
                .addGap(18, 18, 18)
                .addComponent(title)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_registro)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if(txt_user.getText().isEmpty() || txt_password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor no dejar los campos requeridos en blanco");
        }else if(usuarios.siexiste(txt_password.getText())){
            txt_user.setText("");
            txt_password.setText("");
            JOptionPane.showMessageDialog(null, "Bienvenido, acabas de iniciar sesion");
        }else{
            txt_user.setText("");
            txt_password.setText("");
            JOptionPane.showMessageDialog(null, "Por favor ingresa las credenciales correctas");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        Registro rg = new Registro();
        rg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_registroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path = "";
        String[] text;
        long dpi = 0;
        int telefono = 0;
        double sueldo = 0.0;
        int edad = 0;
        try{
            JFileChooser win = new JFileChooser();
            win.showOpenDialog(this);
            File abrir = win.getSelectedFile();

            if (abrir != null) {
                FileReader archivo = new FileReader(abrir);
                BufferedReader leer = new BufferedReader(archivo);
                while ((path=leer.readLine())!=null) {                    
                    text = path.split(":");
                    dpi = Long.parseLong(text[0]);
                    telefono = Integer.parseInt(text[3]);
                    sueldo = Double.parseDouble(text[4]);
                    edad = Integer.parseInt(text[6]);
                    usuarios.add_User(text[1], text[2], telefono, dpi, sueldo, text[5], edad, text[7], text[8]);
                }
                usuarios.imprimir();
                leer.close();
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel sesion;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
