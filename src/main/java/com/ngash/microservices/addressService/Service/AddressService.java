package com.ngash.microservices.addressService.Service;

import com.ngash.microservices.addressService.entity.Address;
import com.ngash.microservices.addressService.model.AddressMapper;
import com.ngash.microservices.addressService.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    ModelMapper modelMapper;

    public ResponseEntity<AddressMapper> getAddressByEmployeeId(int employeeId){


        Address address = addressRepository.findAddressByEmployeeId(employeeId);

        AddressMapper mapper = modelMapper.map(address, AddressMapper.class);


        return new ResponseEntity<>(mapper, HttpStatus.ACCEPTED);
    }
}
