package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class ToyShop {

    private final String filename = "src/main/resources/file.txt";
    Toys toys;

    ToyShop(String[] toyProperties) {
        toys = new Toys();
        int id = 0;
        int rate = 0;
        String name = "";

        for (String item : toyProperties) {
            String[] toyProperty = item.split(" ");
            if (toyProperty.length < 3) {
                System.out.println("Input data error: wrong number of parameters in string.");
                return;
            }
            try {
                id = Integer.parseInt(toyProperty[0]);
            } catch (NumberFormatException e) {
                System.out.println("Input data error: wrong id.");
                return;
            };
            try {
                rate = Integer.parseInt(toyProperty[1]);
            } catch (NumberFormatException e) {
                System.out.println("Input data error: wrong rate.");
                return;
            };
            name = toyProperty[2];

            toys.addToys(id, rate, name);
        }
    }

    public void getToyAndWriteToFile() {
        File file = new File(filename);
        try {
            Files.deleteIfExists(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Toys item = toys; item.hasNext(); ) {
            Toy toy = item.next();
            System.out.println(toy);
            writeStringToFile(toy.toString() + "\n");
        }
    }

    private void writeStringToFile(String data) {
        FileOutputStream fileOutStream = null;

        try {
            File file = new File(filename);
            fileOutStream = new FileOutputStream(file, true);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] b = data.getBytes();
            fileOutStream.write(b);
            fileOutStream.flush();
            fileOutStream.close();
            System.out.println("File writing done.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutStream != null) {
                    fileOutStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
