/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingobectsandmethods;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario.vega003
 */


class A{
    private String s;
    private int i;
    private double d;

    public A(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "A{" + "s=" + s + ", i=" + i + ", d=" + d + '}';
    }

    public int getI() {
        return i;
    }
    
}


public class CreatingObectsAndMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = true;
        ArrayList<A> list = new ArrayList<A>();
        
//        A a = new A("xyz",2,2.2);
//        System.out.println(a);
        // Allowa user to keep adding A's Add them to
        // an Arraylist. Print out only A's that have an
        // int over 5.
        // Practicing with a loop, Scanner, Arraylist, print statements
        
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Enter a String: ");
            String s = scan.next();
            System.out.println();
            System.out.print("Enter an intger: ");
            int i = scan.nextInt();
            System.out.println();
            System.out.print("Enter a decimal: ");
            double d = scan.nextDouble();
            System.out.println();
            
            list.add( new A(s,i,d) );
            
            System.out.println("Would you like to continue making A's?");
            System.out.println("Enter 1 for yes or 2 for no.");
            int answer = scan.nextInt();
            
            if(answer == 2){
                System.out.println("Thank you, goodbye... SUCKA!");
                flag = false;
            }
            
        }while(flag);
        
//        for(A b : list){
//            if(b.getI() > 5){
//                System.out.println(b);
//            }
//        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
	}
    }
    
}
