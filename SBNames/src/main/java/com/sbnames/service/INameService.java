package com.sbnames.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sbnames.model.Name;

@Service
public interface INameService {
	List<Name> getNameList(int page, int pageSize, String sortDirection, String sort);
	long getCount();
	
	Name createName(Name name);
}
