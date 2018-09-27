/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

/**
 *
 * @author YannErv
 */
import java.util.Scanner;
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in); 
  int quantity = 0;
  double retails = 99;
  double discountrate = 0.0, purchasecost = 0.0, totaldiscount = 0.0, totalcost = 0.0;
  // get the inputs
  System.out.print ("Enter the quantity purchased: ");
quantity = input.nextInt();
  if ((quantity >= 10) && (quantity < 20)) {
  discountrate = 0.8;
  System.out.println("the discount is 20%");
  }
  else if ((quantity >= 20) && (quantity < 50)) {
      discountrate = 0.7;
      System.out.println("the discount is 30%");
  }
  else if ((quantity >= 50) && (quantity < 100)) {
      discountrate = 0.6;
      System.out.println("the discount is 40%");
  }
  else if (quantity >= 100) {
        discountrate = 0.5;
        System.out.println("the discount is 50%");
    }
  // fint the discount
  purchasecost = quantity * 99;
  totaldiscount = purchasecost * discountrate;
    totalcost = purchasecost - totaldiscount;
    System.out.println("the total discount is: $ " + totaldiscount + " The purchase amount after the discount is: $" + totalcost);
 
    
    
    }
    
}
