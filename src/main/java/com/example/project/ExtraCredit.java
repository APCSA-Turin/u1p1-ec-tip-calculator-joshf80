package com.example.project;
import java.util.Scanner;


public class ExtraCredit {
    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        // Calculaing all variables printed
        double totalTip = (percent * cost) / 100; // dividing by 100 to account for percentage
        double totalBill = cost + totalTip;
        double pretipPer = cost / people;
        double tipPer = totalTip / people;
        double totalCostPer = totalBill / people;

        // Rounding method found here: https://stackoverflow.com/questions/8825209/rounding-decimal-points
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        totalBill = Math.round(totalBill * 100.0) / 100.0;
        pretipPer = Math.round(pretipPer * 100.0) / 100.0;
        tipPer = Math.round(tipPer * 100.0) / 100.0;
        totalCostPer = Math.round(totalCostPer * 100.0) / 100.0;

                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + totalTip + "\n");
        result.append("Total Bill with tip: " + "$" + totalBill + "\n");
        result.append("Per person cost before tip: " + "$" + pretipPer + "\n");
        result.append("Tip per person: " + "$" + tipPer + "\n");
        result.append("Total cost per person: " + "$" + totalCostPer + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people;
        int percent;
        double cost;
        String items; 
        items = "";

        Scanner scan = new Scanner(System.in);
        String item = "";
        while (!item.equals("-1\n")) {
            System.out.println("Enter an item name or enter '-1' to finish:");
            item = scan.nextLine();
            item = item + "\n";
            if (!item.equals("-1\n")) {
                items = items + item;
            }
        }

        people = 2;
        percent = 5;
        cost = 29.56;
    
        
        scan.close();
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
