package com.xworkz.bluetooth.bluetooth_speaker.dao;

import com.xworkz.bluetooth.bluetooth_speaker.dto.BluetoothSpeakerDTO;

public interface BluetoothDAO {

	public void save(BluetoothSpeakerDTO bluetoothSpeakerDTO);
	public BluetoothSpeakerDTO getgetBluetoothById(int id);
	public void deleteById(int id);
	public void updateRangeById(int id,String range);

	
}
