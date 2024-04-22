//// Main.java
package com.driver;
//
//public class Main {
//    public static void main(String[] args) {
//        B b = new B();
//        System.out.println(b.meth());
//    }
//}
//
//class A {
//    String meth() {
//        return "Invoking method from class A";
//    }
//}
//
//
//class B extends A {
//    String meth() {
//        return "Method is overridden in Extended class B";
//    }
//}
// Step 1: Create a class A with a method named 'meth' returning a string
class A
{
    String meth() {
        return "Invoking method from class A";
    }
}

// Step 2: Create a class B which extends class A
class B extends A {
    // Step 4: Override method 'meth' of class A in class B
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 3: Create an object of class B
        B obj = new B();

        // Step 5: Call the overridden method from the object of class B
        System.out.println(obj.meth());
    }
}
