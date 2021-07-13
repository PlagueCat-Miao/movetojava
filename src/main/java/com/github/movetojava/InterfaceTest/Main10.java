package main.java.com.github.movetojava.InterfaceTest;

public class Main10 {
    public static void main(String[] args) {
        MyClass my = new MyInterfaceImpl();
        MyInterfaceImpl impl = new MyInterfaceImpl();
        MyInterface myInter =  impl;

        impl.funcA();
        //System.out.println();
    }


}


class MyClass  {
    public static void Staticfunc() {
        System.out.println("“MyClass 静态”");
        return;
    }

//    public void funcA() {
//        System.out.println("MyClass funcA");
//        return;
//    }


}

class MyInterfaceImpl extends MyClass implements MyInterface  {
    public static void Staticfunc() {
        System.out.println("“MyInterfaceImpl 静态”");
        return;
    }

    @Override
    public void funcA() {
        System.out.println("“MyInterfaceImpl func”");
        return;
    }



}