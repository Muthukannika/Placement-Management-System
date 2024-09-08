package placementmanagementsystem;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        forgot = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, 270, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 263, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jLabel2.setMaximumSize(new java.awt.Dimension(69, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(69, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(69, 17));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 263, 28));
        getContentPane().add(passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 270, 35));

        forgot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(0, 153, 0));
        forgot.setText("Forgot password?");
        forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotActionPerformed(evt);
            }
        });
        getContentPane().add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 460, 131, 31));

        login.setBackground(new java.awt.Color(51, 153, 0));
        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 460, 127, 31));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newLap.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 790));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 510, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Connection conn = null;
        Statement st;
        try{
                      
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysqlserver@3306");
            
            st = conn.createStatement();
            String query = "SELECT * FROM project.users WHERE userName = \""+userName.getText()+"\"AND passwd = \""+passwd.getText()+"\";";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){

                Statement st1 = conn.createStatement();
                String query1 = "SELECT * FROM project.college WHERE clgId = \""+userName.getText()+"\"AND passwd = \""+passwd.getText()+"\";";
                rs = st1.executeQuery(query1);
                
                if(rs.next()){
                    ClgPro clgPro = new ClgPro(userName.getText());
                }
                else{
                    CorporatePro corporatePro = new CorporatePro(userName.getText());
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "*** Invalid username and password ***");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "*** Login failed***");
        }
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotActionPerformed

        ForgotPasswd forgotPasswd = new ForgotPasswd();
        forgotPasswd.setVisible(true);
        
    }//GEN-LAST:event_forgotActionPerformed

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
    private javax.swing.JButton forgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
