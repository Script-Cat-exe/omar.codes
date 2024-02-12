package no_meet_bot;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Arayüz extends javax.swing.JFrame {

    public Class_IO class_ıo = new Class_IO();
    
    
    public Arayüz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kullanıcı_tablosu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        kullanıcı_isim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mesaj_yazısı = new javax.swing.JLabel();
        Kullanıcı_şifre = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş");

        kullanıcı_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı listesi"
            }
        ));
        kullanıcı_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanıcı_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kullanıcı_tablosu);

        jButton1.setText("Yenile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kullanıcı ismi :");

        jLabel2.setText("Kullanıcı şifre : ");

        jButton2.setText("Giriş yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Yeni kullanıcı");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Kullanıcıyı sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Bilgi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mesaj_yazısı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(kullanıcı_isim, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                            .addComponent(Kullanıcı_şifre))))
                                .addGap(87, 87, 87))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kullanıcı_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Kullanıcı_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(mesaj_yazısı)
                        .addGap(71, 71, 71)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)kullanıcı_tablosu.getModel();
        
        class_ıo.okuma();
        ArrayList<Kullanıcı> liste = class_ıo.Direkt_Oku();
        model.getDataVector().removeAllElements();
        
        for (Kullanıcı kullanıcı : liste) {
            
            Object[] eklenecek = {kullanıcı.getIsim()};
            model.addRow(eklenecek);
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        class_ıo.okuma();
        ArrayList<Kullanıcı> liste = class_ıo.Direkt_Oku();
        mesaj_yazısı.setText("isim yeri boş yada hatalı  " );
        for (Kullanıcı kullanıcı : liste) {
            if (kullanıcı_isim.getText().trim().equals(kullanıcı.getIsim())) {
                mesaj_yazısı.setText("şifre hatalı");
                if (Kullanıcı_şifre.getText().trim().equals(kullanıcı.getŞifre())) {
                  mesaj_yazısı.setText("giriş yapılıyor");
                  setVisible(false);
                  
                    JOptionPane.showMessageDialog(null,"başarıyla giriş yapıldı");
                  
                  
                  no_meet_bot nomeet = new no_meet_bot(kullanıcı);
                  
                  
                  nomeet.setVisible(true);
                }
            }
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kullanıcı_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanıcı_tablosuMouseClicked
        DefaultTableModel model = (DefaultTableModel) kullanıcı_tablosu.getModel();
        int secili_row = kullanıcı_tablosu.getSelectedRow();
        kullanıcı_isim.setText(model.getValueAt(secili_row,0).toString());
        Kullanıcı_şifre.setText("");
    }//GEN-LAST:event_kullanıcı_tablosuMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Kullanıcı kullanıcı = new Kullanıcı("","");
        
        kullanıcı.setIsim(kullanıcı_isim.getText().trim().toString());
        kullanıcı.setŞifre(Kullanıcı_şifre.getText().trim().toString());
        
        ArrayList<Kullanıcı> kayıt = class_ıo.Direkt_Oku();
        
        if (kullanıcı_isim.getText().trim().toString().equals("")) {
            mesaj_yazısı.setText("isim boş kalamaz");
        }else{
            for (Kullanıcı kula : kayıt) {
                String string = kula.getIsim();
                if (!string.equals(kullanıcı.getIsim())) {
                    if (Kullanıcı_şifre.getText().trim().toString().equals("")) {
                        mesaj_yazısı.setText("şifre boş kalamaz");
                    }else{
                    kayıt.add(kullanıcı);
                    class_ıo.kaydet(kayıt);
                    mesaj_yazısı.setText("kullanıcı başarıyla eklendi");
                    }
                }else{
                    mesaj_yazısı.setText("zaten bu isimde bir kullanıcı var");
                }
            }
            
             
        }
        
        
                
        
      
        

        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Kullanıcı kullanıcı = new Kullanıcı("","");
        kullanıcı.setIsim(kullanıcı_isim.getText().trim().toString());
        kullanıcı.setŞifre(Kullanıcı_şifre.getText().trim().toString());
        int sayac = 0;
        ArrayList<Kullanıcı> kayıt = class_ıo.Direkt_Oku();
        for (Kullanıcı kullanıcı1 : kayıt) {
            
            if (kullanıcı1.getIsim().equals(kullanıcı.getIsim())) {
                mesaj_yazısı.setText("kullanıcı silmek için kullanıcı şifresi doğru girilmeli");
                if (kullanıcı1.getŞifre().equals(kullanıcı.getŞifre())) {
                    kayıt.remove(sayac);
                    class_ıo.kaydet(kayıt);
                    mesaj_yazısı.setText("kullanıcı başarıyla silindi");
                    break;
                }
            }
            sayac++;
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null,"bu uygulamadaki 'ortak'ı silmeyiniz\neğer silerseniz uygulama bozulabilir yenile seçeneğine basınca gözükmeyen kullanıcı veya\ngünlükler ortaya çıkar ama silerseniz yenileye tıklasanızda gitmeye bilir uygulama açılıp kapanınca sorun çözülür");
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arayüz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Kullanıcı_şifre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kullanıcı_isim;
    private javax.swing.JTable kullanıcı_tablosu;
    private javax.swing.JLabel mesaj_yazısı;
    // End of variables declaration//GEN-END:variables
}
