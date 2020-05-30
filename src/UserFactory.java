public class UserFactory extends AbstractUserFactory {

    @Override
    public ChatUser createUser(MessageMediator mediator, String name) {
        return new ChatUser(mediator, name);
    }
}
