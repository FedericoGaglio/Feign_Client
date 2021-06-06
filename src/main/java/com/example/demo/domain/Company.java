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
        "name",
        "founder",
        "founded"
})
public class Company {

    @JsonProperty("name")
    private String name;
    @JsonProperty("founder")
    private String founder;
    @JsonProperty("founded")
    private Long founded;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("founder")
    public String getFounder() {
        return founder;
    }

    @JsonProperty("founder")
    public void setFounder(String founder) {
        this.founder = founder;
    }

    @JsonProperty("founded")
    public Long getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Long founded) {
        this.founded = founded;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}