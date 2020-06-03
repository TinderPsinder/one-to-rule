package pl.zimny.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.zimny.model.Match;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query("SELECT m FROM Match m where m.user1Id = :userId OR m.user2Id = :userId")
    List<Match> findAllByUserId(@Param("userId") Long userId);

    List<Match> findAllByUser1Id(@Param("user1Id") Long user1Id);
}
