package ru.vsu.rogachev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.rogachev.blog.models.User;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}
