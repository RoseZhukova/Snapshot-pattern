package com.eremin;

import java.util.Stack;

public class StringBuilderHistory {
    private final Stack<SnapshotStringBuilder.Memento> history = new Stack<>();
    private final SnapshotStringBuilder editor;

    public StringBuilderHistory(SnapshotStringBuilder editor) {
        this.editor = editor;
    }

    public void append(String text) {
        history.push(editor.save());
        editor.append(text);
    }

    public void delete(int start, int end) {
        history.push(editor.save());
        editor.delete(start, end);
    }

    public void undo() {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}

