package com.xworkz.perfumes.service;

import java.util.List;

import com.xworkz.perfumes.dto.PerfumesDTO;


public interface PerfumesService {

	public void createAndValidatePerfumes(PerfumesDTO perfumesDTO);
	public PerfumesDTO getTheDetails(PerfumesDTO perfumesDTO);
	public void updatePriceByCompanyName(double price,String companyName);
	public void deleteById(int id);
	public List<PerfumesDTO> getAllPerfumesDetails();
	
	public PerfumesDTO getAllDetailsById(int id);
	public String getNameByPrice(double price);
	public Object[] getCompanyNameExpDateById(int id);
	public List getPerfumeNameAndExpDateById(Object[] id);
	
	
	
}
