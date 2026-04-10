package controller;

import model.*;
import view.ConsoleView;

import java.io.*;

public class DictionaryController {

    private BinaryTree<String, String> tree;
    private Translator translator;
    private ConsoleView view;

    public DictionaryController() {
        view = new ConsoleView();
    }

    public void run() throws Exception {

        tree = FileLoader.loadDictionary("data/diccionario.txt");

        translator = new Translator(tree);

        BufferedReader br = new BufferedReader(new FileReader("data/texto.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String traducida = translator.translateLine(line);
            view.print(traducida);
        }

        br.close();
    }
}