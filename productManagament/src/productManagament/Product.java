package productManagament;

import java.io.Serializable;

public class Product implements Serializable {
    int productCode;
    String productName;
    String producer;


    public Product() {

    }


    public Product(int productCode, String productName, String producer) {
        this.productCode = productCode;
        this.productName = productName;
        this.producer = producer;

    }



    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    @Override
    public String toString() {
        return "Ma:" + getProductCode()+" ten: "+ getProductName()+
                " hang sx: "+getProducer();
    }
}
