public class Gerente extends Handler {
    private boolean gerenciar;

    public Gerente(Handler next, boolean gerenciar) {
        super(next);
        this.gerenciar = gerenciar;
    }

    @Override
    public void handle() {
        if(gerenciar) {
            System.out.println("O gerente realizou a tarefa");
        } else {
            super.handle();
        }
    }
}
