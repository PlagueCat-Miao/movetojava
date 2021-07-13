package main.java.com.github.movetojava.InterfaceTest;

public interface MyInterface extends OtherInterface {
    public static void Staticfunc() {
        System.out.println("MyInterface 静态");
    }

    interface MemberInterface {
        void funcB();
    }
}


