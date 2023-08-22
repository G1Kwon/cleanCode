package oop.polymorphism;

class Bird {
    public void fly() {
        System.out.println("flying...");
    }
}

class Pigeon extends Bird {
    @Override
    public void fly() {
        System.out.println("피죤 날기");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("짹짹날기");
    }
}
public class Main {
    static void SkyStage(Bird p) {
        p.fly();
    }
    public static void main(String[] args) {
        SkyStage(new Pigeon());
    }
}