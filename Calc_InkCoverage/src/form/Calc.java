/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import javax.swing.JOptionPane;
import main.JdInfo;

/**
 *
 * @author mrs_a
 */
public class Calc extends javax.swing.JPanel {

    private JdInfo info;

    public Calc() {
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

        lb_resultado = new javax.swing.JLabel();
        cb_substrato = new javax.swing.JComboBox<>();
        lb_substrato = new javax.swing.JLabel();
        lb_pesoTinta = new javax.swing.JLabel();
        cb_pesoTinta = new javax.swing.JComboBox<>();
        lb_inkCoverage = new javax.swing.JLabel();
        lb_quantidade = new javax.swing.JLabel();
        txt_inkCoverage = new javax.swing.JTextField();
        txt_quantidade = new javax.swing.JTextField();
        lb_verniz = new javax.swing.JLabel();
        cb_acabamentoVerniz = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btn_info = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        jC_calcularPreflight = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        lb_resultado.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb_resultado.setForeground(new java.awt.Color(0, 153, 255));
        lb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_resultado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        cb_substrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão Copo", "Cartão Couché", "Cartão Coated", "Cartão Uncoated", "Cartão Laminado", "Papel Sulfite" }));

        lb_substrato.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lb_substrato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_substrato.setText("Substrato");

        lb_pesoTinta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lb_pesoTinta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_pesoTinta.setText("Peso Específico da tinta");

        cb_pesoTinta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CMYK", "CMYK UV", "Escala Pantone", "Tons Pastéis", "Metalizado", "Branco Opaco" }));

        lb_inkCoverage.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lb_inkCoverage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_inkCoverage.setText("*Ink Coverage mm²");

        lb_quantidade.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lb_quantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_quantidade.setText("*Digite a tiragem de impressão");

        txt_inkCoverage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_inkCoverage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inkCoverageKeyTyped(evt);
            }
        });

        txt_quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_quantidade.setToolTipText("Digite a quantidade de produto para Prefligh ou Tiragem de impressão para Postfligh ");
        txt_quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_quantidadeKeyTyped(evt);
            }
        });

        lb_verniz.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lb_verniz.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_verniz.setText("Acabamento Verniz");

        cb_acabamentoVerniz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brilho", "Fosco" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("(*)Preenchimento obrigatório");

        btn_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btn_info.setToolTipText("Informações");
        btn_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_infoActionPerformed(evt);
            }
        });

        btn_Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calcular.png"))); // NOI18N
        btn_Calcular.setToolTipText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        btn_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reiniciar.png"))); // NOI18N
        btn_Limpar.setToolTipText("Reiniciar/Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        jC_calcularPreflight.setText("Calcular Preflight");
        jC_calcularPreflight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC_calcularPreflightMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("V 1.0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_inkCoverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_substrato, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jC_calcularPreflight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_substrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_pesoTinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_pesoTinta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inkCoverage, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_verniz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_acabamentoVerniz, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btn_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btn_Calcular))
                    .addComponent(lb_quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jC_calcularPreflight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(lb_substrato, javax.swing.GroupLayout.Alignment.TRAILING))
                .addComponent(cb_substrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_pesoTinta)
                .addGap(0, 0, 0)
                .addComponent(cb_pesoTinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_verniz)
                .addGap(0, 0, 0)
                .addComponent(cb_acabamentoVerniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_inkCoverage)
                .addGap(0, 0, 0)
                .addComponent(txt_inkCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_quantidade)
                .addGap(0, 0, 0)
                .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_info)
                    .addComponent(btn_Calcular)
                    .addComponent(btn_Limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed

        lb_quantidade.setText("*Digite a tiragem de impressão");
        jC_calcularPreflight.setSelected(false);
        lb_resultado.setText("");
        cb_pesoTinta.setSelectedIndex(0);
        cb_substrato.setSelectedIndex(0);
        cb_acabamentoVerniz.setSelectedIndex(0);
        txt_inkCoverage.setText("");
        txt_quantidade.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed

        if ("".equals(txt_inkCoverage.getText())) {
            JOptionPane.showMessageDialog(null, "Digite o valor do Ink Coverage!", "", 2);
        } else {
            if ("".equals(txt_quantidade.getText())) {
                if (jC_calcularPreflight.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Digite a quantidade de produtos!", "", 2);
                } else {
                    JOptionPane.showMessageDialog(null, "Digite a tiragem de impressão!", "", 2);
                }
            } else {
                float s = 0, p = 0, a = 0, i = 0, n = 0, sg = 0, resultadoPostflight = 0, resultadoPreflight = 0;
                switch (cb_substrato.getSelectedIndex()) {
                    case 0:
                        s = (float) 1;
                        break;
                    case 1:
                        s = (float) 1.1;
                        break;
                    case 2:
                        s = (float) 1.2;
                        break;
                    case 3:
                        s = (float) 1.3;
                        break;
                    case 4:
                        s = (float) 1.4;
                        break;
                    case 5:
                        s = (float) 1.5;
                        break;
                }

                switch (cb_pesoTinta.getSelectedIndex()) {
                    case 0:
                        sg = (float) 1;
                        break;
                    case 1:
                        sg = (float) 1.1;
                        break;
                    case 2:
                        sg = (float) 1.2;
                        break;
                    case 3:
                        sg = (float) 1.3;
                        break;
                    case 4:
                        sg = (float) 1.4;
                        break;
                    case 5:
                        sg = (float) 1.5;
                        break;
                }

                switch (cb_acabamentoVerniz.getSelectedIndex()) {
                    case 0:
                        a = (float) 1.0;
                        break;
                    case 1:
                        a = (float) 1.15;
                        break;
                }

                i = (Float.parseFloat(txt_inkCoverage.getText().replace(",", "."))) / 1000000;
                n = Float.parseFloat(txt_quantidade.getText().replace(",", "."));
                p = (float) 0.5;
                resultadoPostflight = (s * p * a * i * n * sg) / 353;
                resultadoPreflight = (float) (resultadoPostflight * 1.3);

                if (jC_calcularPreflight.isSelected()) {
                    lb_resultado.setText(String.format("%.2f", resultadoPreflight) + "Kg");
                } else {
                    lb_resultado.setText(String.format("%.2f", resultadoPostflight) + "Kg");
                }

            }
        }
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void btn_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_infoActionPerformed

        if (info == null) {
            info = new JdInfo();
            info.setVisible(true);
        }

        info.setVisible(true);
    }//GEN-LAST:event_btn_infoActionPerformed

    private void txt_inkCoverageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inkCoverageKeyTyped

        String caracteres = "0987654321,.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_inkCoverageKeyTyped

    private void txt_quantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantidadeKeyTyped

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_quantidadeKeyTyped

    private void jC_calcularPreflightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC_calcularPreflightMouseClicked

        if (jC_calcularPreflight.isSelected()) {
            lb_quantidade.setText("*Digite a quantidade de produtos");
        } else {
            lb_quantidade.setText("*Digite a tiragem de impressão");
        }
    }//GEN-LAST:event_jC_calcularPreflightMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_info;
    private javax.swing.JComboBox<String> cb_acabamentoVerniz;
    private javax.swing.JComboBox<String> cb_pesoTinta;
    private javax.swing.JComboBox<String> cb_substrato;
    private javax.swing.JCheckBox jC_calcularPreflight;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_inkCoverage;
    private javax.swing.JLabel lb_pesoTinta;
    private javax.swing.JLabel lb_quantidade;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_substrato;
    private javax.swing.JLabel lb_verniz;
    private javax.swing.JTextField txt_inkCoverage;
    private javax.swing.JTextField txt_quantidade;
    // End of variables declaration//GEN-END:variables
}
