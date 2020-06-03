package pl.zimny.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zimny.model.Reaction;

import java.util.List;
import java.util.Optional;


public interface ReactionRepository extends JpaRepository<Reaction, Long> {
    Optional<Reaction> findAllByReactingUserIdAndLikeTrue(Long reactingUserId);
    List<Reaction> findAllByReactingUserIdAndLikeFalse(Long reactingUserId);
}
