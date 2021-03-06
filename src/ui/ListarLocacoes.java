/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.DefaultListModel;
import locadoraveiculos.LocadoraDados;

/**
 *
 * @author renan
 */
public class ListarLocacoes extends javax.swing.JFrame {

    /**
     * Creates new form ListarLocacoes
     */
    public ListarLocacoes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listaLocacoes = new javax.swing.JList<>();
        btEmAberto = new javax.swing.JButton();
        btFinalizados = new javax.swing.JButton();
        btTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de alugueis");

        jScrollPane1.setViewportView(listaLocacoes);

        btEmAberto.setText("Em aberto");
        btEmAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmAbertoActionPerformed(evt);
            }
        });

        btFinalizados.setText("Finalizados");
        btFinalizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizadosActionPerformed(evt);
            }
        });

        btTodos.setText("Todos");
        btTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEmAberto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFinalizados)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEmAberto)
                    .addComponent(btFinalizados)
                    .addComponent(btTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTodosActionPerformed
    
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < LocadoraDados.getLocacao().size(); i++){
            modelo.addElement(LocadoraDados.getLocacao().get(i));
           }
        listaLocacoes.setModel(modelo);
    
    }//GEN-LAST:event_btTodosActionPerformed

    private void btEmAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmAbertoActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < LocadoraDados.getLocacao().size(); i++){
            if(LocadoraDados.getLocacao().get(i).getStatus().equals("LOCADO")){
                modelo.addElement(LocadoraDados.getLocacao().get(i));
            }
            
        }
        listaLocacoes.setModel(modelo);
    }//GEN-LAST:event_btEmAbertoActionPerformed

    private void btFinalizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizadosActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < LocadoraDados.getLocacao().size(); i++){
            if(LocadoraDados.getLocacao().get(i).getStatus().equals("RECEBIDO")){
                modelo.addElement(LocadoraDados.getLocacao().get(i));
            }
            
        }
        listaLocacoes.setModel(modelo);
    }//GEN-LAST:event_btFinalizadosActionPerformed

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
            java.util.logging.Logger.getLogger(ListarLocacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLocacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLocacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLocacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLocacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmAberto;
    private javax.swing.JButton btFinalizados;
    private javax.swing.JButton btTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaLocacoes;
    // End of variables declaration//GEN-END:variables
}
