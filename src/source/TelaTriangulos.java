/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author itor5
 */
public class TelaTriangulos extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriangulos
     */
    public TelaTriangulos() {
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

        sliderLado1 = new javax.swing.JSlider();
        sliderLado2 = new javax.swing.JSlider();
        sliderLado3 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblExibeLado1 = new javax.swing.JLabel();
        lblExibeLado2 = new javax.swing.JLabel();
        lblExibeLado3 = new javax.swing.JLabel();
        buttonVerificar = new javax.swing.JButton();
        lblExibeTipoTriangulo = new javax.swing.JLabel();
        lblExibeImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sliderLado1.setMaximum(27);
        sliderLado1.setMinimum(1);
        sliderLado1.setValue(14);
        sliderLado1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderLado1StateChanged(evt);
            }
        });

        sliderLado2.setMaximum(27);
        sliderLado2.setMinimum(1);
        sliderLado2.setValue(14);
        sliderLado2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderLado2StateChanged(evt);
            }
        });

        sliderLado3.setMaximum(27);
        sliderLado3.setMinimum(1);
        sliderLado3.setValue(14);
        sliderLado3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderLado3StateChanged(evt);
            }
        });

        jLabel1.setText("Lado1:");

        jLabel2.setText("Lado 2:");

        jLabel3.setText("Lado 3:");

        lblExibeLado1.setText("14");

        lblExibeLado2.setText("14");

        lblExibeLado3.setText("14");

        buttonVerificar.setText("VERIFICAR");
        buttonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblExibeLado1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(lblExibeLado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExibeLado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(buttonVerificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblExibeTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblExibeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sliderLado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblExibeLado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblExibeTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sliderLado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExibeLado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sliderLado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExibeLado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99)
                        .addComponent(buttonVerificar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblExibeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderLado1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderLado1StateChanged
        int valorAtualSlider1 = sliderLado1.getValue();
        lblExibeLado1.setText(Integer.toString(valorAtualSlider1));
    }//GEN-LAST:event_sliderLado1StateChanged

    private void sliderLado2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderLado2StateChanged
        int valorAtualSlider2 = sliderLado2.getValue();
        lblExibeLado2.setText(Integer.toString(valorAtualSlider2));
    }//GEN-LAST:event_sliderLado2StateChanged

    private void sliderLado3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderLado3StateChanged
        int valorAtualSlider3 = sliderLado3.getValue();
        lblExibeLado3.setText(Integer.toString(valorAtualSlider3));
    }//GEN-LAST:event_sliderLado3StateChanged

    private void buttonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerificarActionPerformed
         int valorLado1 = sliderLado1.getValue();//variavel que irá armazenar o valor do slider 1 quando o botao for clicado
         int valorLado2 = sliderLado2.getValue();//variavel que irá armazenar o valor do slider 2 quando o botao for clicado
         int valorLado3 = sliderLado3.getValue();//variavel que irá armazenar o valor do slider 3 quando o botao for clicado
         String location = System.getProperty("user.dir");//a variavel location irá armazenar o valor atual do sistema do usuario
         Icon images;
         
         
         if((valorLado1 < valorLado2+valorLado3 && valorLado1 > valorLado2 - valorLado3) && (valorLado2 < valorLado1+valorLado3 && valorLado2> valorLado1-valorLado3) && (valorLado3 < valorLado1+valorLado2 && valorLado3 < valorLado1+valorLado2)){//esse if será responsavel por verificar se os valores informados podem formar triangulo
             if(valorLado1 == valorLado2 && valorLado2 == valorLado3){//teste se o triangulo criado é equilatero
                 lblExibeTipoTriangulo.setText("EQUILATERO");//muda o texto para informar ao usuario o tipo de triangulo
                 lblExibeImagem.setIcon(new ImageIcon(location+"\\src\\images\\triangulo_equilatero.png"));//muda a imagem para a imagem de um triangulo equilatero
             }
             
             else if(valorLado1 != valorLado2 && valorLado1 != valorLado3 && valorLado2 != valorLado3){//teste se o triangulo criado é escaleno
                 lblExibeTipoTriangulo.setText("ESCALENO");//muda o texto para informar ao usuario o tipo de triangulo
                 lblExibeImagem.setIcon(new ImageIcon(location+"\\src\\images\\triangulo_escaleno.png"));//muda a imagem para a imagem de um triangulo escaleno
             }
             
             else{//esse else será executado quandoo triangulo informado não for nem escaleno e nem equilatero
                 lblExibeTipoTriangulo.setText("ISÓSCELES");//muda o texto para informar ao usuario o tipo de triangulo
                 lblExibeImagem.setIcon(new ImageIcon(location+"\\src\\images\\triangulo_isosceles.png"));//muda a imagem para a imagem de um triangulo isosceles
             }
             
             
         }
         
         else{//esse eelse será executado quando o triangulo não puder ser criado
             lblExibeImagem.setIcon(null);//retira a imagem da tela
             lblExibeTipoTriangulo.setText("");//retira o texto da tela
             JOptionPane.showMessageDialog(null,"Os valores informados não formam triangulo","NÃO FOI POSSIVEL FORMAR TRIANGULO",JOptionPane.ERROR_MESSAGE);//exibe uma mensagem para o usuario dizendo que o triangulo não puder ser criado
         }
         
         
         
    }//GEN-LAST:event_buttonVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblExibeImagem;
    private javax.swing.JLabel lblExibeLado1;
    private javax.swing.JLabel lblExibeLado2;
    private javax.swing.JLabel lblExibeLado3;
    private javax.swing.JLabel lblExibeTipoTriangulo;
    private javax.swing.JSlider sliderLado1;
    private javax.swing.JSlider sliderLado2;
    private javax.swing.JSlider sliderLado3;
    // End of variables declaration//GEN-END:variables
}
