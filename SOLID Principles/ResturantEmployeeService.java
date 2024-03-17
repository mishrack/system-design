package solid.principle;

public interface ResturantEmployeeService {
    void takeOrder();
    void cookFood();
    void cleanUtensils();
}

// Now creating segregated interface for each employee type of restaurant
interface WaiterInterface{
    void takeOrder();
    void verveFood();
}
interface ChefInterface{
    void decideMenu();
    void cookFood();
}
