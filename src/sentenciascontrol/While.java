/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.MWhile;

/**
 *
 * @author Armando J. López L.
 */
public class While extends javax.swing.JInternalFrame {

    MWhile Wl = new MWhile(0, 0, 1000, 0);
    ArrayList<Double> decimales = new ArrayList<Double>();
    ArrayList<Integer> calificaciones = new ArrayList<Integer>();
    ArrayList<Double> cuotas = new ArrayList<Double>();
    /**
     * Creates new form While
     */
    public While() {
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

        tfNum3 = new javax.swing.JTextField();
        tfNum2 = new javax.swing.JTextField();
        tfOracion1 = new javax.swing.JTextField();
        lEjer5 = new javax.swing.JLabel();
        bVerificar3 = new javax.swing.JButton();
        bSumar2 = new javax.swing.JButton();
        lOracion = new javax.swing.JLabel();
        lEjer4 = new javax.swing.JLabel();
        bContar4 = new javax.swing.JButton();
        lCalificacion = new javax.swing.JLabel();
        lEjer2 = new javax.swing.JLabel();
        tfCali4 = new javax.swing.JTextField();
        lEjer3 = new javax.swing.JLabel();
        lNumero = new javax.swing.JLabel();
        lEjer1 = new javax.swing.JLabel();
        bCalcular1 = new javax.swing.JButton();
        lCuota = new javax.swing.JLabel();
        tfCuota5 = new javax.swing.JTextField();
        bPagar5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Repetición while de Java");

        tfNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNum2ActionPerformed(evt);
            }
        });

        tfOracion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOracion1ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Restar la cuota al saldo de C$1000, e imprimir la cantidad de cuotas pagadas cuando se cancele la deuda total");

        bVerificar3.setText("Verificar");
        bVerificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar3ActionPerformed(evt);
            }
        });

        bSumar2.setText("Sumar");
        bSumar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumar2ActionPerformed(evt);
            }
        });

        lOracion.setText("Oración:");

        lEjer4.setText("4. Contar la cantidad de calificaciones aprobadas, y mostrar cuando se digite -1");

        bContar4.setText("Contar");
        bContar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContar4ActionPerformed(evt);
            }
        });

        lCalificacion.setText("Calificación:");

        lEjer2.setText("2. Sumar los números decimales digitados, y mostrar cuando se digite -1");

        lEjer3.setText("3. Verificar si el siguiente número es perfecto");

        lNumero.setText("Número:");

        lEjer1.setText("1. Calcule el número de vocales existentes en la oración:");

        bCalcular1.setText("Calcular");
        bCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular1ActionPerformed(evt);
            }
        });

        lCuota.setText("Cuota:");

        bPagar5.setText("Pagar");
        bPagar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSumar2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lOracion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOracion1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEjer1)
                            .addComponent(lEjer2)
                            .addComponent(lEjer3)
                            .addComponent(lEjer4)
                            .addComponent(lEjer5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lCalificacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCali4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bContar4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bVerificar3)))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lCuota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCuota5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPagar5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEjer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lOracion)
                    .addComponent(tfOracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumero)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSumar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCalificacion)
                    .addComponent(tfCali4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bContar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCuota)
                    .addComponent(tfCuota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPagar5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVerificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar3ActionPerformed
        // TODO add your handling code here:
        try {
            int num = Integer.parseInt(tfNum3.getText());
            int perf = Wl.perfecto(num);
            if (num == perf) {
                JOptionPane.showMessageDialog(this, "El número " + perf + " es perfecto",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "El número " + num + " no es perfecto",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bVerificar3ActionPerformed

    private void bSumar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumar2ActionPerformed
        // TODO add your handling code here:
        try {
            double numero = Double.parseDouble(tfNum2.getText());
            decimales.add(numero);
            if (numero != -1) {
                tfNum2.setText("");
            } else {
                tfNum2.setText("");
                JOptionPane.showMessageDialog(this, "La suma de los números ingresados es " + Wl.sumar(decimales),
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
                Wl.setSuma(0);
                decimales.clear();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bSumar2ActionPerformed

    private void bContar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContar4ActionPerformed
        try {
            int calif = Integer.parseInt(tfCali4.getText());
            if (calif >= 70 && calif <= 100 || calif == -1) {
                calificaciones.add(calif);
                tfCali4.setText("");
            }
            if (calif == -1) {
                Wl.cantidad(calificaciones);
                JOptionPane.showMessageDialog(this, "Cantidad de aprobados: "
                + "" + Wl.getAprobados(), "Aprobados", JOptionPane.INFORMATION_MESSAGE);
                tfCali4.setText("");
                calificaciones.clear();
            }
            tfCali4.setText("");
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bContar4ActionPerformed

    private void bCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
        String oracion = tfOracion1.getText();
        int cont = Wl.contarVocales(oracion);
        JOptionPane.showMessageDialog(this, "La cantidad de vocales es " + cont,
                "Cantidad de Vocales", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bCalcular1ActionPerformed

    private void bPagar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPagar5ActionPerformed
        // TODO add your handling code here:
        try {
            double cuota = Double.parseDouble(tfCuota5.getText());
            if (cuota <= 0) {
                JOptionPane.showMessageDialog(this, "No es una cuota"
                        + " válida!!!", "Error", JOptionPane.ERROR_MESSAGE);
                tfCuota5.setText("");
            } else {
                cuotas.add(cuota);
                Wl.setSaldo(Wl.getSaldo() - cuota);
                if (Wl.getSaldo() <= 0) {
                    JOptionPane.showMessageDialog(this, "Deuda saldada en "+
                            Wl.cuotasParaSaldar(cuotas)+" pagos", "Cantidad"
                                    + " de pagos", JOptionPane.INFORMATION_MESSAGE);
                    Wl.setSaldo(1000);
                    cuotas.clear();
                } else {
                    tfCuota5.setText("");
                }
                
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bPagar5ActionPerformed

    private void tfOracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOracion1ActionPerformed


    }//GEN-LAST:event_tfOracion1ActionPerformed

    private void tfNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNum2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular1;
    private javax.swing.JButton bContar4;
    private javax.swing.JButton bPagar5;
    private javax.swing.JButton bSumar2;
    private javax.swing.JButton bVerificar3;
    private javax.swing.JLabel lCalificacion;
    private javax.swing.JLabel lCuota;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lOracion;
    private javax.swing.JTextField tfCali4;
    private javax.swing.JTextField tfCuota5;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfOracion1;
    // End of variables declaration//GEN-END:variables
}
