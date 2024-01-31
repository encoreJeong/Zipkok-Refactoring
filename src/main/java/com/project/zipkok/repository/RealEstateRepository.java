package com.project.zipkok.repository;

import com.project.zipkok.model.RealEstate;
import com.project.zipkok.model.Zim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateRepository extends JpaRepository<RealEstate, Long> {
    RealEstate findById(long realEstateId);
}