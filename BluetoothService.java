package com.xworkz.bluetooth.bluetooth_speaker.service;

import com.xworkz.bluetooth.bluetooth_speaker.dto.BluetoothSpeakerDTO;

public interface BluetoothService {

	
	public void validateAndSave(BluetoothSpeakerDTO  bluetoothSpeakerDTO);
	public BluetoothSpeakerDTO getBluetoothById(int id);
	public void deleteById(int id);
	public void updateRangeById(int id,String range);
	
}
