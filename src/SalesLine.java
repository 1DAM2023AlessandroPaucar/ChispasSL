import java.util.ArrayList;

public class SalesLine extends ArrayList<SalesLine> {
    private String code;
    private String name;
    private String brand;
    private String model;
    private String price;
    private String vat;
    private Invoice invoice;

    public SalesLine(String code, String name, String price, String vat) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    public SalesLine(String code, String name, String brand, String model, String price, String vat) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.vat = vat;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
