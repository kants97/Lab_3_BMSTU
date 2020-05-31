package com.company;
import static java.lang.Math.sqrt;

public class kvadrat {

    private double a;
    private double b;
    private double c;
    private double D;

    public kvadrat (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public kvadrat (double b, double c) {
        this.a = 1;
        this.b = b;
        this.c = c;
    }

    public double discr () {
        D = b*b-4*a*c;
        return D;
    }

    public double[] getx () {
        double D = discr();
        double[] x;
        if (D>0) {
            x = new double[2];
            x[0] = (-b+sqrt(D))/(2*a);
            x[1] = (-b-sqrt(D))/(2*a);
            return x;
        }
        else {
            if (D == 0) {
                x = new double[1];
                x[0] = -b / (2 * a);
                return x;
            }
            else {
                x = new double[0];
            }
        }
        return x;
    }

    public double extrem () {
        return -b/(2*a);
    }

    public double[] incr () {
        double[] y = new double[2];
        if (a>0) {
            y[0] = extrem();
            y[1] = Double.POSITIVE_INFINITY;
        }
        else {
            y[0] = Double.NEGATIVE_INFINITY;
            y[1] = extrem();
        }
        return y;
    }

    public double[] dicr () {
        double[] y = new double[2];
        if (a>0) {
            y[0] = Double.NEGATIVE_INFINITY;
            y[1] = extrem();
        }
        else {
            y[0] = extrem();
            y[1] = Double.POSITIVE_INFINITY;
        }
        return y;
    }



}
