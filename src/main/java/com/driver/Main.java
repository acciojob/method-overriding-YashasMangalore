// Main.java
package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());
    }
    static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }
    static class B extends A
    {
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}

