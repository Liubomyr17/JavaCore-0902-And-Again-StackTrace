package com.company;

/*

0902 And Again StackTrace
Write five methods that call each other.
Each method should return the name of the method that called it, obtained using StackTrace.

Requirements:
1. There should be 5 methods in the class (do not take into account the main method).
2. Each method should call the following: main call method1, method1 call method2, etc.
3. Each method must return the name of the method that called it.
4. To get the name of the caller, use the getMethodName method.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        method1();
    }
    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
