import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Inicializar el arraylist

        ArrayList<SalesLine> productos = new ArrayList<>();
        ArrayList<SalesLine> servicios = new ArrayList<>();

        //Autonomo 1

        Freelancer autonomo1 = new Freelancer();

        System.out.println("Introduce los datos de un autónomo");

        System.out.println("Introduce el codigo:");
        String code = read.nextLine();
        autonomo1.setCode(code);

        System.out.println("Introduce el nombre:");
        autonomo1.setName(read.nextLine());

        System.out.println("Introduce el apellido:");
        autonomo1.setSurname(read.nextLine());

        System.out.println("Introduce la dirección");
        autonomo1.setAdress(read.nextLine());

        System.out.println("Introduce la provincia:");
        autonomo1.setProvince(read.nextLine());

        System.out.println("Introduce el email");
        autonomo1.setEmail(read.nextLine());

        System.out.println("Introduce el telefono:");
        autonomo1.setPhone(read.nextLine());

        System.out.println("Se han guardado los datos del autónomo 1");

        //Sociedad 1

        Company sociedad1 = new Company();

        System.out.println("Introduce los datos de una sociedad");

        System.out.println("Introduce el codigo:");
        sociedad1.setCode(read.nextLine());

        System.out.println("Introduce la Razón Social:");
        sociedad1.setName(read.nextLine());

        System.out.println("Introduce la dirección");
        sociedad1.setAdress(read.nextLine());

        System.out.println("Introduce la provincia:");
        sociedad1.setProvince(read.nextLine());

        System.out.println("Introduce el email");
        sociedad1.setEmail(read.nextLine());

        System.out.println("Introduce el telefono:");
        sociedad1.setPhone(read.nextLine());

        System.out.println("Introduce el seguro:");
        sociedad1.setInsurance(read.nextLine());

        System.out.println("Se han guardado los datos de la sociedad 1");

        //Producto 1

        System.out.println("Introduce los datos de un producto");

        System.out.println("Introduce el codigo:");
        String codigo = read.nextLine();

        System.out.println("Introduce el nombre");
        String nombre = read.nextLine();

        System.out.println("Introduce la marca");
        String marca = read.nextLine();

        System.out.println("Introduce el modelo");
        String modelo = read.nextLine();

        System.out.println("Introduce el precio");
        String precio = read.nextLine();

        System.out.println("Introduce el iva:");
        String iva = read.nextLine();

        SalesLine producto1 = new SalesLine(codigo, nombre, marca, modelo, precio, iva);
        productos.add(producto1);

        System.out.println("Se han guardado los datos deL producto 1");

        //Producto 2

        System.out.println("Introduce los datos de otro producto");

        System.out.println("Introduce el codigo:");
        codigo = read.nextLine();

        System.out.println("Introduce el nombre");
        nombre = read.nextLine();

        System.out.println("Introduce la marca");
        marca = read.nextLine();

        System.out.println("Introduce el modelo");
        modelo = read.nextLine();

        System.out.println("Introduce el precio");
        precio = read.nextLine();

        System.out.println("Introduce el iva:");
        iva = read.nextLine();

        SalesLine producto2 = new SalesLine(codigo, nombre, marca, modelo, precio, iva);
        productos.add(producto2);

        System.out.println("Se han guardado los datos deL producto 2");

        //Servicio 1

        System.out.println("Introduce los datos de un servicio");

        System.out.println("Introduce el codigo:");
        codigo = read.nextLine();

        System.out.println("Introduce el nombre");
        nombre = read.nextLine();

        System.out.println("Introduce el precio");
        precio = read.nextLine();

        System.out.println("Introduce el iva:");
        iva = read.nextLine();

        SalesLine servicio1 = new SalesLine(codigo, nombre, precio, iva);
        servicios.add(servicio1);

        System.out.println("Se han guardado los datos deL servicio 1");

        //Servicio 2

        System.out.println("Introduce los datos de otro servicio");

        System.out.println("Introduce el codigo:");
        codigo = read.nextLine();

        System.out.println("Introduce el nombre");
        nombre = read.nextLine();

        System.out.println("Introduce el precio");
        precio = read.nextLine();

        System.out.println("Introduce el tipo de IVA:");
        iva = read.nextLine();

        SalesLine servicio2 = new SalesLine(codigo, nombre, precio, iva);
        servicios.add(servicio2);

        System.out.println("Se han guardado los datos deL servicio 2");

        //Facturas

        // Factura 1: Autonomo

        Invoice factura1 = new Invoice();

        System.out.println("Introduce los datos de la primera factura");

        System.out.println("Introduce el codigo de la factura:");
        factura1.setCode(read.nextLine());

        System.out.println("Introduce la fecha de la factura");
        factura1.setDate(read.nextLine());

        System.out.println("Introduce la base imponible");
        factura1.setTaxBase(read.nextLine());

        System.out.println("Introduce el total:");
        factura1.setTotal(read.nextLine());

        factura1.setCustomer(autonomo1);
        factura1.setSalesLines(productos);

        System.out.println("Se han guardado los datos de la factura 1");

        // Factura 2: Sociedad

        Invoice factura2 = new Invoice();

        System.out.println("Introduce los datos de la segunda factura");

        System.out.println("Introduce el codigo de la factura:");
        factura2.setCode(read.nextLine());

        System.out.println("Introduce la fecha de la factura");
        factura2.setDate(read.nextLine());

        System.out.println("Introduce la base imponible");
        factura2.setTaxBase(read.nextLine());

        System.out.println("Introduce el total:");
        factura2.setTotal(read.nextLine());

        factura2.setCustomer(sociedad1);
        factura2.setSalesLines(servicios);

        System.out.println("Se han guardado los datos de la factura 2");

        InvoicePrinter impresora = new InvoicePrinter();

        impresora.print(factura1);

        System.out.println("");

        impresora.print(factura2);

    }
}