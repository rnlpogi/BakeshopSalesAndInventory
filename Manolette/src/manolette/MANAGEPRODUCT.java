/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manolette;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class MANAGEPRODUCT extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs;
    public MANAGEPRODUCT() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manage = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        product_id = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        exp = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        cat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manolette/icons/manolette_bakeshop-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MONITORING SYSTEM");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 310, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MANOLETTE BAKESHOP ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 60));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MANOLETTE BAKESHOP ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 60));

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SOLD REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 170, 40));

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("MANAGE PRODUCT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 170, 40));

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("EXPENSE REPORT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 170, 40));

        jButton7.setBackground(new java.awt.Color(51, 255, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("CASH REPORT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 170, 40));

        jButton8.setBackground(new java.awt.Color(51, 255, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("MANAGE USER");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 310, 700));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("MANAGE PRODUCT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        manage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Category", "Expenses", "Prices"
            }
        ));
        manage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(manage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 590, 390));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 90, 30));

        jButton6.setBackground(new java.awt.Color(51, 255, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 90, 30));
        jPanel1.add(product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 40, -1));

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 90, 30));

        exp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expKeyTyped(evt);
            }
        });
        jPanel1.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 140, 30));

        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnameKeyTyped(evt);
            }
        });
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 140, 30));

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 140, 30));

        cat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                catKeyTyped(evt);
            }
        });
        jPanel1.add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 140, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Prices:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Product Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Category:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Expenses:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manolette/icons/icons8-logout-28.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 710, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   MANAGEPRODUCT s= new  MANAGEPRODUCT();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    cashreport s= new  cashreport();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 manageuser s= new  manageuser();
        s.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     EXPENSEREPORT s= new EXPENSEREPORT();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     SOLDREPORT s= new  SOLDREPORT();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  save_data();
  product_id.setText("");
  pname.setText("");
 cat.setText("");
  exp.setText("");
  price.setText("");
  retrieve();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      conn =  DBConnection.getConnection(); 
     retrieve();
    }//GEN-LAST:event_formWindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   update();
  product_id.setText("");
  pname.setText("");
 cat.setText("");
  exp.setText("");
  price.setText("");
  retrieve();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   delete();
  product_id.setText("");
  pname.setText("");
 cat.setText("");
  exp.setText("");
  price.setText("");
  retrieve();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void manageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMouseClicked
 DefaultTableModel model=(DefaultTableModel)manage.getModel();
int selectedRowIndex=manage.getSelectedRow();
   product_id.setText(model.getValueAt(selectedRowIndex, 0).toString());
pname.setText(model.getValueAt(selectedRowIndex, 1).toString());
cat.setText(model.getValueAt(selectedRowIndex, 2).toString());
exp.setText(model.getValueAt(selectedRowIndex, 3).toString());
price.setText(model.getValueAt(selectedRowIndex, 4).toString());
    // TODO add your handling code here:
    }//GEN-LAST:event_manageMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Login s= new  Login();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void pnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyTyped

        char bchar = evt.getKeyChar();
         if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pnameKeyTyped

    private void catKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_catKeyTyped
  
        char bchar = evt.getKeyChar();
       if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_catKeyTyped

    private void expKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expKeyTyped
  char vchar = evt.getKeyChar();
       
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_expKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
  char vchar = evt.getKeyChar();
        
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } 
              // TODO add your handling code here:
    }//GEN-LAST:event_priceKeyTyped

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
            java.util.logging.Logger.getLogger(MANAGEPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MANAGEPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MANAGEPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MANAGEPRODUCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MANAGEPRODUCT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cat;
    private javax.swing.JTextField exp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manage;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JTextField product_id;
    // End of variables declaration//GEN-END:variables
private void retrieve(){
try {
    String sql = "SELECT product_id AS 'PRODUCT ID',p_name AS 'Product Name',p_category AS 'Category', p_expenses AS 'Expenses',p_prices AS 'PRICE'  FROM product_details";
pst = conn.prepareStatement(sql);
rs =pst.executeQuery();
manage.setModel(DbUtils.resultSetToTableModel(rs));
manage.removeColumn(manage.getColumnModel().getColumn(0));
}catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e);
}
}
private void save_data(){
    String one = pname.getText();
    String three = cat.getText();
    String four = exp.getText();
    String five = price.getText();
   
    
   if (one.equals("")||three.equals("")||four.equals("")||five.equals("")){
       JOptionPane.showMessageDialog(null, "SOME FIELDS ARE EMPTY");
   }else{
       try{
        
  String sql= "INSERT INTO product_details(p_name,p_category,p_expenses,p_prices)VALUE(?,?,?,?)";
   pst = conn.prepareStatement(sql);
 
   pst.setString(1, pname.getText());
   pst.setString(2,cat.getText());  
   pst.setString(3,exp.getText());
   pst.setString(4,price.getText());
       pst.execute();
      JOptionPane.showMessageDialog(null,"Product Added");
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    }
}
   }
   private void update(){
          String one = pname.getText();
    String three = cat.getText();
    String four = exp.getText();
    String five = price.getText();
   
    
   if (one.equals("")||three.equals("")||four.equals("")||five.equals("")){
       JOptionPane.showMessageDialog(null, "SOME FIELDS ARE EMPTY");
   }else{
    try{
        String sql="UPDATE product_details SET product_id = ?,p_name=?, p_category=?,p_expenses=?,p_prices=? WHERE product_id = '"+product_id.getText()+"'";
   pst = conn.prepareStatement(sql);
   pst.setString(1, product_id.getText());
   pst.setString(2, pname.getText());
   pst.setString(3,cat.getText());  
   pst.setString(4,exp.getText());
   pst.setString(5,price.getText());
       pst.execute();
        JOptionPane.showMessageDialog(null, "Product Updated Successfully");
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
   }
private void delete(){
    try{
        String sql = "SELECT * FROM product_details WHERE product_id='"+product_id.getText()+"'";
         pst = conn.prepareStatement(sql);
         rs=pst.executeQuery();
         if (rs.next()){
             String sql1 = "DELETE FROM product_details WHERE product_id='"+product_id.getText()+"'";
               pst = conn.prepareStatement(sql1);
             pst.execute();
             JOptionPane.showMessageDialog(null, "Product Deleted Permanently");
         }else{
             JOptionPane.showMessageDialog(null, "No Existing Data");
         }
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
}
}}
