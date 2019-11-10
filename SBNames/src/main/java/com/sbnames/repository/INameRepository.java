package com.sbnames.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sbnames.model.Name;

public interface INameRepository extends PagingAndSortingRepository<Name, Long> {

}
