package com.epam.jmp.web.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.epam.jmp.dto.OneDto;
import com.epam.jmp.dto.TwoDto;
import com.epam.jmp.service.TwoService;
import com.epam.jmp.web.TwoController;

@RestController
public class TwoControllerImpl implements TwoController {

	@Autowired
	private TwoService twoService;

	@Override
	public List<TwoDto> getTwoAll() {
		return twoService.getTwoAll();
	}

	@Override
	public TwoDto getTwoById(Integer id) {
		return twoService.getTwoById(id);
	}

	@Override
	public List<OneDto> getOneAll() {
		return twoService.getOneAll();
	}

	@Override
	public OneDto getOneById(Integer id) {
		return twoService.getOneById(id);
	}



}
