import java.util.ArrayList;

public class Invoice {
    private String code;
    private String date;
    private String taxBase; // Base imponible: total de productos y servicios sin IVA
    private String total; //
    private Customer customer;
    private ArrayList<SalesLine>salesLines;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<SalesLine> getSalesLines() {
        return salesLines;
    }

    public void setSalesLines(ArrayList<SalesLine> salesLines) {
        this.salesLines = salesLines;
    }
}
