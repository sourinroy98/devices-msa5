package com.springboot.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.test.entity.Devices;

public interface DeviceRepo extends JpaRepository<Devices, Integer>{

}
