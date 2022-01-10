package com.spartaglobal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("1h")
    private Double oneH;

    public Double getOneH() { return oneH; }
}
