package starter.HomeMenu;

import net.thucydides.core.annotations.Step;

public class sendMessage {
    @Step("the user click the Message button")
    public void ClickMessageButton() {
        System.out.println("the user click the Message button");
    }

    @Step("a user click add new message and add receiver")
    public void AddNewMessage() {
        System.out.println("a user click add new message and add receiver");
    }

    @Step("a user write the message")
    public void WriteMessage() {
        System.out.println("a user write the message");
    }

    @Step("click the send button to sending message")
    public void SendMessage() {
        System.out.println("click the send button to sending message");
    }
}
