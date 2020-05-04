package pl.zimny.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zimny.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
