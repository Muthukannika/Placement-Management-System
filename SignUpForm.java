package placementmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class SignUpForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    
    public SignUpForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        reset = new javax.swing.JButton();
        done = new javax.swing.JButton();
        clgName = new javax.swing.JTextField();
        clgId = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        govt = new javax.swing.JRadioButton();
        aided = new javax.swing.JRadioButton();
        auto = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("College Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 122, 173, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("College Code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 187, 173, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Location");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 253, 173, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 323, 173, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 390, 173, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 462, 173, 30));
        getContentPane().add(passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 462, 451, 30));

        reset.setBackground(new java.awt.Color(153, 153, 153));
        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setForeground(java.awt.Color.white);
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 555, 225, 35));

        done.setBackground(new java.awt.Color(153, 153, 153));
        done.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        done.setForeground(java.awt.Color.white);
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        getContentPane().add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 555, 208, 35));
        getContentPane().add(clgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 123, 443, 30));
        getContentPane().add(clgId, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 189, 443, 30));
        getContentPane().add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 256, 443, 30));
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 391, 443, 30));

        type.add(govt);
        govt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        govt.setText("Government");
        getContentPane().add(govt, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 323, 135, 30));

        type.add(aided);
        aided.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aided.setText("Govt - Aided");
        getContentPane().add(aided, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 323, 125, 30));

        type.add(auto);
        auto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        auto.setText("Autonomous");
        getContentPane().add(auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 323, 147, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1327, 18, 33, -1));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/f4.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mysqlserver@3306");
            String query = "INSERT INTO project.college VALUES(?,?,?,?,?,?);";
            
            String clgType = null;
            if(govt.isSelected())
                clgType = "Government";
            if(aided.isSelected())
                clgType = "Govt - Aided";
            if(auto.isSelected())
                clgType = "Autonomous";
            
            pst = conn.prepareStatement(query);
            pst.setString(1, clgId.getText());
            pst.setString(2, clgName.getText());
            pst.setString(3, location.getText());
            pst.setString(4,clgType);
            pst.setString(5, mail.getText());
            pst.setString(6, passwd.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Account was created successfully !!!");
            
            query = "INSERT INTO project.users VALUES(?,?);";
            pst = conn.prepareStatement(query);
            pst.setString(1, clgId.getText());
            pst.setString(2, passwd.getText());
            pst.executeUpdate();
            
            Login login = new Login();
            login.setVisible(true);
            
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "*** Error occured ***");
        }
        
    }//GEN-LAST:event_doneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        clgName.setText("");
        location.setText("");
        clgId.setText("");
        mail.setText("");
        passwd.setText("");
        govt.setSelected(false);
        aided.setSelected(false);
        auto.setSelected(false);
        
    }//GEN-LAST:event_resetActionPerformed


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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aided;
    private javax.swing.JRadioButton auto;
    private javax.swing.JTextField clgId;
    private javax.swing.JTextField clgName;
    private javax.swing.JButton done;
    private javax.swing.JRadioButton govt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField location;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JButton reset;
    private javax.swing.ButtonGroup type;
    // End of variables declaration//GEN-END:variables
}
