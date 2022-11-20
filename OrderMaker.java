import java.util.Scanner;

public class OrderMaker {

    public static void main(String[] args)
             {

 Order order;
 order = new Order();

 // first input
                 Scanner Maker = new Scanner(System.in);
                 System.out.println("Add the name of the first item:");

                 String name = Maker.nextLine();
               //  System.out.println(name);


                 Scanner Maker1 = new Scanner(System.in);
                 System.out.println("Add item amount");

                 int amount = Maker1.nextInt();
               //  System.out.println(amount);


                 Scanner Maker2 = new Scanner(System.in);
                 System.out.println("Add price:");

                 double price = Maker2.nextDouble();
                // System.out.println(price);

ItemProduct product;
product = new ItemProduct(name, amount, price);

order.addItem(product);

// second input
                 Scanner Maker3 = new Scanner(System.in);
                 System.out.println("Add the name of the second item:");

                 String name1 = Maker3.nextLine();
                 //  System.out.println(name1);


                 Scanner Maker4 = new Scanner(System.in);
                 System.out.println("Add item amount");

                 int amount1 = Maker4.nextInt();
                 //  System.out.println(amount1);


                 Scanner Maker5 = new Scanner(System.in);
                 System.out.println("Add price:");

                 double price1 = Maker5.nextDouble();
                 // System.out.println(price1);

  order.addItem(product);

// third input

                 ///

                 Scanner Maker6 = new Scanner(System.in);
                 System.out.println("Add the name of the second item:");

                 String name2 = Maker6.nextLine();
                 //  System.out.println(name2);


                 Scanner Maker7 = new Scanner(System.in);
                 System.out.println("Add item amount");

                 int amount2 = Maker7.nextInt();
                 //  System.out.println(amount2);


                 Scanner Maker8 = new Scanner(System.in);
                 System.out.println("Add price:");

                 double price2 = Maker8.nextDouble();
                 // System.out.println(price2);

order.addItem(product);



System.out.println("The sum of your order is: " + order.getOrderSum());




    }












}
