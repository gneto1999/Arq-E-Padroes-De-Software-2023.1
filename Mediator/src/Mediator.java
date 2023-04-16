public interface Mediator {
    public void sendMessage(String message, Colleague myUser);
    public void addMember(Colleague member);
}
