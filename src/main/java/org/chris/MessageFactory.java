package org.chris;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MessageFactory {
    private static MessageProvider provider;
    private static MessageRender render;

    static {
        Properties properties = new Properties();
        try(InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")) {
            properties.load(in);
            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRenderClass = properties.getProperty("messageRenderClass");


            provider = (MessageProvider) Class.forName(messageProviderClass).newInstance();
            render = (MessageRender) Class.forName(messageRenderClass).getConstructor(MessageProvider.class).newInstance(provider);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static MessageProvider getProvider(){
        return provider;
    }

    public static MessageRender getRender(){
        return render;
    }

}













