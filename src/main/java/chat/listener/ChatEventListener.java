package chat.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;

@Component
public class ChatEventListener {
    @EventListener
    public void handleSessionConnected(SessionConnectedEvent event) {
        System.out.println("CONNECTED");
    }

    @EventListener
    public void handleSessionDisconnected(SessionConnectedEvent event) {
        System.out.println("DISCONNECTED");
    }
}
