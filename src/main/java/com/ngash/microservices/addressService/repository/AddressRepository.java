package com.ngash.microservices.addressService.repository;

import com.ngash.microservices.addressService.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface AddressRepository extends JpaRepository<Address, Integer> {

//    find address based on employeeId

    @Query(nativeQuery = true, value = "SELECT * FROM selenium_exp_mservices.address")
    public Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
}



