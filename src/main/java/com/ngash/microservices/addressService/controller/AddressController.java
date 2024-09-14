package com.ngash.microservices.addressService.controller;

import com.ngash.microservices.addressService.Service.AddressService;
import com.ngash.microservices.addressService.model.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressMapper> getAddressByEmployeeId(@PathVariable("employeeId") int employeeId){
        System.out.println("Calling getAddressBy EmployeeId");
        return addressService.getAddressByEmployeeId(employeeId);
    }
}


