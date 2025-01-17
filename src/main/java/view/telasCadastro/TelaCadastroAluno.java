/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.telasCadastro;

import jtextfields.Limitador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author julia
 */
public class TelaCadastroAluno extends javax.swing.JFrame {

   /**
    * Creates new form FormModeloCadastros
    */
   public TelaCadastroAluno() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      north = new javax.swing.JPanel();
      titulo = new javax.swing.JLabel();
      south = new javax.swing.JPanel();
      novo = new javax.swing.JButton();
      cancelar = new javax.swing.JButton();
      gravar = new javax.swing.JButton();
      buscar = new javax.swing.JButton();
      sair = new javax.swing.JButton();
      center = new javax.swing.JPanel();
      textoNome = new javax.swing.JTextField();
      nome = new javax.swing.JLabel();
      rg = new javax.swing.JLabel();
      textoRg = new javax.swing.JFormattedTextField();
      cpf = new javax.swing.JLabel();
      textoCpf = new javax.swing.JFormattedTextField();
      dataNasc = new javax.swing.JLabel();
      textoDataNasc = new javax.swing.JFormattedTextField();
      cep = new javax.swing.JLabel();
      listaCep = new javax.swing.JComboBox<>();
      compleEndereco = new javax.swing.JLabel();
      textoCompleEndereco = new javax.swing.JTextField();
      telefones = new javax.swing.JLabel();
      textoFone1 = new javax.swing.JFormattedTextField();
      textoFone2 = new javax.swing.JFormattedTextField();
      email = new javax.swing.JLabel();
      textoEmail = new javax.swing.JTextField();
      obs = new javax.swing.JLabel();
      textoObs = new javax.swing.JTextField();
      endereco = new javax.swing.JLabel();
      textoEndereco = new javax.swing.JTextField();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Formulário de Cadastro");
      setResizable(false);

      north.setBackground(new java.awt.Color(255, 204, 0));
      north.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      north.setPreferredSize(new java.awt.Dimension(700, 75));

      titulo.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
      titulo.setForeground(new java.awt.Color(0, 0, 0));
      titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      titulo.setText("ALUNO");

      javax.swing.GroupLayout northLayout = new javax.swing.GroupLayout(north);
      north.setLayout(northLayout);
      northLayout.setHorizontalGroup(
         northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(northLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
            .addContainerGap())
      );
      northLayout.setVerticalGroup(
         northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(northLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addContainerGap())
      );

      getContentPane().add(north, java.awt.BorderLayout.NORTH);

      south.setPreferredSize(new java.awt.Dimension(700, 50));

      novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
      novo.setText("Novo");
      novo.setPreferredSize(new java.awt.Dimension(120, 30));
      south.add(novo);

      cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
      cancelar.setText("Cancelar");
      cancelar.setEnabled(false);
      cancelar.setPreferredSize(new java.awt.Dimension(120, 30));
      south.add(cancelar);

      gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar2.png"))); // NOI18N
      gravar.setText("Gravar");
      gravar.setEnabled(false);
      gravar.setPreferredSize(new java.awt.Dimension(120, 30));
      south.add(gravar);

      buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
      buscar.setText("Buscar");
      buscar.setPreferredSize(new java.awt.Dimension(120, 30));
      south.add(buscar);

      sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
      sair.setText("Sair");
      sair.setPreferredSize(new java.awt.Dimension(120, 30));
      south.add(sair);

      getContentPane().add(south, java.awt.BorderLayout.SOUTH);

      nome.setText("Nome:");

      rg.setText("RG:");

      try {
         textoRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###-#")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      textoRg.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      cpf.setText("CPF:");

      try {
         textoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      textoCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      dataNasc.setText("Data de Nasc.:");

      try {
         textoDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      textoDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      cep.setText("CEP:");

      listaCep.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            listaCepMouseClicked(evt);
         }
      });

      compleEndereco.setText("Complemento Endereço:");

      textoCompleEndereco.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            textoCompleEnderecoActionPerformed(evt);
         }
      });

      telefones.setText("Telefones:");

      try {
         textoFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-###*")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      textoFone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      try {
         textoFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-###*")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      textoFone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      email.setText("E-mail:");

      obs.setText("Observações:");

      endereco.setText("Endereço:");

      textoEndereco.setEnabled(false);
      textoEndereco.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            textoEnderecoActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
      center.setLayout(centerLayout);
      centerLayout.setHorizontalGroup(
         centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(centerLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(centerLayout.createSequentialGroup()
                  .addComponent(nome)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoNome))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerLayout.createSequentialGroup()
                  .addComponent(rg)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                  .addComponent(cpf)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(40, 40, 40)
                  .addComponent(dataNasc)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(centerLayout.createSequentialGroup()
                  .addComponent(obs)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoObs))
               .addGroup(centerLayout.createSequentialGroup()
                  .addComponent(telefones)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(textoFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(textoFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoEmail))))
               .addGroup(centerLayout.createSequentialGroup()
                  .addComponent(compleEndereco)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoCompleEndereco))
               .addGroup(centerLayout.createSequentialGroup()
                  .addComponent(cep)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(listaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(centerLayout.createSequentialGroup()
                  .addComponent(endereco)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(textoEndereco)))
            .addContainerGap())
      );
      centerLayout.setVerticalGroup(
         centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(centerLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(nome)
               .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(rg)
               .addComponent(textoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(dataNasc)
               .addComponent(textoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(cpf)
               .addComponent(textoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(cep)
               .addComponent(listaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(endereco)
               .addComponent(textoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(compleEndereco)
               .addComponent(textoCompleEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(telefones)
               .addComponent(textoFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(email)
               .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(textoFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(obs)
               .addComponent(textoObs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(13, Short.MAX_VALUE))
      );

      getContentPane().add(center, java.awt.BorderLayout.CENTER);

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void textoCompleEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCompleEnderecoActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_textoCompleEnderecoActionPerformed

   private void textoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEnderecoActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_textoEnderecoActionPerformed

   private void listaCepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCepMouseClicked

   }//GEN-LAST:event_listaCepMouseClicked

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
         java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaCadastroAluno().setVisible(true);
         }
      });
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton buscar;
   private javax.swing.JButton cancelar;
   private javax.swing.JPanel center;
   private javax.swing.JLabel cep;
   private javax.swing.JLabel compleEndereco;
   private javax.swing.JLabel cpf;
   private javax.swing.JLabel dataNasc;
   private javax.swing.JLabel email;
   private javax.swing.JLabel endereco;
   private javax.swing.JButton gravar;
   private javax.swing.JComboBox<String> listaCep;
   private javax.swing.JLabel nome;
   private javax.swing.JPanel north;
   private javax.swing.JButton novo;
   private javax.swing.JLabel obs;
   private javax.swing.JLabel rg;
   private javax.swing.JButton sair;
   private javax.swing.JPanel south;
   private javax.swing.JLabel telefones;
   private javax.swing.JTextField textoCompleEndereco;
   private javax.swing.JFormattedTextField textoCpf;
   private javax.swing.JFormattedTextField textoDataNasc;
   private javax.swing.JTextField textoEmail;
   private javax.swing.JTextField textoEndereco;
   private javax.swing.JFormattedTextField textoFone1;
   private javax.swing.JFormattedTextField textoFone2;
   private javax.swing.JTextField textoNome;
   private javax.swing.JTextField textoObs;
   private javax.swing.JFormattedTextField textoRg;
   private javax.swing.JLabel titulo;
   // End of variables declaration//GEN-END:variables

   public JButton getBuscar() {
      return buscar;
   }

   public JButton getCancelar() {
      return cancelar;
   }

   public JButton getGravar() {
      return gravar;
   }

   public JButton getNovo() {
      return novo;
   }

   public JButton getSair() {
      return sair;
   }

   public JPanel getCenter() {
      return center;
   }

   public JTextField getTextoCompleEndereco() {
      return textoCompleEndereco;
   }

   public JFormattedTextField getTextoCpf() {
      return textoCpf;
   }

   public JFormattedTextField getTextoDataNasc() {
      return textoDataNasc;
   }

   public JTextField getTextoEmail() {
      return textoEmail;
   }

   public JFormattedTextField getTextoFone1() {
      return textoFone1;
   }

   public JFormattedTextField getTextoFone2() {
      return textoFone2;
   }

   public JTextField getTextoNome() {
      return textoNome;
   }

   public JTextField getTextoObs() {
      return textoObs;
   }

   public JFormattedTextField getTextoRg() {
      return textoRg;
   }

   public JComboBox<String> getListaCep() {
      return listaCep;
   }

   public JTextField getTextoEndereco() {
      return textoEndereco;
   }
}
