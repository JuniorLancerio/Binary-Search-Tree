package model;

import java.io.*;

public class FileLoader {

    public static BinaryTree<String, String> loadDictionary(String path) throws Exception {

        BinaryTree<String, String> tree = new BinaryTree<>();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;

        while ((line = br.readLine()) != null) {

            line = line.replace("(", "").replace(")", "");
            String[] parts = line.split(",");

            String fr = parts[0].trim().toLowerCase();
            String es = parts[1].trim().toLowerCase();

            tree.insert(fr, es);
        }

        br.close();

        return tree;
    }
}