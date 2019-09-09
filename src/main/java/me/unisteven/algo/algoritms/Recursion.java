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
        this.hTree(10, 250, 250, false, g, 10);
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
        if(n == 0){
            return 0;
        }
        return n % 2 == 0 ? howManyOnesInTheBinairy(n / 2) : howManyOnesInTheBinairy(n / 2) + 1;
    }

    public String reverseString(String input){
        int length = input.length();
        if(length == 0){
            return "";
        }
        return input.substring(length - 1) + reverseString(input.substring(0, length - 1));
    }

    public void hTree(int length, int x, int y, boolean tilted, Graphics g, int count){
        if(count < 1){
            // end condition
            return;
        }
        int x1;
        int y1;
        int x2;
        int y2;
        if(tilted){
            x1 = x - length;
            x2 = x + length;
            y1 = y;
            y2 = y;
        }else{
            x1 = x;
            x2 = x;
            y1 = y - length;
            y2 = y + length;
        }
        g.drawLine(x1 + (WIDTH / 2), (HEIGHT /2 ) - y1, x2 + (WIDTH / 2), (HEIGHT / 2) - y2);
        this.hTree(length / 2, x1, y1, !tilted, g, count - 1);
        this.hTree(length / 2, x2, y2, !tilted, g, count - 1);
    }

    public void runAll() {
        this.setup();
        this.factorialNonRecusive(5);
        System.out.println("total for 5 = " + this.factorialRecursive(5));
        System.out.println("sum for a total of 5 is " + this.sumNonRecusive(5));
        System.out.println("sum for a total of 5 recursive is " + this.sumRecusive(5));
        System.out.println(this.howManyOnesInTheBinairy(7));
        System.out.println("the reverse of Steven = " + this.reverseString("steven"));
    }
}
