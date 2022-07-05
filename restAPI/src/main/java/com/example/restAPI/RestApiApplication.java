package com.example.restAPI;

import com.example.restAPI.model.Place;
import com.example.restAPI.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
	@Autowired
	private PlaceRepository placeRepository;

	@Override
	public void run(String... args) throws Exception{

		Place place = new Place();
		place.setHost("sujin");
		place.setLocation("청주시 서원구 경신로");
		place.setTitle("것대산");
		place.setContent("전망 좋은 것대산~");
		place.setPrice(13000);
		place.setTag("#전망#좋아요");
		place.setFacility("샤워실,일출,화장실,해변");
		place.setWholeCount(5);
		place.setCuurentCount(3);
		placeRepository.save(place);

		Place place1 = new Place();
		place1.setHost("John");
		place1.setLocation("청주시 서원구 경신로");
		place1.setTitle("산당산성");
		place1.setContent("전망 좋은 산당산성~");
		place1.setPrice(13000);
		place1.setTag("#전망#좋아요");
		place1.setFacility("샤워실,일출,화장실,해변");
		place1.setWholeCount(5);
		place1.setCuurentCount(3);
		placeRepository.save(place1);

		Place place2 = new Place();
		place2.setHost("Minsu");
		place2.setLocation("청주시 서원구 경신로");
		place2.setTitle("평창");
		place2.setContent("전망 좋은 평창~");
		place2.setPrice(13000);
		place2.setTag("#전망#좋아요");
		place2.setFacility("샤워실,일출,화장실,해변");
		place2.setWholeCount(5);
		place2.setCuurentCount(3);
		placeRepository.save(place2);

	}

}
