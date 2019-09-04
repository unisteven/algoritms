package me.unisteven.algo.algoritms;

import me.unisteven.algo.Main;

import javax.swing.*;
import java.awt.*;

public class Recursion extends JFrame {

    private final static int WIDTH = 500;
    private final static int HEIGHT = 500;


    public void setup(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g){

    }

    public void hTree(Graphics g){

    }

    // 7.1
    // non recusive function
    public void factorialNonRecusive(int n){
        int total = n;
        for(int i = n - 1; i > 0; i--){
            total = total * i;
        }
        System.out.println("total for n = " + n + " is " + total);
    }

    // 7.1 recursive
    public int factorialRecursive(int n){
        if(n == 1){
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // 7.2 non recusive sum
    public int sumNonRecusive(int n){
        int total = n;
        for(int i = n - 1; i > 0; i--){
            total += i;
        }
        return total;
    }

    // 7.2 recusive sum
    public int sumRecusive(int n){
        if(n == 1){
            return 1;
        }
        return n + sumRecusive(n - 1);
    }

    // 7.23
    public int howManyOnesInTheBinairy(int n){
        if(n < 2){
            return n;
        }
        int ones = 0;
        if(n % 2 != 0){
            // it is odd
            ones++;
        }
        ones += howManyOnesInTheBinairy(n / 2);
        return ones;
    }

    public String reverseString(String input){
        int length = input.length();
        System.out.println(input);
        if(length == 0){
            return "";
        }
        return reverseString(input.substring(0, length - 1));
    }

}
