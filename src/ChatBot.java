public class ChatBot extends Bot{

    public ChatBot(MessageMediator mediator){
        super(mediator);
        mediator.setBot(this);
    }

    @Override
    public void send(String message) {
        System.out.println(super.name + " sends: " + message);
        mediator.botMessage(message);

    }

    @Override
    public Boolean check(String message) {
        if(message.equals("cat")){
            return true;
        }
        else
            return false;
    }
}
