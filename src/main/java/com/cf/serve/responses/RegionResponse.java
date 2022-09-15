package com.cf.serve.responses;

import com.cf.serve.entities.Region;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.trips.service_framework.models.responses.BaseResponse;

import java.util.List;

@Data
@SuperBuilder
public class RegionResponse extends BaseResponse {
    private List<Region> data;
}
