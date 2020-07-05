/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author Admin
 */
public class EditCustomer extends javax.swing.JFrame {

    ArrayList<Handphone> hpList;
    ArrayList<Customer> cusList;
    DecimalFormat formatterP;
    /**
     * Creates new form EditCustomer
     */
    public EditCustomer() {
        initComponents();
        
        formatterP = new DecimalFormat("#,###.00");
        
        hpList = new ArrayList<Handphone>();
        cusList = new ArrayList<Customer>();
        populateArrayList();
        
        //Customer ArrayList for ComboBox 
        String [] cusArray = new String[cusList.size()];
        
        for(int i=0; i<cusList.size(); i++)
        {
            cusArray[i] = cusList.get(i).getName();
        }
        
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(cusArray));
        
        
        //Handphone ArrayList for ComboBox
        String [] hpArray = new String[hpList.size()];
        
        for(int i=0; i<hpList.size(); i++)
        {
            hpArray[i] = hpList.get(i).getHp() + ",  RM" 
                    + formatterP.format((hpList.get(i).getHpPrice()));
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(hpArray));
        
    }
    
    public void saveCus(){
        try
        {
            FileOutputStream file = new FileOutputStream("Customers.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i = 0 ; i< cusList.size(); i++)
            {
                outputFile.writeObject(cusList.get(i));
            }
            outputFile.close();
            
            JOptionPane.showMessageDialog(null,"Successfully saved!!");
            this.dispose();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deleteCus(){
        try
        {
            FileOutputStream file = new FileOutputStream("Customers.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i = 0 ; i< cusList.size(); i++)
            {
                outputFile.writeObject(cusList.get(i));
            }
            outputFile.close();
            
            JOptionPane.showMessageDialog(null,"Successfully deleted!!");
            this.dispose();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void populateArrayList()
    {
        try
        {
            FileInputStream file = new FileInputStream("Handphone.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {
                    hpList.add((Handphone)inputFile.readObject());
                }
                catch(EOFException e)
                {
                   endOfFile = true; 
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            inputFile.close();
        }
        catch (IOException e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        
        try //second try catch
        {
            FileInputStream file2 = new FileInputStream("Customers.dat");
            ObjectInputStream inputFile2 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {
                    cusList.add((Customer)inputFile2.readObject());
                }
                catch(EOFException e)
                {
                   endOfFile = true; 
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            inputFile2.close();
        }
        catch (IOException e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Customer Details");

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setText("Edit Customer's Details :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Customer's name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Customer's contact number :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Handphone customer bought :");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment3/edit.png"))); // NOI18N
        jButton1.setText("Confirm Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Choose customers :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignment3/exit.png"))); // NOI18N
        jButton2.setText("Delete Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
        int selectedInt = jComboBox2.getSelectedIndex();
        
        jTextField1.setText(cusList.get(selectedInt).getName());
        jTextField2.setText((cusList.get(selectedInt).getNumber()+""));
        
        Handphone hp = cusList.get(selectedInt).getHp();
        
        int index= 0;
        for(int i=0; i < hpList.size(); i++)
        {
            if (hpList.get(i).equals(hp))
            {
                index = i;
                break;
            }
        }
        
        jComboBox1.setSelectedIndex(index);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null,"Please enter EVERY fields!");
        }
        else 
        {
            int selectedIndex = jComboBox2.getSelectedIndex();
            cusList.get(selectedIndex).setName(jTextField1.getText().trim());
            cusList.get(selectedIndex).setNumber
                    (Integer.parseInt(jTextField2.getText().trim()));
            Handphone hp = hpList.get(jComboBox1.getSelectedIndex());
            cusList.get(selectedIndex).setHp(hp);
            
            saveCus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedIndex = jComboBox2.getSelectedIndex();
        
        cusList.remove(selectedIndex);
        deleteCus();
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
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}