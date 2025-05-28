package com.jobmaster.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobmaster.model.Company;

public interface CompanyRepository  extends JpaRepository<Company, Long>{
	Optional<Company> findByNameIgnoreCase(String name);

}
