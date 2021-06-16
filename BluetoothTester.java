package com.xworkz.bluetooth.bluetooth_speaker;

import com.xworkz.bluetooth.bluetooth_speaker.dto.BluetoothSpeakerDTO;
import com.xworkz.bluetooth.bluetooth_speaker.service.BluetoothService;
import com.xworkz.bluetooth.bluetooth_speaker.service.BluetoothServiceImpl;

public class BluetoothTester {

	public static void main(String[] args) {
		
		BluetoothSpeakerDTO  bluetoothSpeakerDTO=new BluetoothSpeakerDTO();
		bluetoothSpeakerDTO.setBluetoothId(2);		
		bluetoothSpeakerDTO.setCompanyName("one-plus");
		bluetoothSpeakerDTO.setBluetoothSpeakerName("one-plus bullet wireless");
		bluetoothSpeakerDTO.setRange("5m");
		
		BluetoothService bluetoothService=new BluetoothServiceImpl();
		bluetoothService.validateAndSave(bluetoothSpeakerDTO);
		bluetoothService.getBluetoothById(1);
		bluetoothService.deleteById(3);
		bluetoothService.updateRangeById(2, "anusha");
		

	}

}
