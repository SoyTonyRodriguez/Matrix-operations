package clases;

public class Ecuaciones {

    public Ecuaciones() {
    }

    public int PerformOperation(double matriz[][], int orden) {
        
        Tabla_Iteraciones iteraciones = new Tabla_Iteraciones();
        int i, j, k = 0, c, flag = 0, m = 0;
        double pro = 0;

        // Realización de operaciones elementales 
        for (i = 0; i < orden; i++) {
            if (matriz[i][i] == 0) {
                c = 1;
                while ((i + c) < orden && matriz[i + c][i] == 0) {
                    c++;
                }
                if ((i + c) == orden) {
                    flag = 1;
                    break;
                }
                for (j = i, k = 0; k <= orden; k++) {
                    iteraciones.swap(matriz[j][k], matriz[j + c][k]);
                }
            }

            for (j = 0; j < orden; j++) {

                // Excluyendo todo i == j
                if (i != j) {

                    // Conversión de Matrix en fila reducida
                     // forma escalonada (matriz diagonal) 
                    pro = matriz[j][i] / matriz[i][i];

                    for (k = 0; k <= orden; k++) {
                        matriz[j][k] = matriz[j][k] - (matriz[i][k]) * pro;
                    }
                }
            }
        }
        return flag;
    }

    public int CheckConsistency(double a[][], int n, int flag) {
        int i, j;
        double sum;

        // flag == 2 para soluciones infinitas
        // flag == 3 no hay soluciones
        flag = 3;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < n; j++) {
                sum = sum + a[i][j];
            }
            if (sum == a[i][j]) {
                flag = 2;
            }
        }
        return flag;
    }

}
