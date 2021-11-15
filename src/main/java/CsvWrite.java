import com.opencsv.CSVWriter;

import java.io.*;

public class CsvWrite {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\Desk\\FileHandling\\addressBook.csv";

        csvWrite(filePath);
        csvWrite2(filePath);
    }

    static void csvWrite2(String filePath) throws IOException {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = {"Name", "Class", "Marks"};
            writer.writeNext(header);

            // add data to csv
            String[] data1 = {"Aman", "10", "620"};
            writer.writeNext(data1);
            String[] data2 = {"Suraj", "10", "630"};
            writer.writeNext(data2);

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void csvWrite(String filePath) throws IOException {
        CSVWriter cw = new CSVWriter(new FileWriter(filePath));
        String line1[] = {"Id", "Name", "Country"};
        String line2[] = {"1", "Sohan", "India"};
        String line3[] = {"2", "Rohan", "USA"};
        String line4[] = {"3", "Abhishek", "UK"};
        //Writing data to the csv file
        cw.writeNext(line1);
        cw.writeNext(line2);
        cw.writeNext(line3);
        cw.writeNext(line4);
        //close the file
        cw.close();
    }
}
