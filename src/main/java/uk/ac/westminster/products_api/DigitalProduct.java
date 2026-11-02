package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;


    public DigitalProduct() {

    }

    public DigitalProduct(Long id, String name, double price, String downloadURL, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl = downloadURL;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice = price;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

}