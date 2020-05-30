public interface MessageMediator {

    void sendMessage(String message, User user);
    void botMessage(String message);
    void addUser(User user);
    void removeUser(User user);
    void setBot(ChatBot bot);

}
