package vn.toright;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            n -= 1;
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            long div_3 = (long) Math.floor((double)n / 3);
            div_3 = 3 * div_3 * (div_3 + 1) / 2;
            long div_5 = (long) Math.floor((double)n / 5);
            div_5 = 5 * div_5 * (div_5 + 1) / 2;
            long div_15 = (long) Math.floor((double)n / 15);
            div_15 = 15 * div_15 * (div_15 + 1) / 2;
            System.out.println(div_3 + div_5 - div_15);
        }
    }
}
