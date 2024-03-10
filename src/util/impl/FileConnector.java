package util.impl;

import util.Connectable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileConnector implements Connectable {

    public static String getFileContent() {

        StringBuilder builder = new StringBuilder();

        File file = new File("input.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                builder.append(line);
            }

            if(builder.isEmpty()){
                return "-1";
            }

        } catch (IOException e) {
            System.out.println("File not found! Add input.txt file with food information and try again!");
        }
        return builder.toString();
    }
}
