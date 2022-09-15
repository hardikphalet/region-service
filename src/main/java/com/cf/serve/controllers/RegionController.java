package com.cf.serve.controllers;

import com.cf.serve.entities.Region;
import com.cf.serve.responses.RegionNameResponse;
import com.cf.serve.responses.RegionResponse;
import com.cf.serve.services.RegionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trips.service_framework.controllers.BaseController;
import org.trips.service_framework.models.responses.BaseResponse;
import org.trips.service_framework.models.responses.StatusResponse;
import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController extends BaseController<RegionResponse, Region> {

    public RegionController(RegionService service) {
        super(service);
    }

    @Override
    public RegionService getService() {
        return (RegionService) this.service;
    }

    @Override
    protected RegionResponse createResponse(List<Region> regionList) {
        return RegionResponse.builder()
                .data(regionList)
                .status(StatusResponse.builder()
                        .statusCode(HttpStatus.OK.value())
                        .statusType(StatusResponse.Type.SUCCESS)
                        .totalCount(regionList.size())
                        .build())
                .build();
    }

    @GetMapping("/{regionId}/sub-regions")
    public RegionResponse getChildRegions(@PathVariable Long regionId) {
        return createResponse(getService().getChildRegions(regionId));
    }

    @GetMapping("/{regionId}/name")
    public BaseResponse getRegionName(@PathVariable Long regionId) {
//        return createResponse(Collections.singletonList(getService().find(regionId).getRegionName()))
        return RegionNameResponse.builder().status(StatusResponse.builder()
                .statusCode(HttpStatus.OK.value())
                .statusType(StatusResponse.Type.SUCCESS)
                .totalCount(1)
                .build())
                .regionName(getService()
                        .find(regionId)
                        .getRegionName())
                .build();
    }

}
