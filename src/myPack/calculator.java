
package  myPack;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class calculator {

    public static void main(String args[]) {

     Tiger tiger1 = new Tiger("moshe",35);
     
     System.out.println(tiger1.toSring());




    }


    public static class Tiger {


        String name;

        int age;

        public Tiger(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public String toSring() {

            return name + " , " + age;
        }
    }
}
