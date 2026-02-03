-- Active: 1769969370886@@_@null
package REPOSITORY;

import MODEL.SKILL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKILLREPOSITORY extends JpaRepository<SKILL, Long> {
}
        SKILL findByName(String name);

