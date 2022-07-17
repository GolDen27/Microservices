package com.epam.jmp.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.epam.jmp.dto.OneDto;

@FeignClient("one-application")
public interface OneClient {

	@GetMapping("/one")
	List<OneDto> getOneAll();

	@GetMapping("one/{id}")
	OneDto getOneById(@PathVariable Integer id);
}
