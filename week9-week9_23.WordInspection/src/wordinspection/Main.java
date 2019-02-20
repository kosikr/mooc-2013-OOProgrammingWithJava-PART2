package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection s = new WordInspection(new File("src/shortList.txt"));
        s.wordsContainingZ();

    }
}
