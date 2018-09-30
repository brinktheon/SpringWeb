package org.chris;

public class Main {

    public static void main(String[] args) {
        MessageProvider provider = MessageFactory.getProvider();
        MessageRender render = MessageFactory.getRender();
        render.render();
    }
}
