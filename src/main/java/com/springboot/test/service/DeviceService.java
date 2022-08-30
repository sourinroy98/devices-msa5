package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.Devices;
import com.springboot.test.repository.DeviceRepo;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceRepo devicerepo;
	
	public List<Devices> addDevices(List<Devices> devices)
	{
		return devicerepo.saveAll(devices);
	}
	
	public List<Devices> getDevices()
	{
		return devicerepo.findAll();
	}

}
