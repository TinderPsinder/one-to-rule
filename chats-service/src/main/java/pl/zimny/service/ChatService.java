package pl.zimny.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public HttpStatus getChatHistory(){
        //retrieve chat history from the database
        return HttpStatus.OK;
    }
}
