package task16.lab;

public interface OrdersManager  {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrder();
    int ordersCostSummary();
    int ordersQuantity();

}
