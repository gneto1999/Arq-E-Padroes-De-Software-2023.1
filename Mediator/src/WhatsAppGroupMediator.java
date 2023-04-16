import java.util.ArrayList;
import java.util.List;

public class WhatsAppGroupMediator implements Mediator {
    List<Colleague> whatsappGroupMembers = new ArrayList<>();

    @Override
    public void sendMessage(String message, Colleague myUser) {
        for (Colleague whatsappGroupMember : whatsappGroupMembers) {
            if(whatsappGroupMember != myUser) {
                whatsappGroupMember.receiveMessage(message);
            }
        }
    }

    @Override
    public void addMember(Colleague member) {
        whatsappGroupMembers.add(member);
    }
}
