package profiling;

import model.BinaryTree;

public class Profiling {

    public static void main(String[] args) {

        BinaryTree<String, String> tree = new BinaryTree<>();

        long startInsert = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            tree.insert("palabra" + i, "valor" + i);
        }

        long endInsert = System.nanoTime();

        long startSearch = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            tree.search("palabra" + i);
        }

        long endSearch = System.nanoTime();

        System.out.println("Insert: " + (endInsert - startInsert));
        System.out.println("Search: " + (endSearch - startSearch));
    }
}