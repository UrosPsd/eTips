package com.etips.repositories;

import com.etips.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ClubRepository extends JpaRepository<Club, Long> {

    Club findOneByName(String name);

}
