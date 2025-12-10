package org.example;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true; // modifies editor → saved
    }
}