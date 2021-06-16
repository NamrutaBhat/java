package com.xworkz.bluetooth.bluetooth_speaker.service;

import com.xworkz.bluetooth.bluetooth_speaker.dao.BluetoothDAO;
import com.xworkz.bluetooth.bluetooth_speaker.dao.BluetoothDAOImpl;
import com.xworkz.bluetooth.bluetooth_speaker.dto.BluetoothSpeakerDTO;

public class BluetoothServiceImpl implements BluetoothService {

	
	
	private BluetoothDAO  bluetoothDAO;
	
	
	public BluetoothServiceImpl()
	{
		bluetoothDAO=new BluetoothDAOImpl();
	}

	@Override
	public void validateAndSave(BluetoothSpeakerDTO bluetoothSpeakerDTO) {
		
		if(bluetoothSpeakerDTO!=null) {
			if(bluetoothSpeakerDTO.getRange()!=null)
			{
				bluetoothDAO.save(bluetoothSpeakerDTO);
				
	        }
			
	      }

      }

	@Override
	public BluetoothSpeakerDTO getBluetoothById(int id) {
		
	if(id > 0) {
		return bluetoothDAO.getgetBluetoothById(id);
	}
	return null;
	}

	@Override
	public void deleteById(int id) {
		if(id>0) {
			bluetoothDAO.deleteById(id);
			
		}
		else {
			System.out.println("cant delete this file");
		}
		
	}

	@Override
	public void updateRangeById(int id, String range) {
if(id!=0) {
			
	bluetoothDAO.updateRangeById(id,range);
		}
		else {
			System.out.println("give the proper id");
		     }
		
	}
	
	
	
	
  }
	

