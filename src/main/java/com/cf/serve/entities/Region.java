package com.cf.serve.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.trips.service_framework.models.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "regions")
public class Region extends BaseEntity {
    @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
    private Long regionID;
    @Column(name = "name")
    private String regionName;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "population")
    private Long population;
}
