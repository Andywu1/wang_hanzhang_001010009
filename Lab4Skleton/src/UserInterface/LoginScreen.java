/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    private List<User> list;
    private JPanel panelRight;
    private String role;
    public LoginScreen(JPanel panelRight, List<User> list,String roleString) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        this.role=roleString;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();

        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTitle.setText("Supplier Login Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle)
                            .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnSubmit)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitle)
                .addGap(18, 18, 18)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(txtPword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your password!");
        }
        User u=(User)comboUser.getSelectedItem();
        if(u!=null){
            //System.out.println(u.getRole());
            if(u.getRole().equals("Supplier")){
                Supplier s = (Supplier) u;
                //System.out.println("222");
                if(s.verify(txtPword.getText())){ 
                    //System.out.println("111");
                    grantAccessTo(s);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please input your correct password! ");
                }
            }
            if(u.getRole().equals("Customer")){
                Customer s = (Customer) u;
                //System.out.println("222");
                if(s.verify(txtPword.getText())){ 
                    //System.out.println("111");
                    grantAccessTo(s);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please input your correct password! ");
                }
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void grantAccessTo(User u){
        SuccessScreen ss =new SuccessScreen(panelRight,u);
        panelRight.add(ss);
        CardLayout layout= (CardLayout)panelRight.getLayout();
        layout.next(panelRight);
    }
    
    private void initialize(){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        
        if(role.equalsIgnoreCase("Supplier")){
            txtTitle.setText("Supplier Login Screen");
        }
        if(role.equalsIgnoreCase("Customer")){
            txtTitle.setText("Customer Login Screen");
        }
        
        comboUser.removeAllItems();
        for(User u:list){
            comboUser.addItem(u);
        }
        //only customer or suppliers should be listed based on the selection
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JTextField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}