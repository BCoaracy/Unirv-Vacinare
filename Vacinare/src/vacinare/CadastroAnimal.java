package vacinare;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroAnimal extends javax.swing.JInternalFrame {
    public CadastroAnimal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        origem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prenhes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        raca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        feminino = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();
        sim = new javax.swing.JRadioButton();
        nao = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        sim1 = new javax.swing.JRadioButton();
        nao1 = new javax.swing.JRadioButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setText("Numero");

        jLabel2.setText("Raça");

        jLabel3.setText("Sexo");

        jLabel4.setText("Origem");

        jLabel5.setText("Idade");

        jLabel6.setText("Prenha");

        jLabel7.setText("Prenhês");

        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racaActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        feminino.setText("Feminino");

        masculino.setText("Masculino");

        sim.setText("Sim");

        nao.setText("Não");

        jLabel8.setText("Vacinado");

        sim1.setText("Sim");

        nao1.setText("Não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(70, 70, 70)
                        .addComponent(sim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num)
                            .addComponent(raca)
                            .addComponent(origem)
                            .addComponent(idade, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(feminino)
                                .addGap(18, 18, 18)
                                .addComponent(masculino))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(prenhes, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sim1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nao1))
                    .addComponent(jButton1))
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(feminino)
                    .addComponent(masculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sim)
                    .addComponent(nao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(prenhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sim1)
                        .addComponent(nao1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_racaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Animal animal = new Animal();
        animal.setNumero(Integer.parseInt(num.getText()));
        animal.setRaca(raca.getText());
        if (masculino.isSelected()) {
            animal.setSexo('m');
        } else {
            animal.setSexo('f');
        }
        animal.setOrigem(origem.getText());
        animal.setIdade(Integer.parseInt(idade.getText()));
        if (sim.isSelected()) {
            animal.setPrenha(true);
        } else {
            animal.setPrenha(false);
        }
        animal.setTempoPrenhes(Integer.parseInt(prenhes.getText()));
        if (sim1.isSelected()) {
            animal.setVacinado(true);
        } else {
            animal.setVacinado(false);
        }
        
        Controlador.getInstance().adicionar(animal);
        JOptionPane.showMessageDialog(TelaPrincipal.getInstance(), "Animal cadastrado com sucesso!");
        instance.limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void limparCampos() {
        num.setText("");
        raca.setText("");
        masculino.setSelected(false);
        feminino.setSelected(false);
        origem.setText("");
        idade.setText("");
        sim.setSelected(false);
        nao.setSelected(false);
        prenhes.setText("");
        sim1.setSelected(false);
        nao1.setSelected(false);
    }
    
    private static CadastroAnimal instance = null;
    public static CadastroAnimal getInstance() {
        if(instance == null) {
            instance = new CadastroAnimal();
            TelaPrincipal.getInstance().getDesktop().add(instance);
        }
        instance.limparCampos();
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton feminino;
    private javax.swing.JTextField idade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton nao;
    private javax.swing.JRadioButton nao1;
    private javax.swing.JTextField num;
    private javax.swing.JTextField origem;
    private javax.swing.JTextField prenhes;
    private javax.swing.JTextField raca;
    private javax.swing.JRadioButton sim;
    private javax.swing.JRadioButton sim1;
    // End of variables declaration//GEN-END:variables
}
