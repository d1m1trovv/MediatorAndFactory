public class MainClass{
    public static void main(String[] args) {
        MessageMediator mediator = new ChatMessageMediator();
        UserFactory userFactory = new UserFactory();

        ChatUser userOne = userFactory.createUser(mediator, "Gosho");
        ChatUser userTwo = userFactory.createUser(mediator, "Tosho");
        ChatUser userThree = userFactory.createUser(mediator, "Ivan");

        userOne.send("Hello guys!");
        userOne.send("addBot");
        userTwo.send("Hello!");
        userThree.send("cat");
        userOne.send("Ok");
        userTwo.send("Ok");
    }
}
