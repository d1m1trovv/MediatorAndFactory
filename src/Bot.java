public abstract class Bot {

    protected MessageMediator mediator;
    protected String name = "Bot";

    public Bot(MessageMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract Boolean check(String message);
}
