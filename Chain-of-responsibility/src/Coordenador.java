public class Coordenador extends Handler {
    private boolean coordenar;
    public Coordenador(Handler next, boolean coordenar) {
        super(next);
        this.coordenar = coordenar;
    }

    @Override
    public void handle() {
        if(coordenar) {
            System.out.println("O coordenador realizou a tarefa");
        } else {
            super.handle();
        }
    }

}