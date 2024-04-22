//package com.driver;
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        B b=new B();
//        System.out.println(b.meth());
//    }
//}
//class A
//{
//    public String meth()
//    {
//        return "Invoking method from class A";
//    }
//}
//class B extends A
//{
//    public String meth()
//    {
//        return "Method is overridden in Extendend class B";
//    }
//}
package com.driver; // Package declaration should match directory structure

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
}

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}
