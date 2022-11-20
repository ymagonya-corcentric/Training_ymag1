import java.util.Date;

public class ItemService extends OrderItem {

    Date startDate;
    Date endDate;


    public ItemService(String itemName, int itemAmount, double itemPrice, Date startDate, Date endDate) {
        super(itemName, itemAmount, itemPrice);
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
