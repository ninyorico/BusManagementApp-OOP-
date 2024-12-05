package PassengerApp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class passengerFormApp extends javax.swing.JFrame {

 
     

    public passengerFormApp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelminimize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelminimize1 = new javax.swing.JLabel();
        jTextFieldPersonalContactNo = new javax.swing.JTextField();
        jTextFieldParentsName = new javax.swing.JTextField();
        jLabelage = new javax.swing.JLabel();
        jLabelParentsCon = new javax.swing.JLabel();
        jLabelPArentsn = new javax.swing.JLabel();
        jLabelParentscontact = new javax.swing.JLabel();
        jTextFieldParentsContactName = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jSubmit = new javax.swing.JButton();
        jLabelBusid = new javax.swing.JLabel();
        jTextFieldAge1 = new javax.swing.JTextField();
        jLabelFullName5 = new javax.swing.JLabel();
        busIDField1 = new javax.swing.JTextField();
        jLabelBusid1 = new javax.swing.JLabel();
        jseatNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(243, 243, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(1541, 868));

        jPanel2.setBackground(new java.awt.Color(19, 62, 135));

        jLabelminimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelminimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelminimize.setText("X");
        jLabelminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminimizeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kindly input your information below");

        jLabelminimize1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelminimize1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelminimize1.setText("-");
        jLabelminimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminimize1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelminimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelminimize)
                    .addComponent(jLabelminimize1)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37))
        );

        jTextFieldPersonalContactNo.setBackground(new java.awt.Color(203, 220, 235));
        jTextFieldPersonalContactNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPersonalContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPersonalContactNoActionPerformed(evt);
            }
        });

        jTextFieldParentsName.setBackground(new java.awt.Color(203, 220, 235));
        jTextFieldParentsName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldParentsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParentsNameActionPerformed(evt);
            }
        });

        jLabelage.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelage.setText("Age:");

        jLabelParentsCon.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelParentsCon.setText("Parents Contact No.:");

        jLabelPArentsn.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelPArentsn.setText("Parent's Name:");

        jLabelParentscontact.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelParentscontact.setText("Personal Contact No.:");

        jTextFieldParentsContactName.setBackground(new java.awt.Color(203, 220, 235));
        jTextFieldParentsContactName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldParentsContactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParentsContactNameActionPerformed(evt);
            }
        });

        nameField.setBackground(new java.awt.Color(203, 220, 235));
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jSubmit.setBackground(new java.awt.Color(96, 139, 193));
        jSubmit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSubmit.setText("SUBMIT");
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });

        jLabelBusid.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelBusid.setText("Bus Id:");

        jTextFieldAge1.setBackground(new java.awt.Color(203, 220, 235));
        jTextFieldAge1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAge1ActionPerformed(evt);
            }
        });

        jLabelFullName5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelFullName5.setText("Full Name:");

        busIDField1.setBackground(new java.awt.Color(203, 220, 235));
        busIDField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        busIDField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busIDField1ActionPerformed(evt);
            }
        });

        jLabelBusid1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelBusid1.setText("Seat No.");

        jseatNumber.setBackground(new java.awt.Color(203, 220, 235));
        jseatNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParentscontact)
                    .addComponent(jLabelage)
                    .addComponent(jLabelFullName5)
                    .addComponent(jLabelPArentsn)
                    .addComponent(jLabelParentsCon)
                    .addComponent(jLabelBusid)
                    .addComponent(jLabelBusid1))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(busIDField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAge1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPersonalContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldParentsName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldParentsContactName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jseatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFullName5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPersonalContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParentscontact))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldParentsName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPArentsn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldParentsContactName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParentsCon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusid)
                    .addComponent(busIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusid1)
                    .addComponent(jseatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminimizeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelminimizeMouseClicked

    private void jLabelminimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminimize1MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabelminimize1MouseClicked

    private void jTextFieldPersonalContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPersonalContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPersonalContactNoActionPerformed

    private void jTextFieldParentsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParentsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParentsNameActionPerformed

    private void jTextFieldParentsContactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParentsContactNameActionPerformed
        
    }//GEN-LAST:event_jTextFieldParentsContactNameActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed
    String name = nameField.getText();
    String age = jTextFieldAge1.getText();
    String ContactNumber = jTextFieldPersonalContactNo.getText();
    String parentName = jTextFieldParentsName.getText();
    String parentContact = jTextFieldParentsContactName.getText();
    String busID = busIDField1.getText();  // Get Bus ID properly from busIDField
    String seatNo = jseatNumber.getText();

    // Insert passenger data into the SQL database
    try (Connection conn = DatabaseManager2.getConnection()) {
        // Insert passenger details into the passengers table
        String sql = "INSERT INTO passengerinfo (name, age, contactNumber, parentName, parentContact, seatNo) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, name);
        stmt.setString(2, age);
        stmt.setString(3, ContactNumber); // Make sure this is a valid integer
        stmt.setString(4, parentName);
        stmt.setString(5, parentContact);
        stmt.setString(6, seatNo);

        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Passenger added successfully!");
            
            // Example: Pass userID when transitioning to attendanceFrame

            
            // Get the generated passenger ID
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            
            
            
            if (generatedKeys.next()) {
                int passengerId = generatedKeys.getInt(1); // Get the generated passenger ID

                // Insert bus-passenger relationship into the bus table (if bus ID is provided)
                if (!busID.isEmpty()) {
                    String bus1SQL = "INSERT INTO bus1 (busID, passengerID) VALUES (?, ?)";
                    try (PreparedStatement busStmt = conn.prepareStatement(bus1SQL)) {
                        busStmt.setString(1, busID); // Use the correct Bus ID value
                        busStmt.setInt(2, passengerId); // Use the generated passenger ID

                        int busRowsAffected = busStmt.executeUpdate();
                        if (busRowsAffected > 0) {
                            JOptionPane.showMessageDialog(this, "Passenger successfully assigned to Bus " + busID);
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to assign passenger to bus.");
                        }
                    }
                }
            }
            

            loginForm1 lgf = new loginForm1();  
            lgf.setVisible(true);
            lgf.setLocationRelativeTo(null);
            this.dispose(); 
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add passenger.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    }//GEN-LAST:event_jSubmitActionPerformed

    private void jTextFieldAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAge1ActionPerformed

    private void busIDField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busIDField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busIDField1ActionPerformed
    

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(passengerFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passengerFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passengerFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passengerFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        DatabaseManager2.initializeDatabase();

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passengerFormApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busIDField1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBusid;
    private javax.swing.JLabel jLabelBusid1;
    private javax.swing.JLabel jLabelFullName5;
    private javax.swing.JLabel jLabelPArentsn;
    private javax.swing.JLabel jLabelParentsCon;
    private javax.swing.JLabel jLabelParentscontact;
    private javax.swing.JLabel jLabelage;
    private javax.swing.JLabel jLabelminimize;
    private javax.swing.JLabel jLabelminimize1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTextField jTextFieldAge1;
    private javax.swing.JTextField jTextFieldParentsContactName;
    private javax.swing.JTextField jTextFieldParentsName;
    private javax.swing.JTextField jTextFieldPersonalContactNo;
    private javax.swing.JTextField jseatNumber;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables


}
