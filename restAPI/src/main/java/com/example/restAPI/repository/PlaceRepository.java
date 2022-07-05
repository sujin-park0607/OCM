package com.example.restAPI.repository;


import com.example.restAPI.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {
    //all crud database method
    //orm기능을 담당한다.
}
