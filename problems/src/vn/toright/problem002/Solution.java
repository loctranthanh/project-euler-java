package vn.toright.problem002;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Project Euler #2: Even Fibonacci numbers
* */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            long curFibo = 2;
            long preFibo = 1;
            while (curFibo <= n) {
                if (curFibo % 2 == 0) {
                    sum += curFibo;
                }
                long temp = curFibo;
                curFibo += preFibo;
                preFibo = temp;
            }
            System.out.println(sum);
        }
    }
}
