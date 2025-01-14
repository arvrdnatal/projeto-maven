/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.telasCadastro;

import jtextfields.LimitadorX;

import javax.swing.*;

/**
 *
 * @author julia
 */
public class TelaVendas extends javax.swing.JFrame {
   /**
    * Creates new form FormModeloCadastros
    */
   public TelaVendas() {
      initComponents();
      
      textoTelefonesA.setLineWrap(true);
      textoTelefonesA.setRows(2);
      textoEnderecoA.setLineWrap(true);
      textoEnderecoA.setWrapStyleWord(true);
      textoEnderecoA.setRows(2);

      textoTelefonesP.setLineWrap(true);
      textoTelefonesP.setRows(2);
      textoEnderecoP.setLineWrap(true);
      textoEnderecoP.setWrapStyleWord(true);
      textoEnderecoP.setRows(2);

      codigoBarras.setDocument(new LimitadorX(18));
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
      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      listaItens = new javax.swing.JTable();
      jPanel2 = new javax.swing.JPanel();
      valorTotal = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      codigoBarras = new javax.swing.JTextField();
      jPanel4 = new javax.swing.JPanel();
      jLabel12 = new javax.swing.JLabel();
      nome = new javax.swing.JLabel();
      textoNomeA = new javax.swing.JTextField();
      endereco = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jSeparator1 = new javax.swing.JSeparator();
      jLabel13 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      textoTelefonesA = new javax.swing.JTextArea();
      jScrollPane4 = new javax.swing.JScrollPane();
      textoEnderecoA = new javax.swing.JTextArea();
      jScrollPane5 = new javax.swing.JScrollPane();
      textoTelefonesP = new javax.swing.JTextArea();
      jLabel8 = new javax.swing.JLabel();
      jScrollPane6 = new javax.swing.JScrollPane();
      textoEnderecoP = new javax.swing.JTextArea();
      endereco1 = new javax.swing.JLabel();
      textoNomeP = new javax.swing.JTextField();
      nome2 = new javax.swing.JLabel();
      jPanel6 = new javax.swing.JPanel();
      jLabel10 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      textoData = new javax.swing.JTextField();
      textoHora = new javax.swing.JTextField();
      textoStatus = new javax.swing.JTextField();
      jLabel14 = new javax.swing.JLabel();
      jPanel7 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel16 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Formulário de Cadastro");
      setExtendedState(6);

      north.setBackground(new java.awt.Color(255, 204, 0));
      north.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      north.setPreferredSize(new java.awt.Dimension(700, 75));

      titulo.setFont(new java.awt.Font("Leelawadee", 0, 36)); // NOI18N
      titulo.setForeground(new java.awt.Color(0, 0, 0));
      titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      titulo.setText("FATURAMENTO");

      javax.swing.GroupLayout northLayout = new javax.swing.GroupLayout(north);
      north.setLayout(northLayout);
      northLayout.setHorizontalGroup(
         northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(northLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      northLayout.setVerticalGroup(
         northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(northLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addContainerGap())
      );

      jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      listaItens.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Item", "Produto", "QTD", "Valor", "SubTotal"
         }
      ));
      jScrollPane1.setViewportView(listaItens);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      valorTotal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
      valorTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      valorTotal.setText("R$ 0,00");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
      );

      jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel1.setText("Código de Barras do Produto:");

      codigoBarras.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(codigoBarras))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(codigoBarras, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addContainerGap())
      );

      jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

      jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel12.setText("Informações do Aluno:");

      nome.setText("Nome:");

      textoNomeA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      textoNomeA.setEnabled(false);

      endereco.setText("Endereço:");

      jLabel7.setText("Telefones:");

      jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel13.setText("Informações do Personal:");

      textoTelefonesA.setColumns(20);
      textoTelefonesA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      textoTelefonesA.setRows(5);
      textoTelefonesA.setEnabled(false);
      jScrollPane2.setViewportView(textoTelefonesA);

      textoEnderecoA.setColumns(20);
      textoEnderecoA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      textoEnderecoA.setRows(5);
      textoEnderecoA.setEnabled(false);
      jScrollPane4.setViewportView(textoEnderecoA);

      textoTelefonesP.setColumns(20);
      textoTelefonesP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      textoTelefonesP.setRows(5);
      textoTelefonesP.setEnabled(false);
      jScrollPane5.setViewportView(textoTelefonesP);

      jLabel8.setText("Telefones:");

      textoEnderecoP.setColumns(20);
      textoEnderecoP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      textoEnderecoP.setRows(5);
      textoEnderecoP.setEnabled(false);
      jScrollPane6.setViewportView(textoEnderecoP);

      endereco1.setText("Endereço:");

      textoNomeP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      textoNomeP.setEnabled(false);

      nome2.setText("Nome:");

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addComponent(jLabel13)
                  .addGap(509, 509, 509))
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jSeparator1)
                     .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(endereco)
                           .addComponent(nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(textoNomeA)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                              .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel7)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                     .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(endereco1)
                           .addComponent(nome2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(textoNomeP)
                           .addGroup(jPanel4Layout.createSequentialGroup()
                              .addComponent(jScrollPane6)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel8)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                  .addContainerGap())))
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(nome)
               .addComponent(textoNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                     .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))))
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addGap(37, 37, 37)
                  .addComponent(endereco)))
            .addGap(34, 34, 34)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addComponent(jLabel13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(nome2)
               .addComponent(textoNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(14, 14, 14)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                  .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                     .addGap(26, 26, 26)
                     .addComponent(jLabel8)))
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addGap(25, 25, 25)
                  .addComponent(endereco1)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel10.setText("Data:");

      jLabel11.setText("Hora:");

      textoData.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
      textoData.setText("dd/mm/AAAA");
      textoData.setEnabled(false);

      textoHora.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
      textoHora.setText("HH:mm");
      textoHora.setEnabled(false);

      textoStatus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
      textoStatus.setText("STATUS");

      jLabel14.setText("Status:");

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel10)
               .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel11)
               .addComponent(textoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(textoStatus)
               .addGroup(jPanel6Layout.createSequentialGroup()
                  .addComponent(jLabel14)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel10)
                  .addComponent(jLabel11)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(textoData)
               .addComponent(textoHora)
               .addComponent(textoStatus))
            .addContainerGap())
      );

      jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel2.setText("[F1] - Busca por Produtos");

      jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel3.setText("[F4] - Encerrar Faturamento");

      jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel4.setText("[F3] - Cancelar Faturamento");

      jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel5.setText("[F2] - Novo Faturamento");

      jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel9.setText("[F5] - Cancelar Item Faturado");

      jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel6.setText("[F6] - Busca por Aluno");

      jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
      jLabel16.setText("[F7] - Busca por Personal");

      javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
      jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel5)
               .addComponent(jLabel2)
               .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel6)
               .addGroup(jPanel7Layout.createSequentialGroup()
                  .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel9)
                     .addComponent(jLabel3))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jLabel16)))
            .addContainerGap(77, Short.MAX_VALUE))
      );
      jPanel7Layout.setVerticalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(26, 26, 26))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(north, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(north, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(35, 35, 35))
      );

      setSize(new java.awt.Dimension(1366, 855));
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

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
         java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TelaVendas().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField codigoBarras;
   private javax.swing.JLabel endereco;
   private javax.swing.JLabel endereco1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JPanel jPanel7;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JScrollPane jScrollPane6;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JTable listaItens;
   private javax.swing.JLabel nome;
   private javax.swing.JLabel nome2;
   private javax.swing.JPanel north;
   private javax.swing.JTextField textoData;
   private javax.swing.JTextArea textoEnderecoA;
   private javax.swing.JTextArea textoEnderecoP;
   private javax.swing.JTextField textoHora;
   private javax.swing.JTextField textoNomeA;
   private javax.swing.JTextField textoNomeP;
   private javax.swing.JTextField textoStatus;
   private javax.swing.JTextArea textoTelefonesA;
   private javax.swing.JTextArea textoTelefonesP;
   private javax.swing.JLabel titulo;
   private javax.swing.JLabel valorTotal;
   // End of variables declaration//GEN-END:variables

   public JTable getListaItens() {
      return listaItens;
   }

   public JTextField getTextoData() {
      return textoData;
   }

   public JTextArea getTextoEnderecoA() {
      return textoEnderecoA;
   }

   public JTextArea getTextoEnderecoP() {
      return textoEnderecoP;
   }

   public JTextField getTextoHora() {
      return textoHora;
   }

   public JTextField getTextoNomeA() {
      return textoNomeA;
   }

   public JTextField getTextoNomeP() {
      return textoNomeP;
   }

   public JTextArea getTextoTelefonesA() {
      return textoTelefonesA;
   }

   public JTextArea getTextoTelefonesP() {
      return textoTelefonesP;
   }

   public JTextField getTextoStatus() {
      return textoStatus;
   }

   public JLabel getValorTotal() {
      return valorTotal;
   }

   public JTextField getCodigoBarras() {
      return codigoBarras;
   }

   public void scroll(){
      textoEnderecoA.setCaretPosition(0);
      textoEnderecoP.setCaretPosition(0);
   }
}
