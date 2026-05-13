package com.eremin;

public class Main {
    public static void main(String[] args) {

        EditorFacade app = new EditorFacade();

        app.append("Hello");
        app.append(" World");

        System.out.println(app.getText());

        app.undo();

        System.out.println(app.getText());
    }
}