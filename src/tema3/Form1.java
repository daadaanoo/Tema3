package tema3;

import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_MAX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с визуальными табл. данными в JAVA");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)},
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)},
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)},
                { new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0)}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 250, 70);

        jButton1.setText("Заполнить случ. числами");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 10, 200, 23);

        jButton2.setText("Выполнить задание");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 50, 200, 23);

        jLabel_MAX.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_MAX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_MAX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MAX.setAlignmentX(1.0F);
        jLabel_MAX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_MAX.setName(""); // NOI18N
        jLabel_MAX.setOpaque(true);
        getContentPane().add(jLabel_MAX);
        jLabel_MAX.setBounds(20, 90, 460, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tema3/lab.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 110, 470, 70);

        setSize(new java.awt.Dimension(525, 239));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Случайные числа
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.setValueAt(Math.round(Math.random() * 99), i, j);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Выполнение задания
        int max, maxi, maxj, min, mini,minj;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if (jTable1.getValueAt(i, j) == null) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Проверьте правильность заполнения таблицы", "Ошибка ввода",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } 

        max = Integer.parseInt(jTable1.getValueAt(0, 0).toString());
        maxi = 0;
        maxj = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if (Integer.parseInt(jTable1.getValueAt(i, j).toString()) > max) {
                    max = Integer.parseInt(jTable1.getValueAt(i, j).toString());
                    maxi = i;
                    maxj = j;
                   
                }
            }
        }
        int sum = 0;
        for (int i = 0; i <= maxi; i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if ((i == maxi) && (j >= maxj)) {
                    break;
                }
             //   sum += Integer.parseInt(jTable1.getValueAt(i, j).toString());
               // jTable1.setValueAt(-1, i, j);
            }
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if (Integer.parseInt(jTable1.getValueAt(i, j).toString()) == max) {
                    jTable1.setValueAt(max/2, i, j);
                }
            }
        }
        min = Integer.parseInt(jTable1.getValueAt(0, 0).toString());
        mini = 0;
        minj = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if (Integer.parseInt(jTable1.getValueAt(i, j).toString()) < min) {
                    min = Integer.parseInt(jTable1.getValueAt(i, j).toString());
                    mini = i;
                    minj = j;
                   
                }
            }
        }
        for (int i = 0; i <= mini; i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if ((i == mini) && (j >= minj)) {
                    break;
                }
               // sum += Integer.parseInt(jTable1.getValueAt(i, j).toString());
              //  jTable1.setValueAt(-1, i, j);
            }
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                if (Integer.parseInt(jTable1.getValueAt(i, j).toString()) == min) {
                    jTable1.setValueAt(min/3, i, j);
                }
            }
        }
        jLabel_MAX.setText("Максимальный элемент: " + max + "Минимальный элемент: " + min);
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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_MAX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
