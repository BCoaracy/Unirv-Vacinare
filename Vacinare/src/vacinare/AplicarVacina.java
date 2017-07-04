package vacinare;

public class AplicarVacina extends javax.swing.JInternalFrame {
    public AplicarVacina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vacinas = new javax.swing.JComboBox<>();
        animais = new javax.swing.JComboBox<>();
        vacinar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel1.setText("Vacinação");

        jLabel2.setText("Vacina:");

        jLabel3.setText("Numero Animal");

        vacinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vacinas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vacinasItemStateChanged(evt);
            }
        });

        animais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        animais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                animaisItemStateChanged(evt);
            }
        });

        vacinar.setText("Vacinar");
        vacinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinarActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(animais, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vacinar)
                                .addGap(164, 164, 164)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vacinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(animais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vacinar)
                    .addComponent(jButton2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vacinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_vacinarActionPerformed

    private void vacinasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vacinasItemStateChanged
        // TODO add your handling code here:
        if(vacinaCell.getSelecionado() instanceof Vacina) {
            System.out.println((Vacina) vacinaCell.getSelecionado());
            vacina = (Vacina) vacinaCell.getSelecionado();
        }
    }//GEN-LAST:event_vacinasItemStateChanged

    private void animaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_animaisItemStateChanged
        // TODO add your handling code here:
        if(animalCell.getSelecionado() instanceof Animal) {
            System.out.println((Animal) animalCell.getSelecionado());
            animal = (Animal) animalCell.getSelecionado();
        }
    }//GEN-LAST:event_animaisItemStateChanged

    private void recarregarCombos() {
        vacinaCell = new VacinaCellRenderer();
        vacin = new VacinaModelo();
        vacinas.setRenderer(vacinaCell);
        vacinas.setModel(vacin);
        animalCell = new AnimalCellRenderer();
        anim = new AnimalModelo();
        animais.setRenderer(animalCell);
        animais.setModel(anim);
    }
    
    private static AplicarVacina instance = null;
    public static AplicarVacina getInstance() {
        if (instance == null) {
            instance = new AplicarVacina();
            TelaPrincipal.getInstance().getDesktop().add(instance);
        }
        instance.recarregarCombos();
        return instance;
    }
    
    private VacinaCellRenderer vacinaCell;
    private VacinaModelo vacin;
    private Vacina vacina = null;
    private AnimalCellRenderer animalCell;
    private AnimalModelo anim;
    private Animal animal = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> animais;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton vacinar;
    private javax.swing.JComboBox<String> vacinas;
    // End of variables declaration//GEN-END:variables
}
