/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_management;

import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
public class AddEmployee extends javax.swing.JFrame {

    Connection con=null;
    Statement stm=null;
    public AddEmployee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        empid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        education = new javax.swing.JComboBox<>();
        aadhar = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        father = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 64, 141, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DATE OF BIRTH");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 132, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ADDRESS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 288, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DESIGNATION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 366, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("EMPLOYEE ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 438, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 68, 124, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 134, 124, -1));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 214, 124, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 292, 124, -1));
        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 368, 124, -1));
        jPanel1.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 442, 124, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("FATHERS NAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 64, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("SALARY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 131, 140, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("PHONE NO.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("HIGHEST EDUCATION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 288, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("AADHAR NUMBER");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 364, -1, -1));

        education.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.TECH", "M.TECH", "MBA", "MCA", "MBBS", "CHARTED ACCOUNTANT", "B.SC", "B.ED" }));
        jPanel1.add(education, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 292, 102, -1));
        jPanel1.add(aadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 368, 102, -1));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 214, 102, -1));
        jPanel1.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 134, 103, -1));
        jPanel1.add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 68, 103, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ADD DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 502, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 502, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("ADD EMPLOYEE DETAILS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 0, 234, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("PASSWORD");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 434, -1, 20));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dd=new SimpleDateFormat("dd-MM-yyyy");
        String name=this.name.getText();
        String date=dd.format(this.date.getDate());
        String address=this.address.getText();
        String email=this.email.getText();
        String designation=this.designation.getText();
        String empid=this.empid.getText();
        String father=this.father.getText();
        String salary=this.salary.getText();
        String phone=this.phone.getText();
        String education=this.education.getItemAt(0);
        String aadhar=this.aadhar.getText();
        String password=this.pass.getText();
        try{
         
             con=ConnectionClass.getConnect();
               
             stm=con.createStatement();
             
             con.setAutoCommit(false);
             
             stm.executeUpdate("insert into newlogin2 values('"+name+"','"+date+"','"+address+"','"+email+"','"+designation+"','"+empid+"','"+father+"','"+salary+"','"+phone+"','"+education+"','"+aadhar+"','"+password+"')");
             
             con.commit();
             
                     JOptionPane.showMessageDialog(null,"REGISTRATION SUCESSFULLY");
                     int status=JOptionPane.OK_OPTION;
          if(status==0)
          {
              setVisible(false);
              new Login_Page().setVisible(true);
          }
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null,ex);
             ex.printStackTrace();
         } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EmployeeHome_Page ep=new EmployeeHome_Page();
        ep.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField designation;
    private javax.swing.JComboBox<String> education;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField father;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables
}
