
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class DlgBiodata extends javax.swing.JDialog {

    private FrmBiodata myparent;

    /**
     * Creates new form DlgBiodata
     */
    public DlgBiodata(FrmBiodata parent, boolean modal) {
        super(parent, modal);
        initComponents();

        myparent = parent;
        generateData();

        setLocationRelativeTo(null);
    }

    private void generateData() {

        String gender, category = null;
        double bmi, height, weight;
        ArrayList edu = new ArrayList();
        height = myparent.sliHeight.getValue();
        weight = myparent.sliWeight.getValue();

        if (myparent.rdoMale.isSelected()) {
            gender = myparent.rdoMale.getText();
            bmi = weight / ((height / 100) * (height / 100));
            if (bmi < 17) {
                category = "Under Weight";
            } else if (bmi >= 17 && bmi < 23) {
                category = "Normal";
            } else if (bmi >= 23 && bmi < 27) {
                category = "Over Weight";
            } else if (bmi > 27) {
                category = "Obesity";
            }
        } else {
            gender = myparent.rdoFemale.getText();
            bmi = weight / ((height / 100) * (height / 100));
            if (bmi < 18) {
                category = "Under Weight";
            } else if (bmi >= 18 && bmi < 25) {
                category = "Normal";
            } else if (bmi >= 25 && bmi < 27) {
                category = "Over Weight";
            } else if (bmi > 27) {
                category = "Obesity";
            }
        }
        
        if (myparent.chkSD.isSelected()) {
            edu.add("SD");
        }
        if (myparent.chkSMP.isSelected()) {
            edu.add("SMP");
        }
        if (myparent.chkSMA.isSelected()) {
            edu.add("SMA");
        }
        if (myparent.chkS1.isSelected()) {
            edu.add("S1");
        }
        if (myparent.chkS2.isSelected()) {
            edu.add("S2");
        }
        if (myparent.chkS3.isSelected()) {
            edu.add("S3");
        }
        
        

        String result = "Name : " + myparent.txtName.getText() + "\n"
                + "Birth Place : " + myparent.txtBirthPlace.getText() + "\n"
                + "Birth Date : " + myparent.spiDate.getValue() + "-" + myparent.spiMonth.getValue() + "-" + myparent.spiYear.getValue() + "\n"
                + "Gender : " + gender + "\n"
                + "Height : " + myparent.sliHeight.getValue() + " cm" + "\n"
                + "Weight : " + myparent.sliWeight.getValue() + " kg" + "\n"
                + "Address : " + myparent.txaAddress.getText() + "\n"
                + "Education : "+edu + "\n\n"
                + String.format("Your Body Index Mass (BMI) : %.2f", bmi) + "\n"
                + "Your Weight is " + category;

        txaResult.setText(result);
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
        txaResult = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txaResult.setColumns(20);
        txaResult.setRows(5);
        jScrollPane1.setViewportView(txaResult);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResult;
    // End of variables declaration//GEN-END:variables
}