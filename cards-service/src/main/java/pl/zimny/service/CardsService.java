package pl.zimny.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pl.zimny.dao.MatchRepository;
import pl.zimny.dao.ReactionRepository;
import pl.zimny.model.Match;
import pl.zimny.model.Reaction;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsService {

    private final MatchRepository matchRepository;
    private final ReactionRepository reactionRepository;

    public HttpStatus createUserCard(){
        //validate card data
        // save card to the database
        return  HttpStatus.OK;
    }

    public List<Match> getAllMatches(Long userId){
        return matchRepository.findAllByUser1Id(userId);
    }

    public HttpStatus getClosestUsers(){
        // ask maps service for the users
        // retrieve from the database the users that I didnt like?
        // filter users that i didnt like?
        return  HttpStatus.OK;
    }

    public HttpStatus saveReaction(Reaction reaction){
        //save like to the database
        reactionRepository.save(reaction);
        if(reactionRepository.findAllByReactingUserIdAndLikeTrue(reaction.getSwipedUserId()).isPresent()){
            matchRepository.save(new Match(reaction.getReactingUserId(), reaction.getSwipedUserId()));
        };
        return HttpStatus.OK;
    }
}

