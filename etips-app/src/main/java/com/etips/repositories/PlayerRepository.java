package com.etips.repositories;

import com.etips.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Player findByNameAndSurname(String name, String surname);

}
