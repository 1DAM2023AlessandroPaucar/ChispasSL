public class InvoicePrinter {

    public void print(Invoice invoice){
        System.out.println("Factura: " + invoice.getCode() + " | Fecha: " + invoice.getDate());
        System.out.println("Cliente: " + invoice.getCustomer().getCode() + " | " + invoice.getCustomer().getCode() + "|" + invoice.getCustomer().getAdress());
        System.out.println("Linea de venta: " + invoice.getSalesLines().get(0).getCode() + " | " + invoice.getSalesLines().get(0).getName() + " | " + invoice.getSalesLines().get(0).getPrice() + " | " +
        invoice.getSalesLines().get(2).getCode() + invoice.getSalesLines().get(2).getName() + invoice.getSalesLines().get(2).getPrice());
        System.out.println("Total: " + invoice.getTaxBase() + " + " + invoice.getTotal());

    }
}
