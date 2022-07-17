package com.epam.jmp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.jmp.client.OneClient;
import com.epam.jmp.dto.OneDto;
import com.epam.jmp.dto.TwoDto;
import com.epam.jmp.service.TwoService;

@Component
public class TwoServiceImpl implements TwoService{

	@Autowired
	OneClient oneClient;

	@Override
	public List<TwoDto> getTwoAll() {
		List<TwoDto> twoDtos = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			twoDtos.add(new TwoDto(i, "Two_" + RandomStringUtils.randomAlphabetic(10)));
		}
		return twoDtos;
	}

	@Override
	public TwoDto getTwoById(Integer id) {
		return new TwoDto(id, "Two_" + RandomStringUtils.randomAlphabetic(10));
	}

	@Override
	public List<OneDto> getOneAll() {
		return oneClient.getOneAll();
	}

	@Override
	public OneDto getOneById(Integer id) {
		return oneClient.getOneById(id);
	}

}
