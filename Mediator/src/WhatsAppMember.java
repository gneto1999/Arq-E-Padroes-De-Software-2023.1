public class WhatsAppMember implements Colleague {
    private String name;
    private String cellphoneNumber;
    private Mediator whatsAppGroupMediator;

    public WhatsAppMember(String name, String cellphoneNumber, Mediator whatsAppGroupMediator) {
        this.name = name;
        this.cellphoneNumber = cellphoneNumber;
        this.whatsAppGroupMediator = whatsAppGroupMediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + ", " + cellphoneNumber + ", enviou: " + message);
        whatsAppGroupMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + ", " + cellphoneNumber + ", Recebeu messagem: " + message);
    }
}
