package main.java.com.github.movetojava.ExceptionTest;

import java.util.*;

import main.java.com.github.movetojava.Utils.Person;

public class Main13 {
    public static void main(String[] args) {
        Person[] test = null;
        //Person[] test = new Person[3];
        start(test);
    }

    static void start(Person[] people) {
//        if (people == null){
//            throw new NullPointerException("people 是空指针");
//        }
        Objects.requireNonNull(people);
        System.out.print(people);
        return;
    }

}
