package it.rn14.managerlab.lab;

import java.util.ArrayList;
import java.util.List;

import it.rn14.managerlab.proxyobj.Lab;
import it.rn14.managerlab.proxyobj.Rover;

public class LabDettaglio {
	
	private Lab lab;
	private Integer slot;

	public Lab getLab() {
		
		
		lab = new Lab();
		lab.setTitle("Lab test");
		
		popolateLabForTest(lab,1);
		popolateLabForTest(lab,2);
		popolateLabForTest(lab,3);
		return lab;
	}

	private void popolateLabForTest(Lab lab, int slot) {
		ArrayList<Rover> partecipanti = new ArrayList<Rover>();
		for (int i = 0; i < 35; i++) {
			Rover rover = new Rover();
			rover.setAge(i);
			rover.setName("name " + i + " Slot " + slot);
			rover.setSurname("surname " + i);
			partecipanti.add(rover);
		}
		if(slot==1)	lab.setPartecipant1(partecipanti);
		if(slot==2)	lab.setPartecipant2(partecipanti);
		if(slot==3)	lab.setPartecipant3(partecipanti);
	}

	public void setLab(Lab lab) {
		this.lab = lab;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	
	

}
