
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafal
 */
public class Printer {

    private String fileName;
    private Scanner reader;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;

    }

    public void printLinesWhichContain(String word) throws Exception {
        File f = new File(this.fileName);
        reader = new Scanner(f);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();

    }
}
