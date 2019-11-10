package com.sbnames.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbnames.dto.NameDto;
import com.sbnames.model.Name;
import com.sbnames.service.INameService;

@RestController
@RequestMapping("/names")
public class NamesRestController {
    @Autowired
    private INameService nameService;
 
    @Autowired
    private ModelMapper modelMapper;
	
	@GetMapping
	public List<NameDto> Get() {
		return nameService.getNameList(0, 5, "DESC", "id")
				.stream()
				.map(name -> modelMapper.map(name, NameDto.class))
				.collect(Collectors.toList());
	}
	
	@GetMapping(value = "count")
	public long GetCount() {
		return nameService.getCount();
	}
	
	@PostMapping
	public NameDto Post(@RequestBody NameDto model) {
		Name name = modelMapper.map(model, Name.class);
		name = nameService.createName(name);
		return modelMapper.map(name, NameDto.class);
	}
}
