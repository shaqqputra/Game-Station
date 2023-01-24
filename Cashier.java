public class Cashier extends Employee{
    private String cashierName;
    private String cashierId;
    private String paymentMethod;
    private double gamePrice;
    private String gameName;


    public Cashier() {

    }


    public Cashier(String cashierName, String cashierId, String paymentMethod, double gamePrice, String gameName) {
        this.cashierName = cashierName;
        this.cashierId = cashierId;
        this.paymentMethod = paymentMethod;
        this.gamePrice = gamePrice;
        this.gameName = gameName;
    }


    public String getCashierName() {
        return this.cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierId() {
        return this.cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getGamePrice() {
        return this.gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    // show
    

    
}