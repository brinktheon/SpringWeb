package org.chris;

public class SimpleMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello Message";
    }
}
