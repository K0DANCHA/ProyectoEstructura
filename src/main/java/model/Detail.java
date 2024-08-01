package model;

public class Detail {
    private Long id;
    private String productCode;
    private String productName;
    private double unitValue;
    private int quantity;
    private String category;

    // Constructor
    public Detail(Long id, String productCode, String productName, double unitValue, int quantity, String category) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.unitValue = unitValue;
        this.quantity = quantity;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    @Override
//    public String toString() {
//        return "Detail{id=" + id + ", productCode='" + productCode + "', productName='" + productName + "', unitValue=" + unitValue + ", quantity=" + quantity + ", category='" + category + "'}";
//    }
}
