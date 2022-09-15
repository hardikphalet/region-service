package com.cf.serve.services;

import com.cf.serve.entities.Region;
import com.cf.serve.mappers.RegionMapper;
import com.cf.serve.repositories.RegionRepository;
import org.springframework.stereotype.Service;
import org.trips.service_framework.services.BaseService;

import java.util.List;

@Service
public class RegionService extends BaseService<Region> {
    public RegionService(RegionRepository repository) {
        super(repository, Region.class);
    }

    @Override
    protected Region merge(Region src, Region target) {
        return RegionMapper.INSTANCE.merge(src, target);
    }

    @Override
    public RegionRepository getRepository() {
        return (RegionRepository) this.repository;
    }

    public List<Region> getChildRegions(Long regionId) {
        return getRepository().findByParentId(regionId);
    }
}
