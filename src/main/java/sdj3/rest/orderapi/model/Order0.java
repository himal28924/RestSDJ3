package sdj3.rest.orderapi.model;

public class Order0 {
    private Long id;
    private String description;
    private double amount;
    private boolean isDelivered;

    public Order0() {
    }

    public Order0(Long id, String description, double amount, boolean isDelivered) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.isDelivered = isDelivered;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }
}
