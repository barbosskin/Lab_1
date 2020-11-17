
/**
 * Write a description of printArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.*;
import java.util.*;

public class printArray {
    public void testPrintArray(){
        int[] c = new int[12];
        int k = 3;
        //заполняет массив нечётными от 3 до 25
        for (int i = 0; i<12; i++){
            c[i] = k;
            k += 2;
        }
        double[] x = new double[15];
        Random random = new Random();
        for (int i = 0; i<15; i++){
            x[i] = -6.0 + (random.nextDouble()*(8.0-(-6.0)));
            System.out.printf("x[%d] = " + x[i] + "\n", i);
        }
        int[] tempArr = {5,9,11,13,17,23};
        int j = 0;
        int i = 0;
        boolean tempBool = false; 
        double[][] arrResult = new double[12][15];
        for(i = 0; i<12; i++){
            for(j = 0; j<15; j++){
                tempBool = false;
                //определяет выполнение второго условия в цикле заполнения в=двумерного массива
                for (int p=0; p<6; p++){
                    if(c[i] == tempArr[p]){
                        tempBool = true;
                        break;
                    }
                }
                
                if(c[i]==19){
                    arrResult[i][j]=Math.pow(
                                        Math.atan(
                                            (x[j]+1.0) / (14.0*5.0)
                                        ), 0.25/(
                                               Math.asin(
                                                   Math.pow(
                                                       Math.E, Math.abs(x[j])*(-1.0)
                                                   )
                                               )-1.0
                                           )
                                      );
                    System.out.printf("1)c[i]=%d; x[j]=%.2f; arr[%d][%d] = %.4f\n", c[i], x[j], i, j, arrResult[i][j]);
                } 
                
                else 
                if (tempBool){
                    arrResult[i][j]=Math.cos(
                                        Math.cos(
                                            Math.cbrt(
                                                x[j]
                                            )
                                        )
                                    );
                    System.out.printf("2)c[i]=%d; x[j]=%.2f; arr[%d][%d] = %.4f\n", c[i], x[j], i, j, arrResult[i][j]);
                        //System.out.println("Math.pow(x[j], 1/3) = " + Math.cbrt(x[j]));
                        //System.out.println("Math.cos(Math.pow(x[j], 1/3))" + Math.cos(Math.cbrt(x[j])));
                        //System.out.println("Math.cos(Math.cos(Math.pow(x[j], 1/3))) = " + Math.cos(Math.cos(Math.cbrt(x[j]))));
                }
                
                else {
                                            //(0.25-(root(3)( (x)^(x-3/4) ) )^(3+cos(root(3)(x) ) ) )^(arcsin(e^(root(3)(-(4/abs(x))^(x)))))
                    arrResult[i][j]=Math.pow(
                                        0.25-Math.pow(
                                                Math.cbrt(
                                                    Math.pow(
                                                        x[j], x[j]-(3.0/4.0)
                                                    )
                                                ), 3.0 + Math.cos(
                                                            Math.cbrt(
                                                                x[j]
                                                            )
                                                        )
                                             ), Math.asin(
                                                    Math.pow(
                                                        Math.E, Math.cbrt(
                                                                    -1.0 * Math.pow(
                                                                               (4.0/(Math.abs(x[j]))), x[j]
                                                                           )
                                                                )
                                                    )
                                                )
                                    );
                    System.out.printf("3)c[i]=%d; x[j]=%.2f; arr[%d][%d] = %.4f\n", c[i], x[j], i, j, arrResult[i][j]);
                    //System.out.printf("x[j] = %f; Math.pow(x[j], x[j]-(3.0/4.0) = %f\n", x[j], Math.pow(x[j], x[j]-(3.0/4.0)));
                }
                
            }
        }
    }
}

