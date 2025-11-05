package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class OrderAppClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Orders> orders = new ArrayList<Orders>();

        while (true) {

            System.out.println("Order Management System\n");
            System.out.println("1) Add Order\n");
            System.out.println("2) Update Order\n");
            System.out.println("3) List Orders\n");
            System.out.println("4) Exit\n\n");

            System.out.println("Please Select Operation:\n");

            int operation = sc.nextInt();
            sc.nextLine();

            boolean active = true;

            switch(operation){
                case 1:

                    System.out.println("---Adding an Order---\n");
                    System.out.println("What is the OrderID:\n");
                    String orderId = sc.nextLine();



                    System.out.println("Customer name:\n");
                    String customerName = sc.nextLine();

                    System.out.println("Product name:\n");
                    String productName = sc.nextLine();

                    System.out.println("Price:\n");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Quantity:\n");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Total Price:\n");
                    double totalPrice = sc.nextDouble();
                    sc.nextLine();

                    Orders newOrder = new Orders(orderId, customerName, productName, price, quantity, totalPrice);
                    orders.add(newOrder);


                    break;
                case 2:

                    System.out.println("Please enter orderID:\n");
                    String orderID = sc.nextLine();

                    for (Orders n: orders) {
                        if(n.getOrderId().contains(orderID)){

                            System.out.println("Customer name:\n");
                            n.setCustomerName(sc.nextLine());

                            System.out.println("Product name:\n");
                            n.setProductName(sc.nextLine());

                            System.out.println("Price:\n");
                            price = sc.nextDouble();
                            sc.nextLine();
                            n.setPrice(price);


                            System.out.println("Quantity:\n");
                            quantity = sc.nextInt();
                            sc.nextLine();
                            n.setQuantity(quantity);

                            System.out.println("Total Price:\n");
                            totalPrice = quantity*price;
                            n.setTotalPrice(totalPrice);




                        }
                    }


                    break;
                case 3:
                    for (Orders n: orders) {
                        n.toString();
                        System.out.println("Order{" +
                                "orderId='" + n.orderId + '\'' +
                                ", customerName='" + n.customerName + '\'' +
                                ", productName='" + n.productName + '\'' +
                                ", price=" + n.price +
                                ", quantity=" + n.quantity +
                                ", totalPrice=" + n.totalPrice +
                                '}');
                    }
                    break;
                case 4:
                    active = false;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }


            if(!active){
                break;
            }




        }
    }
}