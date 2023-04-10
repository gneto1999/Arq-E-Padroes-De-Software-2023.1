public class Editor {
    private String text = "";

    public MementoSnapshot createMemento() {
        System.out.println("Salvando estado do objeto: " + text);
        return new MementoSnapshot(text);
    }

    public void setMementoSnapshot(MementoSnapshot snapshot) {
        System.out.println("Recuperando estado do objeto: " + snapshot.getText());
        text = snapshot.getText();
    }

    public void setText(String text) {
        this.text = text;
    }
}
