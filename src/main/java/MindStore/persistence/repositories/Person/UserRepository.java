package MindStore.persistence.repositories.Person;

import MindStore.persistence.models.Person.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM users " +
            "WHERE UPPER(users.first_name) LIKE %:name% " +
            "OR UPPER(users.last_name) LIKE %:name%", nativeQuery = true)
    List<User> findAllByName(String name);

    Optional<User> findByEmail(String email);
}
