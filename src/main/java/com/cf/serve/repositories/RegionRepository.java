package com.cf.serve.repositories;


import com.cf.serve.entities.Region;
import org.springframework.data.jpa.repository.Query;
import org.trips.service_framework.models.repositories.BaseRepository;

import java.util.List;

public interface RegionRepository extends BaseRepository<Region> {
    List<Region> findByParentId(Long regionId);
}
