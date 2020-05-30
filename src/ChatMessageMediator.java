import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator{

    private List<User> users;
    private ChatBot bot;
    private BotFactory botFactory;

    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {

        if(message.equals("addBot") && bot == null){
            botFactory = new BotFactory();
            bot = botFactory.createBot(this);
            for(User u : this.users) {
                u.receive(user.name + " has created bot.");
            }
        }

        if(bot != null && bot.check(message)){
            removeUser(user);
            bot.send("User " + user.name + " has been removed! The word 'cat' is not allowed.");
        }
        else {
            for (User u : this.users) {
                if (u != user) {
                    u.receive(message);
                }
            }
        }
    }

    @Override
    public void botMessage(String message) {
        for (User u : this.users) {
            u.receive(message);
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
    }

    @Override
    public void setBot(ChatBot Bot){
        this.bot = Bot;
    }

}
