package srp.good;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Order order = new Order();
        OrderHistory history = new OrderHistory();
        OrderViewer viewer = new OrderViewer();

        order.addItem(item);        
        history.getDailyHistory();
        viewer.printOrder(order);
    }
}
