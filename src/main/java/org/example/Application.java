package org.example;

public class Application {
    private String clipboard = "";
    public Editor activeEditor;
    public CommandHistory history = new CommandHistory();

    public void setClipboard(String value) {
        clipboard = value;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command last = history.pop();
        if (last != null) {
            last.undo();
        }
    }
}
