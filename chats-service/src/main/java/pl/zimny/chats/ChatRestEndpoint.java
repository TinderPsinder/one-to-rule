package pl.zimny.chats;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.service.ChatService;

@RestController
@RequiredArgsConstructor
public class ChatRestEndpoint {

    private final ChatService chatService;

    //test endpoint
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello from chats service";
    }

    @GetMapping(path = "/history/{userId}")
    public HttpStatus getChatHistory(@PathVariable Long userId){
        return chatService.getChatHistory();
    }
}
