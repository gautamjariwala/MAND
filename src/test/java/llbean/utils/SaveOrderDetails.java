package llbean.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gautam on 4/12/2017.
 */
public class SaveOrderDetails {

    public static void saveOrder(String orderDetails){
        try{PrintWriter pw = new PrintWriter(new FileWriter(new File("src/test/java/llbean/resources/orderdetails.txt"), true));
        pw.append(orderDetails + "\n");
        pw.close();

    }
    catch (IOException ioe){
        System.out.println("IOException: " + ioe.getMessage());
    }
}}
