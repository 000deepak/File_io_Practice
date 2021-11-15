/*
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.google.gson.JsonElement;

import java.io.Reader;
import java.nio.file.Files;

import java.nio.file.Paths;

public class JsonRead {
    public static void main(String[] args) {

        jsonJacksonRead();
        //JsonGsonRead();

    }

  */
/*  static void JsonGsonRead(){
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("D:\\Desk\\FileHandling\\addressBook.json"));

            //create JsonObject instance
            JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();

            // read customer details
            System.out.println(parser.get("id").getAsLong());
            System.out.println(parser.get("name").getAsString());
            System.out.println(parser.get("email").getAsString());
            System.out.println(parser.get("age").getAsLong());

            // read address
            JsonObject address = parser.get("address").getAsJsonObject();
            System.out.println(address.get("street").getAsString());
            System.out.println(address.get("city").getAsString());
            System.out.println(address.get("state").getAsString());
            System.out.println(address.get("zipCode").getAsLong());

            // read payment method
            for (JsonElement pm : parser.get("paymentMethods").getAsJsonArray()) {
                System.out.println(pm.getAsString());
            }

            // read projects
            for (JsonElement project : parser.get("projects").getAsJsonArray()) {
                JsonObject obj = project.getAsJsonObject();
                System.out.println(obj.get("title").getAsString());
                System.out.println(obj.get("budget").getAsLong());
            }

            //close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }*//*


    static void jsonJacksonRead(){
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("D:\\Desk\\FileHandling\\addressBook.json"));

            //create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            //read customer.json file into tree model
            JsonNode parser = objectMapper.readTree(reader);

            // read customer details
            System.out.println(parser.path("id").asLong());
            System.out.println(parser.path("name").asText());
            System.out.println(parser.path("email").asText());
            System.out.println(parser.path("age").asLong());

            // read address
            JsonNode address = parser.path("address");
            System.out.println(address.path("street").asText());
            System.out.println(address.path("city").asText());
            System.out.println(address.path("state").asText());
            System.out.println(address.path("zipCode").asLong());

            // read payment method
            for (JsonNode pm : parser.path("paymentMethods")) {
                System.out.println(pm.asText());
            }

            // read projects
            for (JsonNode project : parser.path("projects")) {
                System.out.println(project.path("title").asText());
                System.out.println(project.path("budget").asLong());
            }

            //close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
*/
