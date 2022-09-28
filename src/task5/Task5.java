
import java.util.Random;

public class task5 {
    static int getIntFromRange(int min, int max) {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args){
        int[][] mat = new int[5][];
        mat[0] = new int[5];
        mat[1] = new int[4];
        mat[2] = new int[3];
        mat[3] = new int[4];
        mat[4] = new int[5];
        for (int[] matrixlenght : mat) {
            for (int j = 0; j < matrixlenght.length; j++) {
                matrixlenght[j] = getIntFromRange(50, 100);
                System.out.printf("%5d", matrixlenght[j]);
            }
            System.out.println();
        }
    System.out.println("---------------------");
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                for (int[] mat2 : mat) {
                    for (int m = 0; m < mat2.length; m++) {
//                        if (mat1[j] < mat2[m]) {
//                            mat1[j] = mat1[j] + mat2[m];
//                            mat2[m] = mat1[j] - mat2[m];
//                            mat1[j] = mat1[j] - mat2[m];
//                        } 
                        if (mat1[j] > mat2[m]) {
                            mat1[j] = mat2[m];
                            
                            
                        } 
                    }
                }
            }
        }
        for (int[] matrixlenght : mat) {
            for (int j = 0; j < matrixlenght.length; j++) {
                System.out.printf("%5d", matrixlenght[j]);   
            }
            System.out.println();    
        }
    }
}
