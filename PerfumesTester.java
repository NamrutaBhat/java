package com.xworkz.perfumes;

import com.xworkz.perfumes.dto.PerfumesDTO;
import com.xworkz.perfumes.service.PerfumesService;
import com.xworkz.perfumes.service.PerfumesServiceImpl;

public class PerfumesTester {

	public static void main(String[] args) {
		PerfumesDTO perfumesDTO=new PerfumesDTO();
		perfumesDTO.setPerfumesId(2);
		perfumesDTO.setPerfumeName("yardley");
		perfumesDTO.setCompanyName("India");
		perfumesDTO.setPrice(300.00);
		perfumesDTO.setExpDate("20/07/2021");
		
		PerfumesService perfumesService=new PerfumesServiceImpl();
		perfumesService.createAndValidatePerfumes(perfumesDTO);

	}

}
