public class Analista extends Handler {
    private boolean analisar;
    public Analista(Handler next, boolean analisar) {
        super(next);
        this.analisar = analisar;
    }

    @Override
    public void handle() {
        if(analisar) {
            System.out.println("O analista realizou a tarefa");
        } else {
            super.handle();
        }
    }
}
