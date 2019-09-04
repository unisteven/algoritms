package me.unisteven.algo;

import me.unisteven.algo.algoritms.Recursion;
import me.unisteven.algo.algoritms.Simple;


public class Main{



    public static void main(String[] args){

        Recursion recursion = new Recursion();
        recursion.setup();
        recursion.factorialNonRecusive(5);
        System.out.println("total for 5 = " + recursion.factorialRecursive(5));
        System.out.println("sum for a total of 5 is " + recursion.sumNonRecusive(5));
        System.out.println("sum for a total of 5 recursive is " + recursion.sumRecusive(5));
        System.out.println(recursion.howManyOnesInTheBinairy(134));
        System.out.println("the reverse of Steven = " + recursion.reverseString("steven"));
//        Main main = new Main();
//        main.setup();
//        main.setVisible(true);
        Simple simple = new Simple();
//        simple.testTimes(100);
    }

}
