package sale.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
    @Id
    private long id;
    private String productName;
    private long price;
    private int amount;

    public Seller() {
    }

    public Seller(long id, String productName, long price, int amount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
