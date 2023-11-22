public class InvoicePrinter {

    public void print(Invoice invoice){
        System.out.println("Factura: " + invoice.getCode() + " | Fecha: " + invoice.getDate());
        System.out.println("Cliente: " + invoice.getFreelancer().getCode() + " | " + invoice.getCompany().getCode());
        System.out.println("Linea de venta: " + invoice.getSalesLines().get(0).getCode() + " | " + invoice.getSalesLines().get(0).getName() + " | " + invoice.getSalesLines().get(0).getPrice());
        System.out.println("Total: " + invoice.getTaxBase());
    }
}
