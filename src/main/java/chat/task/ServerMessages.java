package chat.task;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ServerMessages {

    private final SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void scheduleFixedDelayTask() {
        chat.entity.ChatMessage chatMessage = new chat.entity.ChatMessage(chat.enumeration.MessageType.MESSAGE, "Server", "Scheduled Nachricht", null);
        this.template.convertAndSend("/topic/chat", chatMessage);
    }

}