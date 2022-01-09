package clases;

import javax.swing.JOptionPane;

public class Inversa_Proceso {

    public Inversa_Proceso() {
    }

    // Función para obtener el cofactor de A [p][q] en temp [][]. n es actual
// dimensión de A [][]
    public void getCofactor(double A[][], double temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        // Bucle para cada elemento de la matriz
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                //  Copiar en matriz temporal solo esos elementos
                 // que no están en la fila y columna dadas
                if (row != p && col != q) {
                    temp[i][j++] = A[row][col];

                    // La fila está llena, así que aumente el índice de fila y
                     // restablecer el índice de columna
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    /* Función recursiva para encontrar determinante de matriz.
    n es la dimensión actual de A [][]. */
    public double determinant(double A[][], int n, int N) {
        int D = 0; // Inicializar resultado

        //  Caso base: si la matriz contiene un solo elemento
        if (n == 1) {
            return A[0][0];
        }

        double temp[][] = new double[N][N]; // Para almacenar cofactores
            int sign = 1;  // Para almacenar el multiplicador de signos

        // Iterar para cada elemento de la primera fila
        for (int f = 0; f < n; f++) {
            // Obteniendo cofactor de A [0][f]
            getCofactor(A, temp, 0, f, n);
            D += sign * A[0][f] * determinant(temp, n - 1, N);

            // los términos deben agregarse con un signo alternativo
            sign = -sign;
        }

        return D;
    }

// Función para obtener adjunto de A [N][N] en adj [N][N].
    public void adjoint(double A[][], double adj[][], int N) {
        if (N == 1) {
            adj[0][0] = 1;
            return;
        }

        // temp se utiliza para almacenar cofactores de A[][]
        int sign = 1;
        double temp[][] = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Conseguir cofactor de A[i][j]
                getCofactor(A, temp, i, j, N);

                //signo de adj [j][i] positivo si suma de fila
                 // y los índices de columna son pares.
                sign = ((i + j) % 2 == 0) ? 1 : -1;

                // Intercambiar filas y columnas para obtener el
                 // transposición de la matriz del cofactor
                adj[j][i] = (sign) * (determinant(temp, N - 1, N));
            }
        }
    }

// Función para calcular y almacenar inversa, devuelve falso si
// la matriz es singular
    public boolean inverse(double A[][], double inverse[][], int N) {
        // Encontrar el determinante de A[][]
        double det = determinant(A, N, N);
        if (det == 0) {
            JOptionPane.showMessageDialog(null, "Matriz singular, no puedo encontrar su inversa");
            return false;
        }

        // Encontrar adjunta
        double adj[][] = new double[N][N];
        adjoint(A, adj, N);

        // Encontrar la inversa con la formula:  "inverse(A) = adj(A)/det(A)"
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                inverse[i][j] = adj[i][j] / det;
            }
        }

        return true;
    }
    
    //Funcion para multiplicar matrices
    public void multiplicacion_Matriz(double matriz_A[][], double matriz_B[][], 
            double matriz_C[][], int columnas, int columnas_MatrizA) {
        
        for (int rows = 0; rows < 3; rows++) {
            for (int columns = 0; columns < columnas; columns++) {
                for (int colums_A = 0; colums_A < columnas_MatrizA; colums_A++) {
                    matriz_C[rows][columns] += matriz_A[rows][colums_A] * matriz_B[colums_A][columns];
                }

            }
        }
    }

}
