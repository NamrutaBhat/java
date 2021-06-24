package com.xworkz.perfumes.dao;

import java.util.List;

import com.xworkz.perfumes.dto.PerfumesDTO;


public interface PerfumesDAO {
public void createPerfumes(PerfumesDTO perfumesDTO);
public PerfumesDTO getTheDetails(PerfumesDTO perfumesDTO);
public void updatePriceByCompanyName(double price,String companyName);
public void deleteById(int id);
public List<PerfumesDTO> getAllPerfumesDetails();

public PerfumesDTO getAllDetailsById(int id);
public String getNameByPrice(double price);
public Object[] getCompanyNameExpDateById(int id);
public List getPerfumeNameAndExpDateById(Object[] id);
	
	
	
}
