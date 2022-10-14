/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import emun.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import java.awt.ItemSelectable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author RAFAEL
 */
public class Program {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date moment = new Date();
        
        //DADOS DO CLIENTE
        System.out.println("Enter Client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        
        Client cl = new Client(name, email, date);
        
        //DADOS DO PEDIDO
        System.out.println("Enter Order data: ");
        System.out.print("Status : ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order ord = new Order(new Date(), status , cl);
        
        System.out.println("How many items to this order? ");
        int quantity = sc.nextInt();
            for(int i=0; i<quantity; i++){
            System.out.println("Enter " +  "# " + (i+1)  + " item data: ");
            System.out.print("Produc name : ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Produc price : ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity : ");
            int productQuantity = sc.nextInt();
            
           Product p = new Product(productName, productPrice );
           OrderItem oi1 = new OrderItem(productQuantity, productPrice, p);
            
           ord.addItem(oi1);
            
            
            
            
            
            }
            
            System.out.println();
            System.out.println(ord);
            
         
        
        
    }
}
