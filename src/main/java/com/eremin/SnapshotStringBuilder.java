package com.eremin;

public class SnapshotStringBuilder {
    private StringBuilder text = new StringBuilder();

    public void append(String str) {
        text.append(str);
    }

    public void delete(int start, int end) {
        text.delete(start, end);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getState());
    }

    public static class Memento {
        private final String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }
    }
}
