/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_design_trials;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class design_trial_5 extends javax.swing.JFrame {

    
    public design_trial_5() {
        initComponents();
        DBTABLE();
        getContentPane().setBackground(Color.WHITE); 
        
    }

    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          jScrollPane1 = new javax.swing.JScrollPane();
          jTextPane1 = new javax.swing.JTextPane();
          jScrollPane2 = new javax.swing.JScrollPane();
          jTextPane2 = new javax.swing.JTextPane();
          jScrollPane3 = new javax.swing.JScrollPane();
          jTextPane3 = new javax.swing.JTextPane();
          jScrollPane4 = new javax.swing.JScrollPane();
          jTextPane4 = new javax.swing.JTextPane();
          jScrollPane5 = new javax.swing.JScrollPane();
          jTextPane5 = new javax.swing.JTextPane();
          jScrollPane6 = new javax.swing.JScrollPane();
          jTextPane6 = new javax.swing.JTextPane();
          jScrollPane7 = new javax.swing.JScrollPane();
          jTextPane7 = new javax.swing.JTextPane();
          jButton1 = new javax.swing.JButton();
          jButton2 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();
          jButton4 = new javax.swing.JButton();
          jButton6 = new javax.swing.JButton();
          jLabel8 = new javax.swing.JLabel();
          jPanel1 = new javax.swing.JPanel();
          jScrollPane10 = new javax.swing.JScrollPane();
          jTextArea2 = new javax.swing.JTextArea();
          jLabel9 = new javax.swing.JLabel();
          jScrollPane9 = new javax.swing.JScrollPane();
          jTable1 = new javax.swing.JTable();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setBackground(new java.awt.Color(255, 255, 255));
          setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
          setForeground(new java.awt.Color(255, 255, 255));

          jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel1.setText("CUSTOMER_ID");

          jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel2.setText("FIRST_NAME");

          jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel3.setText("LAST_NAME");

          jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel4.setText("STREET");

          jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel5.setText("CITY");

          jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel6.setText("STATE");

          jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel7.setText("ZIPCODE");

          jTextPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane1.setViewportView(jTextPane1);

          jTextPane2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane2.setViewportView(jTextPane2);

          jTextPane3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane3.setViewportView(jTextPane3);

          jTextPane4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane4.setViewportView(jTextPane4);

          jTextPane5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane5.setViewportView(jTextPane5);

          jTextPane6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane6.setViewportView(jTextPane6);

          jTextPane7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jScrollPane7.setViewportView(jTextPane7);

          jButton1.setBackground(new java.awt.Color(153, 255, 102));
          jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
          jButton1.setText("ADD");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jButton2.setBackground(new java.awt.Color(153, 255, 102));
          jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
          jButton2.setText("FIND");
          jButton2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
               }
          });

          jButton3.setBackground(new java.awt.Color(153, 255, 102));
          jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
          jButton3.setText("UPDATE TABLE");
          jButton3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
               }
          });

          jButton4.setBackground(new java.awt.Color(153, 255, 102));
          jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
          jButton4.setText("DELETE ALL FIELDS");
          jButton4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
               }
          });

          jButton6.setBackground(new java.awt.Color(153, 255, 102));
          jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
          jButton6.setText("DELETE RECORD");
          jButton6.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
               }
          });

          jLabel8.setBackground(new java.awt.Color(255, 255, 255));
          jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
          jLabel8.setForeground(new java.awt.Color(255, 102, 102));
          jLabel8.setText("CUSTOMER DATA");
          jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));

          jTextArea2.setColumns(20);
          jTextArea2.setRows(5);
          jTextArea2.setBorder(null);
          jScrollPane10.setViewportView(jTextArea2);

          jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
          jLabel9.setText("NOTES:");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(10, 10, 10)
                              .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(0, 447, Short.MAX_VALUE)))
                    .addContainerGap())
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane10)
                    .addContainerGap())
          );

          jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
          jTable1.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null}
               },
               new String [] {
                    "CUSTOMER_ID", "FIRSTNAME", "LASTNAME", "STREET", "CITY", "STATE", "ZIPCODE"
               }
          ));
          jTable1.setColumnSelectionAllowed(true);
          jTable1.setGridColor(new java.awt.Color(255, 255, 255));
          jScrollPane9.setViewportView(jTable1);
          jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addGap(766, 766, 766)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(layout.createSequentialGroup()
                                                  .addGap(13, 13, 13)
                                                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGap(53, 53, 53)
                                                  .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGap(50, 50, 50)
                                                  .addComponent(jButton4))
                                             .addGroup(layout.createSequentialGroup()
                                                  .addGap(12, 12, 12)
                                                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                       .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                 .addComponent(jLabel3)
                                                                 .addComponent(jLabel1))
                                                            .addGap(46, 46, 46)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                 .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                       .addComponent(jLabel2))))
                                        .addGap(144, 144, 144)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addGroup(layout.createSequentialGroup()
                                                  .addComponent(jLabel4)
                                                  .addGap(31, 31, 31)
                                                  .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(layout.createSequentialGroup()
                                                  .addComponent(jLabel7)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                  .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(layout.createSequentialGroup()
                                                  .addComponent(jLabel6)
                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                  .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(layout.createSequentialGroup()
                                                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGap(42, 42, 42)
                                                  .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(jScrollPane9)))
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel8)
                    .addGap(69, 69, 69)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(4, 4, 4)))
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(45, 45, 45)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(63, 63, 63)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(45, 45, 45)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(33, 33, 33)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(75, 75, 75))
               .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(524, 524, 524))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        int result;
	result=JOptionPane.showConfirmDialog(this,"Do U want to Save the Record?");
	switch(result)
	{
	case JOptionPane.YES_OPTION:
	System.out.println("yes button was pressed");
        {Class.forName("oracle.jdbc.driver.OracleDriver");
        
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gopalan");
                    PreparedStatement p=con.prepareStatement("insert into customers values(?,?,?,?,?,?,?)");

                    p.setInt(1,Integer.parseInt(jTextPane1.getText()));
                    p.setString(2,jTextPane2.getText());
                    p.setString(3,jTextPane3.getText());
                    p.setString(4,jTextPane4.getText());
                    p.setString(5,jTextPane5.getText());
                    p.setString(6,jTextPane6.getText());
                    p.setInt(7,Integer.parseInt(jTextPane7.getText()));

                    p.executeUpdate();
                     new design_trial_5().setVisible(true);
                     dispose();
          
        }
	break;
	case JOptionPane.NO_OPTION:
	System.out.println("no button was pressed");
	break;
	case JOptionPane.CANCEL_OPTION:
	System.out.println("Dialog closed");
	break;      
        }}
 catch(Exception ex){
     System.out.println(ex);}  
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gopalan");
PreparedStatement p=con.prepareStatement("select * from customers where customer_id=?");
p.setInt(1,Integer.parseInt(jTextPane1.getText()));
ResultSet rs=p.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}
     catch(Exception ex){
System.out.println(ex);       
}
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gopalan");
              
              PreparedStatement p=cn.prepareStatement("update customers set first_name=?,last_name=?,street=?,city=?,state=?,zip_code=? where customer_id=?");
              
              for(int i=0;i<jTable1.getRowCount();i++){
                String a=jTable1.getValueAt(i, 0).toString();
                int a1=Integer.parseInt(a);
                  p.setInt(7, a1);
                  System.out.println("taken");
                  System.out.println(a1);
                           
                 String b=jTable1.getValueAt(i, 1).toString();
                 p.setString(1, b);
                  System.out.println(b);

                 String c=jTable1.getValueAt(i, 2).toString();
                 p.setString(2, c);
                  System.out.println(c);
         
                 String d=jTable1.getValueAt(i, 3).toString();
                 p.setString(3, d);
                  System.out.println(d);
            
                 String e=jTable1.getValueAt(i, 4).toString();
                 p.setString(4, e);
                  System.out.println(e);
                               
                 String f=jTable1.getValueAt(i, 5).toString();
                 p.setString(5, f);
                  System.out.println(f);
           
                 String g=jTable1.getValueAt(i, 6).toString();
                 p.setString(6, g);
                  System.out.println(g);
                  
                  p.executeUpdate();
              }
                
          
                     System.out.println("done executing");
        }
          
        catch(Exception e){
                System.out.println(e);
                }
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gopalan");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from customers");
jTextPane1.setText("");
jTextPane2.setText("");
jTextPane3.setText("");
jTextPane4.setText("");
jTextPane5.setText("");
jTextPane6.setText("");
jTextPane7.setText("");
    
}
catch(Exception ex){
System.out.println(ex);       
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gopalan");
Statement st=con.createStatement();
PreparedStatement p=con.prepareStatement("delete from customers where customer_id=?");
p.setInt(1,Integer.parseInt(jTextPane1.getText()));
ResultSet rs=p.executeQuery();
new design_trial_5().setVisible(true);
                     dispose();
    
}
catch(Exception ex){
System.out.println(ex);       
}       
    }//GEN-LAST:event_jButton6ActionPerformed
 public void DBTABLE(){ 
         try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gopalan");
              PreparedStatement p=cn.prepareStatement("select * from customers");
              ResultSet rs = p.executeQuery();
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         } 
        
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
 }

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
            java.util.logging.Logger.getLogger(design_trial_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(design_trial_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(design_trial_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(design_trial_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new design_trial_5().setVisible(true);
            }
        });
    }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JButton jButton6;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JLabel jLabel9;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane10;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JScrollPane jScrollPane3;
     private javax.swing.JScrollPane jScrollPane4;
     private javax.swing.JScrollPane jScrollPane5;
     private javax.swing.JScrollPane jScrollPane6;
     private javax.swing.JScrollPane jScrollPane7;
     private javax.swing.JScrollPane jScrollPane9;
     private javax.swing.JTable jTable1;
     private javax.swing.JTextArea jTextArea2;
     private javax.swing.JTextPane jTextPane1;
     private javax.swing.JTextPane jTextPane2;
     private javax.swing.JTextPane jTextPane3;
     private javax.swing.JTextPane jTextPane4;
     private javax.swing.JTextPane jTextPane5;
     private javax.swing.JTextPane jTextPane6;
     private javax.swing.JTextPane jTextPane7;
     // End of variables declaration//GEN-END:variables
}
