/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hackert
 */
public class More extends javax.swing.JFrame {

    /**
     * Creates new form More
     */
    public More() {
        initComponents();
        tables();
        
    }
     public void tables(){
        showTableBeans();
        showTableWheat();
        showTableMillet();
        showTableGreen();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbeans = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        twheat = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tgreen = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tmillet = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 150, 253));
        jPanel10.setForeground(new java.awt.Color(205, 213, 223));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 240, 237));
        jLabel1.setText("TracSales");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 230, 230));
        jLabel2.setText("KILANYA CERIAL'S STORE MANAGEMENT SYSTEM ");

        exit.setBackground(new java.awt.Color(233, 219, 219));
        exit.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(242, 230, 230));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8-go-back.png"))); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        exit1.setBackground(new java.awt.Color(233, 219, 219));
        exit1.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        exit1.setForeground(new java.awt.Color(242, 230, 230));
        exit1.setText("X");
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 1012, Short.MAX_VALUE)
                                .addComponent(exit1)
                                .addGap(235, 235, 235)))
                        .addComponent(exit)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(exit))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(back))))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 130));

        tbeans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Maize ", "23", "2000", "12/12/2018"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# Number", "Item Purchased", "No of Kg", "Amount Spent (ksh)", "Purchased_on"
            }
        ));
        jScrollPane2.setViewportView(tbeans);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 490, 110));

        twheat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Maize ", "2000", "12/12/2018"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "# Number", "Item ", "Amount Spent (ksh)", "Expensed_on"
            }
        ));
        jScrollPane1.setViewportView(twheat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 490, 170));

        tgreen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Maize ", "23", "2000", "12/12/2018"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# Number", "Item Purchased", "No of Kg", "Amount Spent (ksh)", "Purchased_on"
            }
        ));
        jScrollPane3.setViewportView(tgreen);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 490, 110));

        tmillet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Maize ", "2000", "12/12/2018"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "# Number", "Item ", "Amount Spent (ksh)", "Expensed_on"
            }
        ));
        jScrollPane4.setViewportView(tmillet);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 490, 170));

        jLabel3.setText("Wheat Sales ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jLabel4.setText("Millet Sales");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, -1, -1));

        jLabel5.setText("Beans Sales ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel6.setText("Green Grams");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        AdminHome  s = new AdminHome();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit1MousePressed
     public void showTableBeans(){
       try{
            String sql = "SELECT name, weight, cost FROM sales where type = 'beans'";
           ResultSet rs = Databases.query(sql);
           tbeans.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           
       }
   }
  public void showTableMillet(){
      try{
            String sql = "SELECT name, weight, cost FROM sales where type = 'millet'";
           ResultSet rs = Databases.query(sql);
           tmillet.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           
       }
   }
   public void showTableGreen(){
       try{
            String sql = "SELECT name, weight, cost FROM sales where type = 'green'";
           ResultSet rs = Databases.query(sql);
           tgreen.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           
       }
   }
   
     public void showTableWheat(){
       try{
            String sql = "SELECT name, weight, cost FROM sales where type = 'wheat'";
           ResultSet rs = Databases.query(sql);
           twheat.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception ex){
           
       }
   }
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
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(More.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new More().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbeans;
    private javax.swing.JTable tgreen;
    private javax.swing.JTable tmillet;
    private javax.swing.JTable twheat;
    // End of variables declaration//GEN-END:variables
}