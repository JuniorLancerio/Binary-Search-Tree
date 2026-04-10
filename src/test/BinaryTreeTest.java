package test;

import static org.junit.Assert.*;
import org.junit.Test;
import model.BinaryTree;

public class BinaryTreeTest {

    @Test
    public void testInsertAndSearch() {

        BinaryTree<String, String> tree = new BinaryTree<>();

        tree.insert("chien", "perro");
        tree.insert("chat", "gato");
        tree.insert("maison", "casa");

        assertEquals("perro", tree.search("chien"));
        assertEquals("gato", tree.search("chat"));
        assertEquals("casa", tree.search("maison"));
    }

    @Test
    public void testSearchNotFound() {

        BinaryTree<String, String> tree = new BinaryTree<>();

        tree.insert("chien", "perro");

        assertNull(tree.search("gato"));
    }
}