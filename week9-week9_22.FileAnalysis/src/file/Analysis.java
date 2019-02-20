/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Rafal
 */
public class Analysis {

    private Scanner reader;
    private Scanner reader2;
    private File file;

    public Analysis(File file) throws Exception {
        this.file = file;
    }

    public int lines() throws Exception {
        reader = new Scanner(this.file);
        int i = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            i++;
        }
        reader.close();
        return i;

    }

    public int characters() throws Exception {
        reader2 = new Scanner(this.file);
        int length = this.lines();
        while (reader2.hasNextLine()) {
            String line = reader2.useDelimiter("").nextLine();
            length += line.length();
        }
        reader2.close();
        return length;
    }

}
