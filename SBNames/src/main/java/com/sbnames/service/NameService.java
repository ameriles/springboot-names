package com.sbnames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.sbnames.model.Name;
import com.sbnames.repository.INameRepository;

@Component
public class NameService implements INameService {

	@Autowired
	INameRepository nameRepository;
	
	@Override
	public List<Name> getNameList(int page, int pageSize, String sortDirection, String sort) {

		PageRequest pageReq = PageRequest.of(page, pageSize, Sort.Direction.fromString(sortDirection), sort);

		Page<Name> posts = nameRepository.findAll(pageReq);
		return posts.getContent();
	}

	@Override
	public long getCount() {
		return nameRepository.count();
	}

	@Override
	public Name createName(Name name) {
		return nameRepository.save(name);
	}

}
