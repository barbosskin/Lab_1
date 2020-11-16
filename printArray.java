
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
        final double e = 2.71828182846;
        int[] c = new int[12];
        int k = 3;
        for (int i = 0; i<=11; i++){
            c[i] = k;
            k += 2;
            //System.out.println(c[i]);
        }
        double[] x = new double[15];
        Random random = new Random();
        for (int i = 0; i<=14; i++){
            x[i] = -6.0 + (random.nextDouble()*(8.0-(-6.0)));
            System.out.println("x["+ i + "] = " + x[i]);
        }
        int[] tempArr = {5,9,11,13,17,23};
        boolean tempBool = false;
        double[][] arrResult = new double[12][15];
        for(int i = 0; i<=11; i++){
            for(int j = 0; j<=14; j++){
                tempBool = false;
                for (int p=0; p<=5; p++){
                    if(c[i] == tempArr[p]){
                        tempBool = true;
                        break;
                    }
                }
                if(c[i]==19){
                    arrResult[i][j] = Math.pow(Math.atan((x[j]+1)/(14*5)), (0.25)/(Math.asin(Math.pow(e, Math.abs(x[j])*(-1.0)))-1.0));
                    System.out.println("arr["+i+"]["+j+"] = " + arrResult[i][j]);
                } 
                else if (tempBool){
                    arrResult[i][j] = Math.cos(Math.cos(Math.pow(x[j],1/3)));
                    System.out.println("arr["+i+"]["+j+"] = " + arrResult[i][j]);
                }
                else {
                    arrResult[i][j] = Math.pow(0.25 - Math.pow(Math.pow(Math.pow(x[j], x[j]-3/4), 1/3), 3 + Math.cos(Math.pow(x[j],1/3))), Math.asin(Math.pow(e, Math.pow(-1.0 * Math.pow(4/(Math.abs(x[j])), x[j]), 1/3))));
                    System.out.println("arr["+i+"]["+j+"] = " + arrResult[i][j]);
                }
            }
        }
    }
}

