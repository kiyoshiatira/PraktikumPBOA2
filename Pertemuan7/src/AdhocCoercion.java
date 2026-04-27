// Nama-NIM : Kiyoshi Akila Tira - 24060124130074    
// File name: AdhocCoercion.java
// Deskripsi: Berisi koersi ad-hoc pada tipe data primitif dan objek

public class AdhocCoercion {
    public static void main(String[] args) {
        int x = 65;

        
        System.out.println("Integer: " + x);
        System.out.println("Char: " + (char)x);
        System.out.println("Double: " + (double)x);

        
        double real = (double)x;
        int balik = (int)real;
        System.out.println("Balik ke int: " + balik);

        
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (concat): " + S);
        System.out.println("Z (sum): " + Z);

        
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R (concat): " + R);
        System.out.println("D (sum): " + D);

        
        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        
        String T = A.toString();
        System.out.println("T: " + T);
    }
}