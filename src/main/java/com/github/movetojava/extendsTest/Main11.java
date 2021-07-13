package main.java.com.github.movetojava.extendsTest;

public class Main11 {
    public static void main(String[] args) {
        S ss = new S(1, 2);
        ss.print();
        N n= new N(1,3);
        n.print();
    }
}

class S {
    public int a;
    private final int b;

    S(int a, int b) {
        this.b = b;
        this.a = a;
    }

    public void print() {
        System.out.println("a:" + a + " b:" + b);
    }
}

class N extends S  {
    N(int a, int b) {
        //子类需要初始化父类的内容
        super(a, b);
    }

    @Override
    public void print() {
        //错误 子类不可访问父类的变量
        //System.out.println("a:" + super.a + " b:" + super.b);
        //但是父类也可用this
        System.out.println("a:" + super.a);
        System.out.println("super:");
        super.print();
    }


}