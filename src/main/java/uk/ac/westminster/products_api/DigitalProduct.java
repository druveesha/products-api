package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;


    public DigitalProduct() {

    }

    public DigitalProduct(Long id, String name, double price, String downloadURL, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl = downloadURL;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

}
