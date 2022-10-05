


import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author iftiaj
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMain.jpg")));
        this.setResizable(false);
        this.setTitle("Blood Donation Management System");
       this.getContentPane().setBackground(new Color(102,204,242,255)); 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        getContentPane().setLayout(null);

        usernameLabel.setBackground(new java.awt.Color(0, 153, 153));
        usernameLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(260, 210, 80, 20);

        passwordLabel.setBackground(new java.awt.Color(0, 153, 153));
        passwordLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(260, 250, 80, 20);
        getContentPane().add(usernameText);
        usernameText.setBounds(350, 210, 150, 22);

        passwordText.setText("jPasswordField1");
        getContentPane().add(passwordText);
        passwordText.setBounds(350, 250, 150, 22);

        loginButton.setBackground(new java.awt.Color(0, 153, 0));
        loginButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(330, 300, 120, 30);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donate Blood Save Life");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginBG.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 480);

        setSize(new java.awt.Dimension(792, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameText.getText();
        String pass = passwordText.getText();
        
        if(username.equals("admin") && pass.equals("1234")) {
            usernameText.setText("");
            passwordText.setText("");
            
            Home home = new Home();
            home.setVisible(true);
            dispose(); //close the current window
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid username or password! Please try again.");
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        
        String username = usernameText.getText();
        String password = passwordText.getText();
        
        try{
            String query = "SELECT username, password FROM login WHERE username = '"+username+"' AND password = '"+password+"'";
        Statement st = DBconnection.con.createStatement();
        ResultSet rs = st.executeQuery(query);
        if (rs.next()){ // if query execute then show the home page
            Home home = new Home();
            home.show();
            dispose(); //close the current window
           
           
        }else{
            JOptionPane.showMessageDialog(null, "Invalid username or password! Please try again.");
            usernameText.setText(""); //if email pr pass is invalid then clear the text fields 
            passwordText.setText("");
        }
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Login Failed!" + e);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
