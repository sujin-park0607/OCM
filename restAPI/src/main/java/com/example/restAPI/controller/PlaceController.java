package com.example.restAPI.controller;

import com.example.restAPI.exception.ResourceNotFoundException;
import com.example.restAPI.model.Place;
import com.example.restAPI.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping
    public List<Place> getAllPlace(){
        return placeRepository.findAll();
    }

    //build create place REST API
    @PostMapping
    public Place createPlace(@RequestBody Place place){
        return placeRepository.save(place);
    }

    //build get palce by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Place> getPlaceById(@PathVariable Integer id){
        Place place = placeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Place not exist with id" + id));
        return ResponseEntity.ok(place);
    }

    //build update place REST API
    @PutMapping("{id}")
    public ResponseEntity<Place> updatePlace(@PathVariable Integer id,@RequestBody Place placeDetails){
        Place updatePlace = placeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Place not exist with id" + id));
        updatePlace.setHost(placeDetails.getHost());
        updatePlace.setLocation(placeDetails.getLocation());
        updatePlace.setTitle(placeDetails.getTitle());
        updatePlace.setContent(placeDetails.getContent());
        updatePlace.setPrice(placeDetails.getPrice());
        updatePlace.setTag(placeDetails.getTag());
        updatePlace.setFacility(placeDetails.getFacility());
        updatePlace.setWholeCount(placeDetails.getWholeCount());
        updatePlace.setCuurentCount(placeDetails.getCuurentCount());

        return ResponseEntity.ok(updatePlace);
    }

    //build delete place REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deletePlace(@PathVariable Integer id){
        Place place = placeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Place not exist with id" + id));
        placeRepository.delete(place);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
