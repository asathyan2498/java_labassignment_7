/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.User;


public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private User newUser;
    public ViewPanel(User newUser) {
        initComponents();
        this.newUser=newUser;
        populateData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PatientRegistrationForm = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        FirstNameText = new javax.swing.JTextField();
        LastNameText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        MessageLabel = new javax.swing.JLabel();
        TypeText = new javax.swing.JTextField();
        GenderText = new javax.swing.JTextField();
        MessageText = new javax.swing.JTextField();
        imageIcon = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        DateText = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        PatientRegistrationForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PatientRegistrationForm.setText("PATIENT DETAILS");

        FirstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FirstNameLabel.setText("FIRST NAME:");

        LastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LastNameLabel.setText("LAST NAME:");

        AgeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AgeLabel.setText("AGE:");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setText("EMAIL:");

        TypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TypeLabel.setText("TYPE:");

        GenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GenderLabel.setText("GENDER:");

        AgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextActionPerformed(evt);
            }
        });

        MessageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MessageLabel.setText("MESSAGE:");

        GenderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderTextActionPerformed(evt);
            }
        });

        DateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DateLabel.setText("DOB:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MessageLabel)
                    .addComponent(LastNameLabel)
                    .addComponent(FirstNameLabel)
                    .addComponent(AgeLabel)
                    .addComponent(emailLabel)
                    .addComponent(TypeLabel)
                    .addComponent(GenderLabel)
                    .addComponent(DateLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(PatientRegistrationForm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MessageText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(GenderText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TypeText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmailText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FirstNameText, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(imageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientRegistrationForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FirstNameLabel)
                                    .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastNameLabel)
                                    .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AgeLabel)
                                    .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailLabel)
                                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(TypeLabel))
                            .addComponent(TypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenderLabel)
                            .addComponent(GenderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MessageLabel)
                            .addComponent(MessageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateLabel)
                            .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTextActionPerformed

    private void GenderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeText;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateText;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JTextField GenderText;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextField MessageText;
    private javax.swing.JLabel PatientRegistrationForm;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JTextField TypeText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel imageIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        FirstNameText.setText(this.newUser.getFirstname());
        LastNameText.setText(this.newUser.getLastname());
        AgeText.setText(this.newUser.getAge());
        EmailText.setText(this.newUser.getEmail());
        MessageText.setText(this.newUser.getMessage());
        GenderText.setText(this.newUser.getGender());
        TypeText.setText(this.newUser.getType());
        DateText.setText(this.newUser.getDate());
        ImageIcon imag=new ImageIcon(this.newUser.getFilename());
        //Image image=imag.getImage().getScaledInstance(imageIcon.getWidth(),imageIcon.getHeight(),Image.SCALE_SMOOTH);
        imageIcon.setIcon(imag);
    }
}
