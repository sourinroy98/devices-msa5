package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.Devices;
import com.springboot.test.service.DeviceService;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@PostMapping("/addDevices")
	public List<Devices> addDevices(@RequestBody List<Devices> devices)
	{
		return deviceService.addDevices(devices);
	}
	
	@GetMapping("/getDevices")
	public List<Devices> getDevices()
	{
		return deviceService.getDevices();
	}

}
