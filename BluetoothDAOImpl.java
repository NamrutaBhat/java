package com.xworkz.bluetooth.bluetooth_speaker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bluetooth.bluetooth_speaker.dto.BluetoothSpeakerDTO;

public class BluetoothDAOImpl implements BluetoothDAO{
	
	@Override
	public void save(BluetoothSpeakerDTO bluetoothSpeakerDTO) {
	
	Configuration configuration=new Configuration();
	configuration.configure();
	configuration.addAnnotatedClass(BluetoothSpeakerDTO.class);
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(bluetoothSpeakerDTO);
	transaction.commit();
	session.close();
	factory.close();
}
	@Override
	public BluetoothSpeakerDTO getgetBluetoothById(int id) {
	
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BluetoothSpeakerDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		BluetoothSpeakerDTO bluetoothSpeakerDTO1=session.get(BluetoothSpeakerDTO.class,id);
		session.close();
		factory.close();
		return bluetoothSpeakerDTO1;
		
	}
	@Override
	public void deleteById(int id) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BluetoothSpeakerDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		BluetoothSpeakerDTO bluetoothSpeakerDTO2 = session.get(BluetoothSpeakerDTO.class,id);
		Transaction transaction = session.beginTransaction();
		session.delete(bluetoothSpeakerDTO2 );
		transaction.commit();
		session.close();
		factory.close();
		
	}
	@Override
	public void updateRangeById(int id, String range) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BluetoothSpeakerDTO.class);
		SessionFactory factory =configuration.buildSessionFactory();
		Session session = factory.openSession();
		BluetoothSpeakerDTO bluetoothSpeakerDTO3 = session.get(BluetoothSpeakerDTO.class,id);
		bluetoothSpeakerDTO3.setRange(range);
		Transaction transaction = session.beginTransaction();
		session.update(bluetoothSpeakerDTO3);
		transaction.commit();
		session.close();
		factory.close();
		
	}
	
	

}
