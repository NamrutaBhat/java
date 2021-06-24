package com.xworkz.perfumes.service;

import java.util.List;

import com.xworkz.perfumes.dao.PerfumesDAO;
import com.xworkz.perfumes.dao.PerfumesDAOImpl;
import com.xworkz.perfumes.dto.PerfumesDTO;

public class PerfumesServiceImpl implements PerfumesService{

	private PerfumesDAO perfumesDAO;
	public PerfumesServiceImpl()
	{
		perfumesDAO=new PerfumesDAOImpl();
	}
	
	
	@Override
	public void createAndValidatePerfumes(PerfumesDTO perfumesDTO) {
		if(perfumesDTO!=null) {
			if(perfumesDTO.getPerfumesId()>0 &&perfumesDTO.getPerfumeName()!=null) {
				perfumesDAO.createPerfumes(perfumesDTO);
			}
		}
		
	}


	@Override
	public PerfumesDTO getTheDetails(PerfumesDTO perfumesDTO) {
		if(perfumesDTO!=null) {
			if(perfumesDTO.getExpDate()!=null && perfumesDTO.getCompanyName()!=null) {
				perfumesDAO.getTheDetails(perfumesDTO);
		       }
			else {
				System.out.println("please enter valid data");
			}
		}
		return perfumesDTO;
	}


	@Override
	public void updatePriceByCompanyName(double price, String companyName) {
		if(price>0 && companyName!=null) {
			
			perfumesDAO.updatePriceByCompanyName(price, companyName);
		}
		else
		{
			System.out.println("please enter the valid id");
		}
	}


	@Override
	public void deleteById(int id) {
		if(id>0) {
			perfumesDAO.deleteById(id);
		}
		else
		{
			System.out.println("enter the valid id");
		}
	}


	@Override
	public List<PerfumesDTO> getAllPerfumesDetails() {
		
		return perfumesDAO.getAllPerfumesDetails();
	}


	@Override
	public PerfumesDTO getAllDetailsById(int id) {
		if(id>0) {
			return perfumesDAO.getAllDetailsById(id);
		}
		return null;
	}


	@Override
	public String getNameByPrice(double price) {
		if(price>0) {
			return perfumesDAO.getNameByPrice(price);
		}
		return null;
	}


	@Override
	public Object[] getCompanyNameExpDateById(int id) {
		if(id>0)
		{
			return perfumesDAO.getCompanyNameExpDateById(id);
		}
		return null;
	}


	@Override
	public List getPerfumeNameAndExpDateById(Object[] id) {
		
		return perfumesDAO.getPerfumeNameAndExpDateById(id);
	}

}
