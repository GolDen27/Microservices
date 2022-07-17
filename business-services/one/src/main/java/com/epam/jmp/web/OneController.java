package com.epam.jmp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.jmp.dto.OneDto;
import com.epam.jmp.dto.TwoDto;
import com.epam.jmp.service.OneService;
import com.netflix.servo.monitor.BasicGauge;
import com.netflix.servo.monitor.Counter;
import com.netflix.servo.monitor.Gauge;
import com.netflix.servo.monitor.MonitorConfig;
import com.netflix.servo.monitor.PeakRateCounter;

@RestController
@RequestMapping("/one")
public class OneController {
	
	@Autowired
	private OneService oneService;

	private Counter counter = new PeakRateCounter(MonitorConfig.builder("counter").build());
	private Gauge<Double> gauge = new BasicGauge<>(MonitorConfig.builder("gauge").build(), () -> 3.14);
	
	@GetMapping()
	public List<OneDto> getOneAll() {
		counter.increment();
		return oneService.getOneAll();
	}
	
	@GetMapping("/{id}")
	public OneDto getOneById(@PathVariable Integer id) {
		counter.increment();
		return oneService.getOneById(id);
	}
	
	@GetMapping("/two")
	public List<TwoDto> getTwoAll() {
		counter.increment();
		return oneService.getTwoAll();
	}
	
	@GetMapping("/two/{id}")
	public TwoDto getTwoById(@PathVariable Integer id) {
		counter.increment();
		return oneService.getTwoById(id);
	}

	@GetMapping("/counter")
	public Integer getCounter() {
		return counter.getValue().intValue();
	}

	@GetMapping("/gauge")
	public Double getGauge() {
		return gauge.getValue();
	}
}