package top.alearner.matrix;

/**
 * Created by mzg on 2017/9/13.
 */
public class SquareMatrix {
    //方阵的相乘
    //公式 : a[][]*b[][] = c[][];
    public static double[][] SquareMatrixMultiplication(double a[][], double b[][]){
        int N = a.length;
        double [][] c = new double[N][N];
        for (int i = 0; i<N ;i++){
            for (int j = 0; j<N ;j++){
                //计算行i和列j的点乘
                for (int k =0;k<N;k++)
                    c[i][j] += a[i][k]*b[k][j];
            }
        }
        return c;
    }
}
