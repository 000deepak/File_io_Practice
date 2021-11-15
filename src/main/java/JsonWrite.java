import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JsonWrite {

    public static void main(String[] args) {

        jsonJacksonWrite();
        jsonGsonWrite();
    }

    static void jsonGsonWrite() {
        try {
            // create a writer
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("D:\\Desk\\FileHandling\\addressBook.json"));

            // create a map for customer properties
            Map<String, Object> customer = new HashMap<>();
            customer.put("id", 1);
            customer.put("name", "John Doe");
            customer.put("email", "john.doe@example.com");
            customer.put("age", 32);

            // create address
            Map<String, Object> address = new HashMap<>();
            address.put("street", "155 Middleville Road");
            address.put("city", "New York");
            address.put("state", "New York");
            address.put("zipCode", 10045);

            // add address to customer
            customer.put("address", address);

            // create payment methods
            customer.put("paymentMethods", Arrays.asList("PayPal", "Stripe"));

            // create 1st project
            Map<String, Object> p1 = new HashMap<>();
            p1.put("title", "Business Website");
            p1.put("budget", 4500);

            // create 2nd project
            Map<String, Object> p2 = new HashMap<>();
            p2.put("title", "Sales Dashboard");
            p2.put("budget", 8500);

            // add projects to customer
            customer.put("projects", Arrays.asList(p1, p2));

            // create Gson instance
            Gson gson = new Gson();

            // write JSON to file
            writer.write(gson.toJson(customer));

            //close the writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    static void jsonJacksonWrite() {
        try {
            // create a writer
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("D:\\Desk\\FileHandling\\addressBook.json"));

            // create a map for customer properties
            Map<String, Object> customer = new HashMap<>();
            customer.put("id", 1);
            customer.put("name", "John Doe");
            customer.put("email", "john.doe@example.com");
            customer.put("age", 32);

            // create address
            Map<String, Object> address = new HashMap<>();
            address.put("street", "155 Middleville Road");
            address.put("city", "New York");
            address.put("state", "New York");
            address.put("zipCode", 10045);

            // add address to customer
            customer.put("address", address);

            // create payment methods
            customer.put("paymentMethods", Arrays.asList("PayPal", "Stripe"));

            // create 1st project
            Map<String, Object> p1 = new HashMap<>();
            p1.put("title", "Business Website");
            p1.put("budget", 4500);

            // create 2nd project
            Map<String, Object> p2 = new HashMap<>();
            p2.put("title", "Sales Dashboard");
            p2.put("budget", 8500);

            // add projects to customer
            customer.put("projects", Arrays.asList(p1, p2));

            // create Gson instance
            Gson gson = new Gson();

            // write JSON to file
            writer.write(gson.toJson(customer));

            //close the writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
