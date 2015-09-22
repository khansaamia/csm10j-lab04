package lab04;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;



public class Lab04 {

 
    public static void main(String[] args) throws FileNotFoundException  {
        
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        
        double v,w,x,y,z;
        
      
        v= inFile.nextDouble();
        w= inFile.nextDouble();
        x= inFile.nextDouble();
        y= inFile.nextDouble();
        z= inFile.nextDouble();
        
        double Mean;
        double Deviation;
        
        Mean = computeMean(v,w,x,y,z);
        Deviation = computeStandardDeviation(v,w,x,y,z);
        
        System.out.println("Mean of the 5 values is " + Mean);
        System.out.println("Standard deviation of the 5 values is " +Deviation);
        
      
    }
    
    public static double computeMean(double a, double b, double c, double d, double e)
    {
        double average;
        average = (a+b+c+d+e)/5;
        return(average);
    }
    
    public static double computeStandardDeviation(double a, double b, double c, double d, double e)
    {
        double avg = (a+b+c+d+e)/5;
        double v,w,x,y,z,sd;
        
        v = Math.pow(2.0, (a - avg));
        w = Math.pow(2.0, (b - avg));
        x = Math.pow(2.0, (c - avg));
        y = Math.pow(2.0, (d - avg));
        z = Math.pow(2.0, (e - avg));
        sd = Math.sqrt((v+w+x+y+z)/5);
        return(sd);
    }
    
}
