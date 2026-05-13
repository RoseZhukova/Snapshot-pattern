package com.eremin;

public class EditorFacade {

    private final SnapshotStringBuilder editor = new SnapshotStringBuilder();
    private final StringBuilderHistory history = new StringBuilderHistory();

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

    public String getText() {
        return editor.getText();
    }
}
