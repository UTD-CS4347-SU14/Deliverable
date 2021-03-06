/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MusicWizzardGUI;

import MusicWizzard.Main;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author spencerfusco
 */
public class UpdateInventory extends javax.swing.JFrame {
    private Main main;
    /**
     * Creates new form UpdateInventory
     */
    public UpdateInventory(Main main) {
        initComponents();
        
        this.main = main;
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        itemIDText = new javax.swing.JTextField();
        itemNameLabel = new javax.swing.JLabel();
        itemPriceLabel = new javax.swing.JLabel();
        itemStockLabel = new javax.swing.JLabel();
        artistIDLabel = new javax.swing.JLabel();
        itemNameText = new javax.swing.JTextField();
        itemPriceText = new javax.swing.JTextField();
        itemStockText = new javax.swing.JTextField();
        artistIDText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        updateLabel.setText("Update Inventory");

        jLabel1.setText("Item ID");

        itemIDText.setText("ItemId");

        itemNameLabel.setText("Item Name");

        itemPriceLabel.setText("Item Price");

        itemStockLabel.setText("Item Stock");

        artistIDLabel.setText("Artist ID");

        itemNameText.setText("Item Name");

        itemPriceText.setText("Item Price");

        itemStockText.setText("Item Stock");

        artistIDText.setText("Artist ID");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(updateLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(artistIDLabel)
                                    .addComponent(itemStockLabel)
                                    .addComponent(itemPriceLabel))
                                .addGap(158, 158, 158))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itemNameLabel)
                                .addGap(157, 157, 157)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemStockText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artistIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179)
                        .addComponent(itemIDText)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemStockText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemStockLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artistIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(backButton)
                    .addComponent(deleteButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int itemID = Integer.valueOf(itemIDText.getText());
        String itemName = itemNameText.getText();
        double itemPrice = Double.valueOf(itemPriceText.getText());
        int itemStock = Integer.valueOf(itemStockText.getText());
        int artistID = Integer.valueOf(artistIDText.getText());
        String query = "UPDATE inventory SET ItemName='"+itemName+"', "
                + "ItemPrice="+itemPrice+", "
                + "ItemStock="+itemStock+ " "
                + " WHERE ItemID="+itemID+" AND ArtistID="+artistID+"";
        this.main.database.update(query);
        
        DefaultTableModel model = (DefaultTableModel) this.main.inventory.jTable1.getModel();
        while (model.getRowCount() > 0) {
            for (int a = model.getRowCount()-1; a >= 0; a--) {
                model.removeRow(a);
            }
        }
        
        try {
//            Database test = new Database();
            
            query = "SELECT * FROM INVENTORY";
            System.out.println("calling select with query :: " + query);
            ResultSet rSet = this.main.database.select(query);

            while(rSet.next()) {
                model.addRow(new Object[]{rSet.getInt("ItemID"), 
                    rSet.getString("ItemName"), rSet.getDouble("ItemPrice"),
                    rSet.getInt("ItemStock"),
                    rSet.getInt("ArtistID")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        this.main.hideView(Main.view.UpdateInventory);
        this.main.showView(Main.view.Inventory);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.main.hideView(Main.view.UpdateInventory);
        this.main.showView(Main.view.Inventory);
    }//GEN-LAST:event_backButtonActionPerformed
    /**
     * Delete button action event.
     * @param evt 
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        int itemID = Integer.valueOf(itemIDText.getText());
        String itemName = itemNameText.getText();
        double itemPrice = Double.valueOf(itemPriceText.getText());
        int itemStock = Integer.valueOf(itemStockText.getText());
        int artistID = Integer.valueOf(artistIDText.getText());
        String query = "DELETE from inventory where ItemID="+itemID+"";
        this.main.database.update(query);
        
        DefaultTableModel model = (DefaultTableModel) this.main.inventory.jTable1.getModel();
        while (model.getRowCount() > 0) {
            for (int a = model.getRowCount()-1; a >= 0; a--) {
                model.removeRow(a);
            }
        }
        
        try {
//            Database test = new Database();
            
            query = "SELECT * FROM INVENTORY";
            System.out.println("calling select with query :: " + query);
            ResultSet rSet = this.main.database.select(query);

            while(rSet.next()) {
                model.addRow(new Object[]{rSet.getInt("ItemID"), 
                    rSet.getString("ItemName"), rSet.getDouble("ItemPrice"),
                    rSet.getInt("ItemStock"),
                    rSet.getInt("ArtistID")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        this.main.hideView(Main.view.UpdateInventory);
        this.main.showView(Main.view.Inventory);
    }//GEN-LAST:event_deleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artistIDLabel;
    private javax.swing.JTextField artistIDText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField itemIDText;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JTextField itemNameText;
    private javax.swing.JLabel itemPriceLabel;
    private javax.swing.JTextField itemPriceText;
    private javax.swing.JLabel itemStockLabel;
    private javax.swing.JTextField itemStockText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables
}
