/* Ryan M. King
* CS 1110
* HW4
* Description: Creates the LinearEquation class that solves for the values x and y. Each attribute has get method.
* Program contains an isSolvable method and methods that solve for x and y.
*/
package edu.ucmo.king;

// Creates LinearEquation class
public class LinearEquation {

    // Variables or attributes/properties
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // builds the constructor that allows data for six attributes
    LinearEquation(double A, double B, double C, double D, double E, double F){
        a = A;
        b = B;
        c = C;
        d = D;
        e = E;
        f = F;
    }

    public double getA(){ return a; } // methods that gets a

    public double getB(){ return b; } // method that gets b

    public double getC(){ return c; } // method that gets c

    public double getD(){ return d; }  // method that gets d

    public double getE(){ return e; } // method that gets e

    public double getF(){ return f; } // method that gets f

    // solves the equation for x
    public double getX(){
        double x; // stores the results

        x = (e * d - b * f) / (a * d - b * c); // linear formula for x

        return x;
    }

    // solves the equation for y
    public double getY(){
        double y; // stores data for results

        y = (a * f - e * c) / (a * d - b * c); // linear formula for y

        return y;
    }

    // determines if entries are solvable
    public boolean isSolvable(){
        if((a * d - b * c) == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
