package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Application app = new Application();
        Editor editor = new Editor();
        app.activeEditor = editor;

        editor.setText("Hello World!");
        editor.select(6, 11); // selects "World"

        System.out.println("Initial text: " + editor.getText());

        // Copy
        app.executeCommand(new CopyCommand(app, editor));
        System.out.println("Clipboard after copy: " + app.getClipboard());

        // Cut
        app.executeCommand(new CutCommand(app, editor));
        System.out.println("After cut: " + editor.getText());

        // Undo cut
        app.executeCommand(new UndoCommand(app, editor));
        System.out.println("After undo: " + editor.getText());

        // Paste
        app.executeCommand(new PasteCommand(app, editor));
        System.out.println("After paste: " + editor.getText());

        // Undo paste
        app.executeCommand(new UndoCommand(app, editor));
        System.out.println("After undo paste: " + editor.getText());

    }
}