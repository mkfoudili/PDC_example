package org.example;

public class Editor {
    private String text = "";
    private int selectionStart = 0;
    private int selectionEnd = 0;

    public String getText() {
        return text;
    }

    public void setText(String value) {
        this.text = value;
    }

    public String getSelection() {
        return text.substring(selectionStart, selectionEnd);
    }

    public void deleteSelection() {
        text = text.substring(0, selectionStart) +
                text.substring(selectionEnd);
        selectionEnd = selectionStart;
    }

    public void replaceSelection(String newText) {
        text = text.substring(0, selectionStart)
                + newText
                + text.substring(selectionEnd);
        selectionEnd = selectionStart + newText.length();
    }

    // simple method to simulate selecting text
    public void select(int start, int end) {
        this.selectionStart = start;
        this.selectionEnd = end;
    }
}
