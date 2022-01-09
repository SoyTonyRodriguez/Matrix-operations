package paneles;

import clases.Tabla_Iteraciones;
import clases.Convert_To_Fraction;
import clases.Ecuaciones;
import java.awt.Color;
import javax.swing.JOptionPane;

public class pnl_Gaussiana extends javax.swing.JPanel {

    public pnl_Gaussiana() {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.white);
        jScrollPane2.getViewport().setBackground(Color.white);

        tbl_Matriz.setSelectionForeground(Color.black);
        tbl_Resultado.setSelectionForeground(Color.black);
        tbl_Resultado.setEnabled(false);

        iteraciones.centrar(tbl_Matriz);

        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel7.setVisible(false);
    }
    Tabla_Iteraciones iteraciones = new Tabla_Iteraciones();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lbl_X_Uno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_X_Dos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_X_Tres = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Resultado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Matriz = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 86, 186));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eliminación Gaussiana");

        lbl_X_Uno.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel3.setText("X2:");

        lbl_X_Dos.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setText("X3:");

        lbl_X_Tres.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N

        tbl_Resultado.setAutoCreateRowSorter(true);
        tbl_Resultado.setBackground(new java.awt.Color(204, 199, 228));
        tbl_Resultado.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tbl_Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_Resultado.setGridColor(new java.awt.Color(155, 154, 163));
        tbl_Resultado.setSelectionBackground(new java.awt.Color(204, 199, 228));
        tbl_Resultado.setShowGrid(true);
        tbl_Resultado.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_Resultado);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportView(  tbl_Resultado  );
        jScrollPane2.setColumnHeaderView( tbl_Resultado.getTableHeader());

        jScrollPane2.getColumnHeader().setVisible(false);
        jScrollPane2.revalidate();
        jScrollPane2.setBorder(null);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Valores de incongnitas:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("X1:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tbl_Matriz.setAutoCreateRowSorter(true);
        tbl_Matriz.setBackground(new java.awt.Color(204, 199, 228));
        tbl_Matriz.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tbl_Matriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_Matriz.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tbl_Matriz.setGridColor(new java.awt.Color(155, 154, 163));
        tbl_Matriz.setSelectionBackground(new java.awt.Color(204, 199, 228));
        tbl_Matriz.setShowGrid(true);
        jScrollPane1.setViewportView(tbl_Matriz);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(  tbl_Matriz  );
        jScrollPane1.setColumnHeaderView( tbl_Matriz.getTableHeader());

        jScrollPane1.getColumnHeader().setVisible(false);
        jScrollPane1.revalidate();
        jScrollPane1.setBorder(null);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel6.setText("Ingresa los valores de la matriz");

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel7.setText("Matriz final:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_X_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 53, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbl_X_Dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbl_X_Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(lbl_X_Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbl_X_Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lbl_X_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int fila = 3, columna_A = 4, i = 0, j = 0, flag = 0;

        try {
            if (iteraciones.validCheck(tbl_Matriz)) {

                Object object_A[][] = iteraciones.getTableData(tbl_Matriz);

                double m_A[][] = new double[fila][columna_A];
                double m_C[][] = new double[fila][columna_A];

                for (i = 0; i < tbl_Matriz.getRowCount(); i++) {
                    for (j = 0; j < tbl_Matriz.getColumnCount(); j++) {
                        m_A[i][j] = Double.parseDouble((String) object_A[i][j]);
                    }
                }

                //Para verificar cuantas soluciones tiene el sistema
                Ecuaciones ecuaciones = new Ecuaciones();
                flag = ecuaciones.PerformOperation(m_A, 3);
                if (flag == 1) {
                    flag = ecuaciones.CheckConsistency(m_A, 3, flag);
                }

                int ORDEN = 3;
                double division;
                //Recorrer la matriz
                for (j = 0; j < ORDEN; j++) {
                    for (i = 0; i < ORDEN; i++) {
                        if (i > j) {

                            //Divir los elementos de la matriz
                            division = m_A[i][j] / m_A[j][j];

                            for (int k = 0; k <= ORDEN; k++) {
                                //Obterner el nuevo valor para los elementos en la diagonal inferior
                                m_A[i][k] = -division * m_A[j][k] + m_A[i][k];

                            }
                        }
                    }
                }
                if (flag == 2) {
                    JOptionPane.showMessageDialog(null, "EL sistema tiene soluciones infinitas");
                }
                if (flag == 3) {
                    JOptionPane.showMessageDialog(null, "El sistema no tiene soluciones");
                }

                iteraciones.mostrar_Matriz(m_A, fila, columna_A, tbl_Resultado);

                //Recorrer la matriz
                double suma;
                double x[] = new double[ORDEN];
                for (i = ORDEN - 1; i >= 0; i--) { 
                    suma = 0;
                    for (j = i + 1; j <= ORDEN - 1; j++) { 
                        suma = suma + m_A[i][j] * x[j]; 
                    }
                    //Obtener los valores de las variables
                    x[i] = (m_A[i][ORDEN] - suma) / m_A[i][i];
                }

                Convert_To_Fraction fraction = new Convert_To_Fraction();

                jLabel1.setVisible(true);
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel7.setVisible(true);

                lbl_X_Uno.setText(String.valueOf(fraction.convertDecimalToFraction(x[0])));
                lbl_X_Dos.setText(String.valueOf(fraction.convertDecimalToFraction(x[1])));
                lbl_X_Tres.setText(String.valueOf(fraction.convertDecimalToFraction(x[2])));
                
                iteraciones.centrar(tbl_Resultado);

            } else {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe llenar todas las celdas");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_X_Dos;
    private javax.swing.JLabel lbl_X_Tres;
    private javax.swing.JLabel lbl_X_Uno;
    private javax.swing.JTable tbl_Matriz;
    private javax.swing.JTable tbl_Resultado;
    // End of variables declaration//GEN-END:variables
}
