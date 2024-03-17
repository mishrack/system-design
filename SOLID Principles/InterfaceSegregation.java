package solid.principle;

public class InterfaceSegregation {
    /**
     * Interface need not be such that client need not implement the methods they do not need in the first place
     */
}
class Waiter implements ResturantEmployeeService{
    @Override
    public void takeOrder() {

    }
    // Now below 2 method are never used by Waiter, therefore they should not be part of Waiter as Employee
    @Override
    public void cookFood() {

    }
    @Override
    public void cleanUtensils() {

    }
}
// Now we have separate classes for each employee type
// implementing separate interface
class Waiter2 implements WaiterInterface{
    @Override
    public void takeOrder() {

    }
    @Override
    public void verveFood() {

    }
}
class Chef implements ChefInterface{
    @Override
    public void decideMenu() {

    }
    @Override
    public void cookFood() {

    }
}