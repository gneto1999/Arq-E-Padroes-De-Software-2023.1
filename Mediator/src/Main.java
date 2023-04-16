public class Main {
    public static void main(String[] args) {
        Mediator whatsAppGroupMediator = new WhatsAppGroupMediator();
        WhatsAppMember member1 = new WhatsAppMember("Clark Kent", "2190500-1111", whatsAppGroupMediator);
        WhatsAppMember member2 = new WhatsAppMember("Bruce Wayne", "2191500-1001", whatsAppGroupMediator);
        WhatsAppMember member3 = new WhatsAppMember("Oliver Queen", "2191510-2001", whatsAppGroupMediator);
        
        whatsAppGroupMediator.addMember(member1);
        whatsAppGroupMediator.addMember(member2);
        whatsAppGroupMediator.addMember(member3);

        member1.sendMessage("Good morning, guys");
    }
}