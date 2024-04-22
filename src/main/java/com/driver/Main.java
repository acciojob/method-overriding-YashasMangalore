package com.driver;

public class Main {
    public static void main(String[] args)
    {
        B b = new B();
        b.meth();

        B b1=new B();
        b1.meth();
//        System.out.println(b.meth());
    }

    public static class A {
        // Make meth() public
        public String meth()
        {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        // Make meth() public
        @Override
        public String meth()
        {
            return "Method is overridden in Extended class B";
        }
    }
}