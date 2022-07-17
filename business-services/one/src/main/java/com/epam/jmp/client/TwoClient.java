package com.epam.jmp.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.epam.jmp.dto.TwoDto;

@FeignClient("two-application")
public interface TwoClient {

	@GetMapping("/two")
	List<TwoDto> getTwoAll();

	@GetMapping("two/{id}")
	TwoDto getTwoById(@PathVariable Integer id);
}
