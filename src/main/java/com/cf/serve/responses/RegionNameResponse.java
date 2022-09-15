package com.cf.serve.responses;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.trips.service_framework.models.responses.BaseResponse;

@Data
@SuperBuilder
public class RegionNameResponse extends BaseResponse {
    private String regionName;
}
