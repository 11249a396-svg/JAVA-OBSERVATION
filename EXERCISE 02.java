EXERCISE 2.1

// File: MathUtil.java (the package member)
package com.scsvmv.util;
public class MathUtil {
public static int square(int n) { return n * n; }
public static int cube(int n) { return n * n * n; }
}


EXERCISE 2.2

// File: UseMath.java (uses the package)
import com.scsvmv.util.MathUtil;
public class UseMath {
public static void main(String[] args) {
System.out.println("Square of 7 = " + MathUtil.square(7));
System.out.println("Cube of 3 = " + MathUtil.cube(3));
}
}


