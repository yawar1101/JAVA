package CodeChef;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int test;
        test = sc.nextInt();
        while (test != 0) {
            int a, b, x, y;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if (a / x == b / y)
                System.out.println("Both");
            else if (a / x > b / y)
                System.out.println("Chefina");
            else
                System.out.println("Chef");

        }
        sc.close();
    }
}
