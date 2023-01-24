public class Order {
    private String orderGame;
    private String orderStatus;
    private String customerName;
    private String customerId;
    private double gamePrice;
    

    public Order() {

    }


    public Order(String orderGame, String orderStatus, String customerName, String customerId, double gamePrice) {
        this.orderGame = orderGame;
        this.orderStatus = orderStatus;
        this.customerName = customerName;
        this.customerId = customerId;
        this.gamePrice = gamePrice;
    }


    public String getOrderGame() {
        return this.orderGame;
    }

    public void setOrderGame(String orderGame) {
        this.orderGame = orderGame;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getGamePrice() {
        return this.gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

}
