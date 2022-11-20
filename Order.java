import java.sql.Date;
import java.util.ArrayList;

public class Order {

    Date orderDate;

    ArrayList<OrderItem> itemList = new ArrayList<>();

    public void addItem(OrderItem orderItem) {

        itemList.add(orderItem);

    }

    public double getOrderSum() {
        double sum = 0;

        for (OrderItem item : itemList ) {
            sum = sum + item.getSum();

        }

        return sum;
    }
}
