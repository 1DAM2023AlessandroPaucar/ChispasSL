import java.util.ArrayList;

public class Invoice {
    private String code;
    private String date;
    private String taxBase;
    private String total;
    private Freelancer freelancer;
    private Company company;
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

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<SalesLine> getSalesLines() {
        return salesLines;
    }

    public void setSalesLines(ArrayList<SalesLine> salesLines) {
        this.salesLines = salesLines;
    }
}
