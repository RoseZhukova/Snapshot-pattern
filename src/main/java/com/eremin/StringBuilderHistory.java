package com.eremin;

import java.util.Stack;

public class StringBuilderHistory {
    private final Stack<SnapshotStringBuilder.Memento> undoStack = new Stack<>();

    public void push(SnapshotStringBuilder.Memento memento) {
        undoStack.push(memento);
    }

    public SnapshotStringBuilder.Memento pop() {
        if (undoStack.isEmpty()) {
            return null;
        }

        return undoStack.pop();
    }

    public boolean isEmpty() {
        return undoStack.isEmpty();
    }
}

