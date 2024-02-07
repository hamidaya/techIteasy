package org.ayachi.techiteasy.repositories;

import org.ayachi.techiteasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelevisionRepository extends JpaRepository<Television, Long> {

    //return een Optional television
    // zoekmethodes aanpassen
    List<Television> findByBrand(String brand);
}
