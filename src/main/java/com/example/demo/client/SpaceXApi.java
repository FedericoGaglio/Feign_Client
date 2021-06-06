package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.SpaceX;

@FeignClient(name = "spaceXClient" ,url = "https://api.spacexdata.com/v2/launches/latest")
public interface SpaceXApi {
	
	@RequestMapping(method = RequestMethod.GET)
    SpaceX spaceXInfo();

}
