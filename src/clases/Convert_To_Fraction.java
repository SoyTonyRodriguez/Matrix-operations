package clases;

public class Convert_To_Fraction {

    private int num, denom;

    public Convert_To_Fraction(){
        
    }

    //Método para convertir en fracción un decimal
    static public String convertDecimalToFraction(double x) {
        if (x < 0) {
            return "-" + convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        double h1 = 1;
        double h2 = 0;
        double k1 = 0;
        double k2 = 1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1;
            h1 = a * h1 + h2;
            h2 = aux;
            aux = k1;
            k1 = a * k1 + k2;
            k2 = aux;
            b = 1 / (b - a);
        } while (Math.abs(x - h1 / k1) > x * tolerance);
        int hInt = (int) h1;
        int KInt = (int) k1;

        return hInt + "/" + KInt;
    }
    
    



}
