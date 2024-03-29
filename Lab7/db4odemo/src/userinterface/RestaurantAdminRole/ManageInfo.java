/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;


public class ManageInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageInfo
     */
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageInfo(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
         nameTxt.setEnabled(false);
        addressTxt.setEnabled(false);
        numTxt.setEnabled(false);
        SaveBtn.setEnabled(false);
        UpdateBtn.setEnabled(true);
        
        setTextFields();
    }
    
    public void setTextFields(){
        for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
           if(restro.getAdminUName().equals(account.getUsername())){
               nameTxt.setText(restro.getName());
               addressTxt.setText(restro.getAddress());
               numTxt.setText(restro.getNumber());
            }
           //System.out.println(restro.getAdminUName());
            
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        numTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Restaurant Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jLabel3.setText("Phone Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 150, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 150, -1));

        numTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTxtActionPerformed(evt);
            }
        });
        add(numTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 150, -1));

        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void numTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        String name=nameTxt.getText();
        String address=addressTxt.getText();
        String number=numTxt.getText();
       
        for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
           if(restro.getAdminUName().equals(account.getUsername())){
                system.getRestaurantDirectory().updateRestaurantInfo(restro,name, number, address);
            }
          
            
        }
        
        
        //System.out.println(system.getRestaurantDirectory().getRestaurantList().get(0).getName());
        
        //system.getRestaurantDirectory().getRestaurantList().updateRestaurantInfo(name, number, address);
        nameTxt.setEnabled(false);
        addressTxt.setEnabled(false);
        numTxt.setEnabled(false);
        SaveBtn.setEnabled(false);
        UpdateBtn.setEnabled(true);
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
         nameTxt.setEnabled(true);
        addressTxt.setEnabled(true);
        numTxt.setEnabled(true);
        SaveBtn.setEnabled(true);
        UpdateBtn.setEnabled(false);
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
       
        
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numTxt;
    // End of variables declaration//GEN-END:variables
}
