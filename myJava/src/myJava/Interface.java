package myJava;

interface Animal { public abstract void cry(); }

class Cat implements Animal {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog implements Animal {
    public void cry() {
        System.out.println("멍멍!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
 
        c.cry();
        d.cry();
    }
}
