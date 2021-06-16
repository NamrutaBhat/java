package com.xworkz.bluetooth.bluetooth_speaker.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bluetooth_speaker")
public class BluetoothSpeakerDTO implements Serializable{

	
	

		@Id
		@Column(name="bluetooth_id")
		private int bluetoothId;
		
		@Column(name="bluetooth_name")
		private String bluetoothSpeakerName;
		
		@Column(name="bluetooth_company_name")
		private String companyName;
		
		@Column(name="bluetooth_range")
		private String  range;
		
		public BluetoothSpeakerDTO()
		{
			
		}
		
		
		public int getBluetoothId() {
			return bluetoothId;
		}
		public void setBluetoothId(int bluetoothId) {
			this.bluetoothId = bluetoothId;
		}
		public String getBluetoothSpeakerName() {
			return bluetoothSpeakerName;
		}
		public void setBluetoothSpeakerName(String bluetoothSpeakerName) {
			this.bluetoothSpeakerName = bluetoothSpeakerName;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getRange() {
			return range;
		}
		public void setRange(String range) {
			this.range = range;
		}


		@Override
		public String toString() {
			return "BluetoothSpeakerDTO [bluetoothId=" + bluetoothId + ", bluetoothSpeakerName=" + bluetoothSpeakerName
					+ ", companyName=" + companyName + ", range=" + range + "]";
		}
		
		
		
		
}
