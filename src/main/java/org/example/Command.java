package org.example;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    private String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    protected void saveBackup() {
        backup = editor.getText();
    }

    public void undo() {
        editor.setText(backup);
    }

    public abstract boolean execute();
}
