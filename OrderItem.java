public abstract class OrderItem {

    String itemName;
    int itemAmount;
    double itemPrice;

    public OrderItem(String itemName, int itemAmount, double itemPrice) {
        this.itemName = itemName;
        this.itemAmount = itemAmount;
        this.itemPrice = itemPrice;
    }

    public double getSum() {
        return itemPrice * itemAmount;
    }
}
