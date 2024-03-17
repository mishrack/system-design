package solid.principle;

public class LiskovSubsPrinciple {
    /**
     * If a class B is a subclass of class A, then we should be able to replace object of A with object of B
     * Without changing the behaviour of the program
     */
}
class MotorCycle implements Bike{
    boolean isEngineOn ;
    int speed ;
    @Override
    public void turnOnEngine() {
        // start the engine
        isEngineOn = true ;
    }

    @Override
    public void accelerate() {
        speed = speed + 10 ;
    }
}

class BiCycle implements Bike{
    // There is no engine in Bicycles, therefore we are changing the behaviour of the program
    int speed ;
    @Override
    public void turnOnEngine() {
        // there is no engine , so it does not follow Liskov Subs principle
    }

    @Override
    public void accelerate() {
        speed = speed + 10 ;
    }
}