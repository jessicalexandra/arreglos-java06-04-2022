package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
            String prod= " ";
            double cant=0;
            String refe= " ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de productos a registrar");
        int cantproducts = Integer.parseInt(scanner.nextLine());
        product[] products = new product[cantproducts];
        for (int i=0;i< cantproducts;i++){
            System.out.println("ingrese el nombre del producto "+(i+1));
            prod=scanner.nextLine();
            System.out.println(" ingrese el precio del producto "+(i+1));
            cant=Double.parseDouble(scanner.nextLine());
            System.out.println("ingrese la referencia del producto "+(i+1));
            refe=scanner.nextLine();

            products[i]=new product();
            products[i].setName(prod);
            products[i].setPrice(cant);
            products[i].setReference(refe);

        }
        System.out.println("ingrese producto a buscar");
        String username=scanner.nextLine();
        for (int i=0;i<products.length;i++) {
            if (products[i].getName().equals(username)) {
                System.out.println(products[i].getPrice());
                break;

            }
            System.out.println(i);
        }

//        for (int i=0;i< cantproducts;i++)
//        {
//            System.out.println("Nombre " + products[i].getName());
//            System.out.println("Precio  "+products[i].getPrice());
//            System.out.println("referencia  "+products[i].getReference());

        }
//        product monitor = new product();
//        monitor.setName("monitor hp");
//        products[0] = monitor;
//        products[0].setPrice(20000);
//        product mouse = new product();
//        mouse.setName("mouse logitech");
//        products[1] = new product();
//        products[1] = mouse;


        /*System.out.println(" el precio del monitor es" + products[0].getPrice());
        System.out.println(" el tipo de mouse es " + products[1].getName());*/

    }


