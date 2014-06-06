package it.rn14.managerlab.lab;

import java.util.ArrayList;
import java.util.List;

import it.rn14.managerlab.proxyobj.Lab;
import it.rn14.managerlab.proxyobj.Rover;

public class LabDettaglio {
	
	private Lab lab;

	public Lab getLab() {
		
		
		lab = new Lab();
		lab.setTitle("Lab test");
		
		popolateLabForTest(lab);
		return lab;
	}

	private void popolateLabForTest(Lab lab) {
		ArrayList<Rover> partecipanti = new ArrayList<Rover>();
		for (int i = 0; i < 35; i++) {
			Rover rover = new Rover();
			rover.setAge(i);
			rover.setName("name" + i);
			rover.setSurname("surname" + i);
			partecipanti.add(rover);
		}
		lab.setPartecipant1(partecipanti);
		lab.setPartecipant2(partecipanti);
		lab.setPartecipant3(partecipanti);
	}

	public void setLab(Lab lab) {
		this.lab = lab;
	}
	
	

}
