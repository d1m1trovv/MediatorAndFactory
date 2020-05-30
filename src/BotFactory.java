public class BotFactory extends AbstractBotFactory {
    @Override
    public ChatBot createBot(MessageMediator mediator) {
        return new ChatBot(mediator);
    }
}
