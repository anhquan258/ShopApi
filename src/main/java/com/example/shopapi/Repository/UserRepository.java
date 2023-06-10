package com.example.shopapi.Repository;

import com.example.shopapi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static org.hibernate.sql.ast.Clause.UPDATE;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findOneByAccAndPass(String acc, String pass);

    User findByAcc(String acc);
    @Modifying
    @Query("UPDATE User u SET u.acc = :acc, u.adress = :adress, u.birthday = :birthday, u.email = :email, u.name = :name WHERE u.iduser = :id")
    void updateUser(@Param("acc") String acc, @Param("adress") String adress, @Param("birthday") String birthday, @Param("email") String email, @Param("name") String name, @Param("id") int id);
}



