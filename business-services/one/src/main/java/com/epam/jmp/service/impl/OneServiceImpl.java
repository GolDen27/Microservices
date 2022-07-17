package com.epam.jmp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.jmp.client.TwoClient;
import com.epam.jmp.dto.OneDto;
import com.epam.jmp.dto.TwoDto;
import com.epam.jmp.service.OneService;
import com.netflix.servo.monitor.Counter;
import com.netflix.servo.monitor.MonitorConfig;
import com.netflix.servo.monitor.PeakRateCounter;

@Component
public class OneServiceImpl implements OneService {
	
	@Autowired
	TwoClient twoClient;

	@Override
	public List<OneDto> getOneAll() {
		List<OneDto> oneDtos = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			oneDtos.add(new OneDto(i, "One_" + RandomStringUtils.randomAlphabetic(10)));
		}
		return oneDtos;
	}

	@Override
	public OneDto getOneById(Integer id) {
		return new OneDto(id, "One_" + RandomStringUtils.randomAlphabetic(10));
	}

	@Override
	public List<TwoDto> getTwoAll() {
		return twoClient.getTwoAll();
	}

	@Override
	public TwoDto getTwoById(Integer id) {
		return twoClient.getTwoById(id);
	}

}
