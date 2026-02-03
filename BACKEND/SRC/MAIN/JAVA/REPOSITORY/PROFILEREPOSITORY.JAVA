package REPOSITORY;

import MODEL.PROFILE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PROFILEREPOSITORY extends JpaRepository<PROFILE, Long> {
    PROFILE findByEmail(String email);
}
