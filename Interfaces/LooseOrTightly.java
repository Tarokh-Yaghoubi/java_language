package Interfaces;

public class LooseOrTightly {

    public static void main(String[] args) {

    }

}

// tightly coupled code: classes and objects are tightly couples to eachother
// for example -> Class A creates and uses Class B directly, If B changed, we need to modify B as well.

interface CanEngine {
    // there is no need for public here, it is redundant in interfaces
    void start();
}

class Engine {
    public void start() {
        System.out.println("Engine started -> ");
    }
}

// now ElectricEngine can define start() in its own way
class ElectricCar implements CanEngine {
    @Override
    public void start() {
        System.out.println("Running Electric Engine -> ");
    }
}

class Car {

    // Here if you want to use another Engine implementation, you must modify Car.

    Engine engine = new Engine();   // tightly coupled
    void startCar() {
        engine.start();
    }
}

class AnotherCar {
    private CanEngine engine;

    // Dependency Injection (Constructor Injection)
    AnotherCar(CanEngine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}


