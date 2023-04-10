public class ChangeTextCommand implements Command {
    private Editor editor;
    private String text;
    private MementoSnapshot snapshot;

    public ChangeTextCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.setText(text);
        snapshot = editor.createMemento();
    }

    @Override
    public void undo() {
        editor.setMementoSnapshot(snapshot);
    }
}
