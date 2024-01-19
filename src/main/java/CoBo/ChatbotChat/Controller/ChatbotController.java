package CoBo.ChatbotChat.Controller;

import CoBo.ChatbotChat.Service.ChatbotService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/api/chatbot")
@RequiredArgsConstructor
@Slf4j
public class ChatbotController {

    private final ChatbotService chatbotService;

    @GetMapping("/chat")
    public ResponseEntity<String> getChat(@RequestParam String question){
        return chatbotService.getChat(question);
    }
}
