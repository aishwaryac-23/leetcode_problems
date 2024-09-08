package leetcode;

import java.util.*;

public class RomanToInteger {
	 public static int romanToInt(String s) {
	        int result = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c == 'I') {
	                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
	                    result -= 1;
	                } else {
	                    result += 1;
	                }
	            } else if (c == 'V') {
	                result += 5;
	            } else if (c == 'X') {
	                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
	                    result -= 10;
	                } else {
	                    result += 10;
	                }
	            } else if (c == 'L') {
	                result += 50;
	            } else if (c == 'C') {
	                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
	                    result -= 100;
	                } else {
	                    result += 100;
	                }
	            } else if (c == 'D') {
	                result += 500;
	            } else if (c == 'M') {
	                result += 1000;
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner obj=new Scanner(System.in);
	        String s=obj.nextLine();
	        System.out.println(romanToInt(s));
	        
	    }

	}