package FileIO;

import java.io.*;
import java.util.ArrayList;

public class TextWriter {

    public static void main(String[] args) {
        ArrayList<Contacts> record = new ArrayList<>();

        Contacts contact = new Contacts("di","k");
        record.add(contact);

        writeData(record);

        for (Contacts c : readData()){
            record.add(c);
            System.out.println(record);
        }
    }

    public static void writeData(ArrayList<Contacts> record) {
        File file = new File("D:\\Desk\\FileHandling\\add2.txt");
        BufferedWriter bf = null;
        try {
            //create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));

            //iterate map entries
            for (Contacts c : record) {
                //put key and value separated by a colon
                bf.write(String.valueOf(c));

                //new line
                bf.newLine();
            }
            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  public List<Contacts> readData() {
    public static ArrayList<Contacts> readData() {

        ArrayList<Contacts> record=new ArrayList<Contacts>();
        BufferedReader br = null;
        try {
            //create file object
            File file = new File("D:\\Desk\\FileHandling\\add2.txt");

            //create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));

            String line = null;
            String line2 = "";
            //read file line by line
            while ((line = br.readLine()) != null) {

                //split the line by :
                String[] parts = line.split(":");

                Contacts contact = new Contacts(parts[0].trim(),parts[1].trim());
                record.add(contact);
               return  record;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        }
        return null;
    }
}
