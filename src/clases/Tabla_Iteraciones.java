package clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Tabla_Iteraciones {

    public Tabla_Iteraciones() {
    }
    
    //Funcion para obtener los datos de una tabla
    public Object[][] getTableData(JTable table) {
        TableModel dtm = table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tableData;
    }

    //Función para generar una tabla
    public void generar(int filas, int columnas, JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(filas);
        model.setColumnCount(columnas);

    }

    //Funcion para mostrar una tabla con una matriz
    public void mostrar_Matriz(double matriz[][], int filas, int columnas, JTable tabla) {

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(filas);
        model.setColumnCount(columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla.setValueAt(matriz[i][j], i, j);
            }
        }
    }

    //Fincion para centrar los datos de una tabla
    public void centrar(JTable tabla) {
        //Para centrar los elementos de la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int j = 0; j < tabla.getColumnCount(); j++) {

                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                tabla.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
            }
        }
    }
    
    //Funcion para validar cada celda de una tabla
    public boolean validCheck(JTable table) {
      if(table.getCellEditor()!= null) {
         table.getCellEditor().stopCellEditing();
      }
      for(int i=0; i < table.getRowCount(); i++) {
         for(int j=0; j < table.getColumnCount(); j++) {
            String value = table.getValueAt(i,j).toString();
            if(value.trim().length() == 0) {
               return false;
            }
         }
      }
      return true;
   }
    //Función para borrar los datos de una tabla
    public void borrar_Tabla(JTable table){
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged(); // notifica a JTable que el modelo ha cambiado
    }

    // Función para intercambiar 2 valores
    public static void swap(double c1, double c2) {
        double temp = c1;
        c1 = c2;
        c2 = temp;
    }
}
