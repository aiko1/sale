package sale.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buyer {
    @Id private long id;
    private String account;
    private String productName;
    private long price;
    private int amount;

    public Buyer() {
    }

    public Buyer(long id, String account, String productName, long price, int amount) {
        this.id = id;
        this.account = account;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
