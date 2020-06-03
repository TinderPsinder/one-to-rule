package pl.zimny.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.model.Match;
import pl.zimny.model.Reaction;
import pl.zimny.service.CardsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardsRestEndpoint {

    private final CardsService cardsService;

    //test endpoint
    @GetMapping(path = "/hello-cards")
    public String hello() {
        return "Hello from cards service";
    }

    @GetMapping(path = "/matches/{userId}")
    public List<Match> getAllMatches(@PathVariable Long userId) {
        return cardsService.getAllMatches(userId);
    }

    @PostMapping(path = "/card")
    public HttpStatus createCard() {
        return cardsService.createUserCard();
    }

    @GetMapping(path = "/closest")
    public HttpStatus getClosestUsers() {
        return cardsService.getClosestUsers();
    }

    @PostMapping(path = "/reaction")
    public HttpStatus saveReaction(@RequestBody Reaction reaction) {
        return cardsService.saveReaction(reaction);
    }
}
