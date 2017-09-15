package top.alearner.Number;

/**
 * Created by mzg on 2017/9/13.
 */
public class Number {
    //判断一个数是否是素数（质数）
    public static boolean isPrime(int N){
        if (N < 2)
            return false;
        for (int i = 2;i*i <= N;i++)
            if (N%i==0)
                return false;
        return true;
    }

    //计算平方根
    public static double sqrt(double c){
        if(c<0)
            return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t-c/t)>err*t)
            t = (c/t +t)/2.0;
        return t;
    }
}
