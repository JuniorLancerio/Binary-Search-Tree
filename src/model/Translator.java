package model;

public class Translator {

    private BinaryTree<String, String> tree;

    public Translator(BinaryTree<String, String> tree) {
        this.tree = tree;
    }

    public String translateLine(String line) {

        StringBuilder result = new StringBuilder();
        String[] palabras = line.split(" ");

        for (String palabra : palabras) {

            String limpia = palabra.toLowerCase();

            if (limpia.contains("'")) {
                limpia = limpia.substring(limpia.indexOf("'") + 1);
            }

            limpia = limpia.replaceAll("[^a-zA-Záéíóúñ]", "");

            String traduccion = tree.search(limpia);

            if (traduccion != null) {
                result.append(traduccion).append(" ");
            } else {
                result.append("*").append(palabra).append("* ");
            }
        }

        return result.toString();
    }
}