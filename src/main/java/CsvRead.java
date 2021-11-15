import com.opencsv.CSVReader;

import java.io.*;
import java.util.Scanner;

public class CsvRead {
    public static void main(String[] args) {
        String filePath1 = "D:\\Desk\\FileHandling\\addressBook.csv";

        //readCsvSc(filePath);
        //readCsvBr(filePath);
        readCsvOpen(filePath1);
    }

    private static void readCsvSc(String filePath) {
        try {
            Scanner sc = new Scanner(new File(filePath));
            while (sc.hasNext()) {
                System.out.println(sc.next().toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void readCsvBr(String filePath) {
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readCsvOpen(String filePath) {
        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                for (String value : nextLine) {
                    System.out.println(value);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
