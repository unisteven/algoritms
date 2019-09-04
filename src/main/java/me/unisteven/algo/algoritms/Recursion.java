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
        this.hTree(400, 200, g);
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
        if(length == 0){
            return "";
        }
        return input.substring(length - 1) + reverseString(input.substring(0, length - 1));
    }

    public void hTree(int length, int height, Graphics g){
        if(height < 20){
            // end condition
            return;
        }
        int startPosX = (WIDTH - length) / 2;
        int startPosY = (HEIGHT - height) / 2;
        int endPosX = length + startPosX;
        int endPosY = height + startPosY;
        int ycenter = ((endPosY - startPosY) / 2) + startPosY;
        g.drawLine(startPosX, ycenter, endPosX, ycenter);
        g.drawLine(startPosX, startPosY, startPosX, endPosY);
        g.drawLine(endPosX, startPosY, endPosX, endPosY);
        this.hTree(length / 2 , height / 2 , g);
    }

}
