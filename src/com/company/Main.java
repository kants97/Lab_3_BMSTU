package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        kvadrat [] k;
        k = new kvadrat[5];
        k[0] = new kvadrat(2, 3, 1);
        k[1] = new kvadrat(2, 4, -7);
        k[2] = new kvadrat(1, 6, 9);
        k[3] = new kvadrat(10, 5, 8);
        k[4] = new kvadrat(4, 5);

        for (int i=0; i<5; i++) {
            System.out.println(i);
            System.out.print("D=");
            System.out.println(k[i].discr());
            System.out.print("X=");
            System.out.println(Arrays.toString(k[i].getx()));
            System.out.print("INCR: ");
            System.out.println(Arrays.toString(k[i].incr()));
            System.out.print("DICR: ");
            System.out.println(Arrays.toString(k[i].dicr()));
            System.out.print("EXTREM: ");
            System.out.println(k[i].extrem());
            System.out.println();
        }

    }
}
