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
public class SOLDREPORT extends javax.swing.JFrame {

   Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs;
    DefaultTableModel model;
    public SOLDREPORT() {
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
        soldnow = new javax.swing.JTable();
        total = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        monthchooser = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        sold = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("SOLD REPORT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        soldnow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Product Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(soldnow);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 590, 200));

        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 140, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Number of product sold:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, 30));

        monthchooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT MONTH", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));
        monthchooser.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                monthchooserPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(monthchooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 140, 30));

        sold.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Product Name", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(sold);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 590, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TODAY'S SOLD REPORT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 220, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manolette/icons/icons8-logout-28.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
     EXPENSEREPORT s= new  EXPENSEREPORT();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    SOLDREPORT s= new  SOLDREPORT();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login s= new  Login();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     conn = DBConnection.getConnection(); 
  retrievesoldnow();
  retrievesold();
    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void monthchooserPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_monthchooserPopupMenuWillBecomeInvisible
 if (monthchooser.getSelectedItem().equals("JANUARY")) {
            january();
        }else if (monthchooser.getSelectedItem().equals("FEBRUARY")) {
            february();
        }else if(monthchooser.getSelectedItem().equals("MARCH")){
            march();
        }
        else if(monthchooser.getSelectedItem().equals("APRIL")){
            april();
        }else if(monthchooser.getSelectedItem().equals("MAY")){
            may();
        }else if(monthchooser.getSelectedItem().equals("JUNE")){
            june();
        }else if(monthchooser.getSelectedItem().equals("JULY")){
            july();
        }else if(monthchooser.getSelectedItem().equals("AUGUST")){
            august();
        }else if(monthchooser.getSelectedItem().equals("SEPTEMBER")){
            september();
        }else if(monthchooser.getSelectedItem().equals("OCTOBER")){
            october();
        }else if(monthchooser.getSelectedItem().equals("NOVEMBER")){
            november();
        }else if(monthchooser.getSelectedItem().equals("DECEMBER")){
            December();
        }
        else{
            retrievesold();
        }               // TODO add your handling code here:
    }//GEN-LAST:event_monthchooserPopupMenuWillBecomeInvisible

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped
  char vchar = evt.getKeyChar();
        char bchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))) {
            evt.consume();
        } else if (!(Character.isAlphabetic(bchar))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_totalKeyTyped

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
            java.util.logging.Logger.getLogger(SOLDREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SOLDREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SOLDREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SOLDREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SOLDREPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox monthchooser;
    private javax.swing.JTable sold;
    private javax.swing.JTable soldnow;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
private void retrievesoldnow() {
    try {
        String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE date = CURDATE()";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        soldnow.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
private void retrievesold() {
    try {
        String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        sold.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}private void january(){
       try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 1";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
   private void february(){
      try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 2";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
    private void march(){
      try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 3";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
     private void april(){
          try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 4";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
      private void may(){
         try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 5";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
       private void june(){
       try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 6";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
        private void july(){
    try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 7";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
         private void august(){
      try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 8";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
          private void september(){
        try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 9";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
           private void october(){
       try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 10";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
            private void november(){
      try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 11";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
             private void December(){
    try {
      String sql = "SELECT date AS 'Date', p_name AS 'Product Name', p_quantity AS 'Quantity' FROM transaction WHERE MONTH(date) = 12";
               pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                sold.setModel(DbUtils.resultSetToTableModel(rs));
                          int sum = 0;
        for (int i=0; i<sold.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(sold.getValueAt(i,2).toString());
        }
        total.setText(Integer.toString(sum));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }}
}
