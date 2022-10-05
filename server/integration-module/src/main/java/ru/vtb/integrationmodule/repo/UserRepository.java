package ru.vtb.integrationmodule.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vtb.integrationmodule.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
