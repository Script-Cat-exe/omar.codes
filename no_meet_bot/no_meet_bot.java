
package no_meet_bot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class no_meet_bot extends javax.swing.JFrame {
    
    Class_IO class_ıo = new Class_IO();
    
    public Kullanıcı kullanıcı;
    
    public no_meet_bot(Kullanıcı kullan) {
        kullanıcı = kullan;
        initComponents();
    }

    private no_meet_bot() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        yazı_alanı = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        günlük_listesi = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Günlük uygulaması");

        yazı_alanı.setColumns(20);
        yazı_alanı.setRows(5);
        jScrollPane1.setViewportView(yazı_alanı);

        günlük_listesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Günlük ler"
            }
        ));
        günlük_listesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                günlük_listesiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(günlük_listesi);

        jButton2.setText("Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Yenile");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel)günlük_listesi.getModel();
        model.getDataVector().removeAllElements();
        HashMap<String ,String> ekle = kullanıcı.getDökümanlar();
        for (Map.Entry<String, String> entry : ekle.entrySet()) {
            Object[] rows = {(Object)entry.getKey()};
            model.addRow(rows);
			
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        ArrayList<Kullanıcı> liste = class_ıo.Direkt_Oku(); 
        
        
        String isim = JOptionPane.showInputDialog("bu metinin ismi");
        kullanıcı.setDökümanlar(isim,yazı_alanı.getText().toString());
        class_ıo.Direkt_yaz(kullanıcı);
        class_ıo.Kullanıcı_sil(kullanıcı);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void günlük_listesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_günlük_listesiMouseClicked
        DefaultTableModel model = (DefaultTableModel) günlük_listesi.getModel();
        int secili_row = günlük_listesi.getSelectedRow();
        yazı_alanı.setText(kullanıcı.getDökümanlar().get((String)(model.getValueAt(secili_row,0).toString())));
        
        
    }//GEN-LAST:event_günlük_listesiMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        ArrayList<Kullanıcı> liste = class_ıo.Direkt_Oku(); 
        
        
        String string = JOptionPane.showInputDialog("silinecek günlüğün adı");
        
        kullanıcı.döküman_sil(string,(String)(yazı_alanı.getText().toString()));
        class_ıo.Direkt_yaz(kullanıcı);
        class_ıo.Kullanıcı_sil(kullanıcı);
        
        JOptionPane.showMessageDialog(null,"uygulamayı kapatıp açınca yok olacak");
        
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new no_meet_bot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable günlük_listesi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea yazı_alanı;
    // End of variables declaration//GEN-END:variables
}
