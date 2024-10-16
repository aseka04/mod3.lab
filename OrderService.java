package labka;

public class OrderService {
    double TotalPrice(int quantity, double price){
        return quantity*price;
    }
    public void CreateOrder(String ProductName, int quantity, double price){
        System.out.println("Order for "+ ProductName+ "created. Total: "+TotalPrice(quantity, price));
    }
    public void UpdateOrder(String ProductName, int quantity, double price){
        System.out.println("Order for "+ ProductName+ "created. New total: "+TotalPrice(quantity, price));
    }
}
