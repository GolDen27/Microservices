package com.epam.jmp.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.jmp.dto.OneDto;
import com.epam.jmp.dto.TwoDto;

@RequestMapping("/two")
public interface TwoController {
	
	@GetMapping()
	public List<TwoDto> getTwoAll();
	
	@GetMapping("/{id}")
	public TwoDto getTwoById(@PathVariable Integer id);
	
	@GetMapping("/one")
	public List<OneDto> getOneAll();
	
	@GetMapping("/one/{id}")
	public OneDto getOneById(@PathVariable Integer id);

}
