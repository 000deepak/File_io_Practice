package FileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Writer;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;


public class FileIOOpenCSV {
    private static String HOME = "D:\\Desk\\FileHandling\\src\\Resources\\addressBook.csv";


    public static void main(String[] args) {
        ArrayList<Contacts> record = new ArrayList<>();

        Contacts contact = new Contacts("d","k");
        record.add(contact);

        writeData(record);
        countLines();

        for (Contacts c : readData()){
            record.add(c);
            System.out.println(record);
        }
    }


    public static boolean writeData(ArrayList<Contacts> rec) {

        try {
            Writer writer = Files.newBufferedWriter(Paths.get(HOME ));
            StatefulBeanToCsv<Contacts> beanToCsv = new StatefulBeanToCsvBuilder<Contacts>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
            beanToCsv.write(rec);
            writer.flush();
            writer.close();
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Contacts> readData() {
        ArrayList<Contacts> r = new ArrayList<>();

        try {
            FileReader reader = new FileReader(HOME);
            CSVReader csvreader = new CSVReader(reader);
            String[] dataRecord;
            while (csvreader.readNext() != null) {
                dataRecord = csvreader.readNext();
                Contacts c = new Contacts(dataRecord[0], dataRecord[1]);
                r.add(c);
            }
            csvreader.close();
            return r;
        } catch (Exception exception) {
            System.out.println("Exception occured");
            exception.printStackTrace();
        }
        return null;
    }

    public static int countLines() {
        int lines = 0;

        try {
            lines = (int) Files.lines(new File(HOME).toPath()).count();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return lines;
    }
}