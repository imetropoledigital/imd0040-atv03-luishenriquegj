package br.ufrn.imd;

import java.util.Scanner;

public class Person {
    public String name;
    public String hometown;
    Scanner scan = new Scanner(System.in);

    Person() {
        System.out.println("set this person name");
        this.name = scan.next();

        System.out.println("set this person hometown");
        this.hometown = scan.next();
    }

    public String hometown() {
        return this.hometown;
    }

    public String name(){
        return this.name;
    }
}
