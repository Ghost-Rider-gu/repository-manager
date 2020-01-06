package repositoryManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repositoryManager.model.UserModel;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByName(String userName);
}
