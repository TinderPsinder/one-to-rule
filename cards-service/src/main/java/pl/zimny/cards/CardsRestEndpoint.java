package pl.zimny.cards;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.service.CardsService;

@RestController
@RequiredArgsConstructor
public class CardsRestEndpoint {

    private final CardsService cardsService;

    //test endpoint
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello from cards service";
    }

    @GetMapping(path = "/matches")
    public HttpStatus getAllMatches(){
        return cardsService.getAllMatches();
    }

    @PostMapping(path = "/card")
    public HttpStatus createCard(){
        return cardsService.createUserCard();
    }

    @GetMapping(path = "/closest")
    public HttpStatus getClosestUsers(){
        return cardsService.getClosestUsers();
    }

    @PostMapping(path = "/like/{userId}")
    public HttpStatus saveLike(@PathVariable Long userId){
        return cardsService.saveLike();
    }
}
