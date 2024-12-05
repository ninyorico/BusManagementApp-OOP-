package TourGuideApp;
import javax.swing.SwingUtilities;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


public class BusPassengerInfos extends javax.swing.JFrame {


    public BusPassengerInfos() {
       
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelinputbusid = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldSearchBusID = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonOnBoard = new javax.swing.JButton();
        jButtonOffBoard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMinimized = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(82, 110, 72));

        jPanel2.setBackground(new java.awt.Color(98, 130, 93));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelinputbusid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelinputbusid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelinputbusid.setText("Input the Bus ID");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Contact Number  ", "Parent  Name ", "Parent Contact", "OnBoard", "Seat No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jTextFieldSearchBusID.setBackground(new java.awt.Color(194, 255, 199));
        jTextFieldSearchBusID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldSearchBusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchBusIDActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(194, 255, 199));
        jButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(82, 110, 72));
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(194, 255, 199));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(82, 110, 72));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonOnBoard.setBackground(new java.awt.Color(194, 255, 199));
        jButtonOnBoard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonOnBoard.setForeground(new java.awt.Color(82, 110, 72));
        jButtonOnBoard.setText("On Board");
        jButtonOnBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOnBoardActionPerformed(evt);
            }
        });

        jButtonOffBoard.setBackground(new java.awt.Color(194, 255, 199));
        jButtonOffBoard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonOffBoard.setForeground(new java.awt.Color(82, 110, 72));
        jButtonOffBoard.setText("Off Board");
        jButtonOffBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOffBoardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonOnBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOffBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelinputbusid)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSearchBusID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelinputbusid)
                    .addComponent(jTextFieldSearchBusID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonOnBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonOffBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Passenger Information");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jMinimized.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jMinimized.setForeground(new java.awt.Color(255, 255, 255));
        jMinimized.setText("-");
        jMinimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1087, 1087, 1087)
                        .addComponent(jMinimized)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jMinimized)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchBusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchBusIDActionPerformed
      
    }//GEN-LAST:event_jTextFieldSearchBusIDActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
    this.setLocationRelativeTo(null);                                 
    String busID = jTextFieldSearchBusID.getText();

    if (busID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Bus ID to search.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Clear the table before updating
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing rows

    // Modified query to include passenger ID
    String query = """
        SELECT p.id, p.name, p.age, p.contactNumber, p.parentName, p.parentContact, p.attendance, p.seatNo
        FROM passengerinfo p
        JOIN bus1 b ON p.id = b.passengerID
        WHERE b.busID = ?
    """; // Include the passenger ID column in the query

    try (Connection conn = DatabaseManager1.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, busID); // Set the busID parameter
        ResultSet rs = stmt.executeQuery();

        boolean foundPassenger = false; // Track if passengers are found

        while (rs.next()) {
            foundPassenger = true;
            
            // Retrieve passenger info including attendance
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String contactNumber = rs.getString("contactNumber");
            String parentName = rs.getString("parentName");
            String parentContact = rs.getString("parentContact");
            boolean attendance = rs.getBoolean("attendance"); // Attendance boolean
            int seatNo = rs.getInt("seatNo");

            // Add row to the table
            model.addRow(new Object[]{
                    name,
                    age,
                    contactNumber,
                    parentName,
                    parentContact,
                    attendance ? "On Board" : "Off Board",
                    seatNo // seatNo should be shown here
            });
        }

        if (!foundPassenger) {
            JOptionPane.showMessageDialog(this, "No passengers found for Bus ID " + busID, "No Results", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error retrieving data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }

  
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMinimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizedMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMinimizedMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {  // Ensure a row is selected
        String contactNumber = jTable1.getValueAt(selectedRow, 2).toString();  // Assuming contactNumber is in the 3rd column

        // Database connection and deletion logic
        String getUserAndPassengerIDSQL = "SELECT id, id FROM passengerinfo WHERE contactNumber = ?";
        String deletePassengerSQL = "DELETE FROM passengerinfo WHERE contactNumber = ?";
        String deleteBusSQL = "DELETE FROM bus1 WHERE passengerID = ?";
        String deleteUserSQL = "DELETE FROM user WHERE id = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_management1", "root", "bancoro6")) {
            conn.setAutoCommit(false);  // Start transaction
            
            // Step 1: Retrieve related IDs
            int passengerID = -1;
            int id = -1;
            try (PreparedStatement pstmt1 = conn.prepareStatement(getUserAndPassengerIDSQL)) {
                pstmt1.setString(1, contactNumber);
                ResultSet rs = pstmt1.executeQuery();
                if (rs.next()) {
                    passengerID = rs.getInt("id");
                    id = rs.getInt("id");
                    System.out.println("Retrieved IDs: PassengerID=" + passengerID + ", id=" + id); // Debugging
                } else {
                    System.out.println("No matching record found in passengerinfo for contactNumber=" + contactNumber); // Debugging
                }
            }

            if (passengerID != -1) {
                // Step 2: Delete from `passengerinfo`
                try (PreparedStatement pstmt2 = conn.prepareStatement(deletePassengerSQL)) {
                    pstmt2.setString(1, contactNumber);
                    pstmt2.executeUpdate();
                }

                // Step 3: Delete from `bus1`
                try (PreparedStatement pstmt3 = conn.prepareStatement(deleteBusSQL)) {
                    pstmt3.setInt(1, passengerID);
                    pstmt3.executeUpdate();
                }

                // Step 4: Delete from `user`
                if (id != -1) {  // Ensure userID is valid
                    try (PreparedStatement pstmt4 = conn.prepareStatement(deleteUserSQL)) {
                        pstmt4.setInt(1, id);
                        int userAffectedRows = pstmt4.executeUpdate();
                        if (userAffectedRows > 0) {
                            System.out.println("User deleted successfully with ID=" + id); // Debugging
                        } else {
                            System.out.println("No user found with ID=" + id); // Debugging
                        }
                    }
                } else {
                    System.out.println("No valid userID found for deletion."); // Debugging
                }

                // Commit transaction
                conn.commit();

                // Step 5: Remove the row from the JTable model
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } else {
                conn.rollback();  // Rollback transaction
                JOptionPane.showMessageDialog(null, "No record found with the specified contact number.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
    }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonOnBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOnBoardActionPerformed
                                      

    // Get the selected rows from the JTable
    int[] selectedRows = jTable1.getSelectedRows();

    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(null, "Please select at least one passenger.");
        return;
    }

    // Loop through the selected rows and update the attendance for each
    for (int i = 0; i < selectedRows.length; i++) {
        try {
            // Get unique fields from the selected row
            String passengerName = jTable1.getValueAt(selectedRows[i], 0).toString(); // Assuming name is in column 0
            String contactNumber = jTable1.getValueAt(selectedRows[i], 2).toString(); // Assuming contactNumber is in column 2

            // Update the attendance in the database using name and contactNumber
            String updateAttendanceSQL = "UPDATE passengerinfo SET attendance = 1 WHERE name = ? AND contactNumber = ?";

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_management1", "root", "bancoro6");
                 PreparedStatement pstmt = conn.prepareStatement(updateAttendanceSQL)) {

                // Set the name and contactNumber in the prepared statement
                pstmt.setString(1, passengerName);
                pstmt.setString(2, contactNumber);

                // Execute the update query
                int affectedRows = pstmt.executeUpdate();

                if (affectedRows > 0) {
                    // Update the attendance column in the JTable (column index 5 if "attendance" is at index 5)
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setValueAt("On Board", selectedRows[i], 5); // Assuming attendance is in the 6th column (index 5)
                } else {
                    System.out.println("No rows updated in database for " + passengerName + " (" + contactNumber + ").");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error processing row " + selectedRows[i] + ": " + e.getMessage());
        }
    }

    JOptionPane.showMessageDialog(null, "Attendance updated successfully.");


    }//GEN-LAST:event_jButtonOnBoardActionPerformed

    private void jButtonOffBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOffBoardActionPerformed
        int[] selectedRows = jTable1.getSelectedRows();

    if (selectedRows.length == 0) {
        JOptionPane.showMessageDialog(null, "Please select at least one passenger.");
        return;
    }

    // Loop through the selected rows and update the attendance for each
    for (int i = 0; i < selectedRows.length; i++) {
        try {
            // Get unique fields from the selected row
            String passengerName = jTable1.getValueAt(selectedRows[i], 0).toString(); // Assuming name is in column 0
            String contactNumber = jTable1.getValueAt(selectedRows[i], 2).toString(); // Assuming contactNumber is in column 2

            // Update the attendance in the database using name and contactNumber
            String updateAttendanceSQL = "UPDATE passengerinfo SET attendance = 0 WHERE name = ? AND contactNumber = ?";

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_management1", "root", "bancoro6");
                 PreparedStatement pstmt = conn.prepareStatement(updateAttendanceSQL)) {

                // Set the name and contactNumber in the prepared statement
                pstmt.setString(1, passengerName);
                pstmt.setString(2, contactNumber);

                // Execute the update query
                int affectedRows = pstmt.executeUpdate();

                if (affectedRows > 0) {
                    // Update the attendance column in the JTable (column index 5 if "attendance" is at index 5)
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setValueAt("Off Board", selectedRows[i], 5); // Assuming attendance is in the 6th column (index 5)
                } else {
                    System.out.println("No rows updated in database for " + passengerName + " (" + contactNumber + ").");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error processing row " + selectedRows[i] + ": " + e.getMessage());
        }
    }

    JOptionPane.showMessageDialog(null, "Attendance reset successfully.");
    }//GEN-LAST:event_jButtonOffBoardActionPerformed

    public static void main(String[] args) {
    DatabaseManager1.initializeDatabase();
    
     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TourGuideSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TourGuideSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TourGuideSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TourGuideSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    SwingUtilities.invokeLater(() -> {
        new BusPassengerInfos().setVisible(true); 
        

    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonOffBoard;
    private javax.swing.JButton jButtonOnBoard;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelinputbusid;
    private javax.swing.JLabel jMinimized;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearchBusID;
    // End of variables declaration//GEN-END:variables

}
