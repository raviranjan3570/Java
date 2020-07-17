package com.company;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "1 2 5 4 3";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
    }
}
