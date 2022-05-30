package com.etips.repositories;

import com.etips.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player findOneByNameAndSurname(String name, String surname);

}
