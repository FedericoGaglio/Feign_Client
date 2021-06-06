package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "flight_number",
        "mission_name",
        "launch_year"
})

public class SpaceX {
	
	@JsonProperty("flight_number")
    private String flightNumber;
    @JsonProperty("mission_name")
    private String missionName;
    @JsonProperty("launch_year")
    private String launchYear;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flight_number")
	public String getFlightNumber() {
		return flightNumber;
	}

	@JsonProperty("flight_number")
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@JsonProperty("mission_name")
	public String getMissionName() {
		return missionName;
	}

	@JsonProperty("mission_name")
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	@JsonProperty("launch_year")
	public String getLaunchYear() {
		return launchYear;
	}

	@JsonProperty("launch_year")
	public void setLaunchYear(String launchYear) {
		this.launchYear = launchYear;
	}

    @JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

    @JsonAnySetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
    
    
    

}
