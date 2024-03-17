package solid.principle;

public class DependencyInversionDemo {
    // A class should be dependent on INTERFACE rather than a CLASS
}
class Laptop {
    private final Mouse mouse ;
    private final Keyboard keyboard ;
    // Here in constructor, interface reference is passed
    public Laptop(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}