package com.epam.jmp.service;

import java.util.List;

import com.epam.jmp.dto.OneDto;
import com.epam.jmp.dto.TwoDto;

public interface TwoService {

	List<TwoDto> getTwoAll();
	TwoDto getTwoById(Integer id);
	List<OneDto> getOneAll();
	OneDto getOneById(Integer id);
}
