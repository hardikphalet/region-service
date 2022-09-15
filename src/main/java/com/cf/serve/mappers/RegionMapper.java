package com.cf.serve.mappers;

import com.cf.serve.entities.Region;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.trips.service_framework.mappers.BaseMapper;
import org.trips.service_framework.utils.ProtoMapperUtil;

@Mapper(uses = ProtoMapperUtil.class,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RegionMapper extends BaseMapper<Region> {
    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);
}
