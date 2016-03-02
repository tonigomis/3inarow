import java.util.Arrays;

/**
 * Created by toni on 27/01/16.
 */

class Matrix {
    int[][] elements;
    int dimx, dimy;

    //Constructor
    public Matrix(int[][] elements) {
        dimx = elements[0].length;
        dimy = elements.length;
        this.elements = new int[dimy][dimx];
        for (int i = 0; i < dimy; i++) {
            for (int j = 0; j < dimx; j++) {
                this.elements[i][j] = elements[i][j];
            }
        }
    }

    void transposa() {
        int[][] nou = new int[dimx][dimy];

        //codi que fa la transposició
        for (int j = 0; j < dimy; j++) {
            for (int i = 0; i < dimx; i++) {
                nou[i][j] = elements[j][i];
            }
        }
        this.elements = nou;
        int t = dimx;
        dimx = dimy;
        dimy = t;
    }

    void imprimeix() {
        for (int i = 0; i < dimy; i++) {
            for (int j = 0; j < dimx; j++) {
                System.out.print(elements[i][j]);
            }
            System.out.println();
        }
    }

    Matrix multiplica(Matrix mat2) {
        if (this.dimx != mat2.dimy) {
            return null;
    }
        int [][] res = new int[this.dimy][mat2.dimx];

        for (int k = 0; k < this.dimy; k++) {
            for (int j = 0; j < mat2.dimx; j++) {
                for (int i = 0; i < this.dimx; i++){
                    res[k][j] += this.elements[k][i] * mat2.elements[i][j];
                }
            }
        }

        //Construir matriu passant aquest array
        return new Matrix(res);
    }
}

public class Arrays1 {
    public static void main(String[] args) {
        int[] a1 = {5,4,3,2,1};
        System.out.println(Arrays.toString(a1));
        Ar(a1);
        System.out.println(Arrays.toString(a1));
        int []array = {0,8,7,4,1};
        System.out.print(Arrays.toString(array));
        System.out.println();
        boolean[][] ar = {{true,true,false,true},{false,false,false,false},{true,false,true,false}};
        dibuixaQuadre(ar);
/*        Matrix m = new Matrix(new int[][]{{1,2,3},{4,5,6},{7,8,9},{0,1,2}});
        Matrix m2 = new Matrix(new int[][]{{1,2,3},{4,5,6},{7,8,9},{0,1,2}});*/
        Matrix m = new Matrix(new int[][]{{1,2},{4,5}});
        Matrix m2 = new Matrix(new int[][]{{7,8,},{1,2}});
        Matrix resultat = m.multiplica(m2);
        resultat.imprimeix();
        m.imprimeix();
        m.transposa();
        System.out.println();
        m.imprimeix();
        }

    public static void Ar(int[] ar) {
        int l = ar.length;
        for (int i = 0; i<l/2;i++){
            int t = ar[i];
            ar[i] = ar[l-i-1];
            ar[l-i-1] = t;
        }
    }

    static void dibuixaQuadre(boolean[][] ar) {
        int dimx = ar[0].length;
        int dimy = ar.length;

        for (int i = 0; i < dimy; i++) {
            for (int j = 0; j < dimx; j++) {
                if (ar[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
         }
    }
}
