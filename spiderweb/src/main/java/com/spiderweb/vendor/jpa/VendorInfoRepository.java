package com.spiderweb.vendor.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VendorInfoRepository extends JpaRepository<vendorInfo,Long> {

}
