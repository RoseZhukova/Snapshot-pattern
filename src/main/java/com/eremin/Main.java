package com.eremin;

public class Main {
    public static void main(String[] args) {
        SnapshotStringBuilder editor = new SnapshotStringBuilder();
        StringBuilderHistory history = new StringBuilderHistory(editor);

        history.append("Hello");
        history.append(" World");

        System.out.println(editor.getText());

        history.undo();

        System.out.println(editor.getText());
    }
}