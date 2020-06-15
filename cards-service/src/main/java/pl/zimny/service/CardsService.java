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

    public List<Match> getAllMatches(Long userId){
        return matchRepository.findAllByUser1Id(userId);
    }

    public List<Reaction> getAllDislikes(Long userId){
        return reactionRepository.findAllByReactingUserIdAndLikeFalse(userId);
    }
    public List<Reaction> getAllLikes(Long userId){
        return reactionRepository.findAllByReactingUserIdAndLikeTrue(userId);
    }

    public HttpStatus saveReaction(Reaction reaction){
        //save like to the database
        reactionRepository.save(reaction);
        if(reactionRepository.findAllByReactingUserIdAndLikeTrue(reaction.getSwipedUserId()).stream().anyMatch(re -> re.getSwipedUserId().equals(reaction.getReactingUserId()))){
            matchRepository.save(new Match(reaction.getReactingUserId(), reaction.getSwipedUserId()));
        }
        return HttpStatus.OK;
    }

    public HttpStatus destroyAllReactions(){
        reactionRepository.deleteAll();
        return HttpStatus.OK;
    }
}

