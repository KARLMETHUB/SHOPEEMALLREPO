class Product {

    int ProductID;
    String ProductName;
    String Description

    Product() {}

    public Product(int productID, String productName, String description) {
        ProductID = productID;
        ProductName = productName;
        Description = description;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
