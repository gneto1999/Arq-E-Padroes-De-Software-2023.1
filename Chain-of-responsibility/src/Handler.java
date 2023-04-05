public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle() {
        if(next != null) {
            System.out.println("A tarefa foi para a próxima hierarquia");
            next.handle();
        } else {
            System.out.println("Não foi possível tratar essa responsabilidade");
        }
    }
}
