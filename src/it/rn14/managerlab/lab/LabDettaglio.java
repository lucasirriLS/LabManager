package it.rn14.managerlab.lab;

import it.rn14.managerlab.proxyobj.Group;
import it.rn14.managerlab.proxyobj.Lab;
import it.rn14.managerlab.proxyobj.Rover;

import java.util.ArrayList;

import javax.faces.event.ValueChangeEvent;

public class LabDettaglio {
	
	private Lab lab;
	private Integer slot = 1;

	public Lab getLab() {
		
		
		lab = new Lab();
		lab.setTitle("Lab test");
		
		popolateLabForTest(lab,1);
		popolateLabForTest(lab,2);
		popolateLabForTest(lab,3);
		return lab;
	}
	
	public void cambioslot(ValueChangeEvent e){
		System.out.println("LabDettaglio.valueChangeMethod()" + e.getNewValue().toString());
	}

	private void popolateLabForTest(Lab lab, int slot) {
		ArrayList<Rover> partecipanti = new ArrayList<Rover>();
		int limit = 35 - slot;
		for (int i = 0; i < limit; i++) {
			Rover rover = new Rover();
			rover.setAge(i);
			rover.setName("name " + i + " Slot " + slot);
			rover.setSurname("surname " + i);
			rover.setGroup(new Group("gruppo X", 123));
			partecipanti.add(rover);
		}
		if(slot==1)	lab.setPartecipant1(partecipanti);
		if(slot==2)	lab.setPartecipant2(partecipanti);
		if(slot==3)	lab.setPartecipant3(partecipanti);
	}
	
	public Integer getNumeroPartecipanti(){
		ArrayList<Rover> rovers = getPartecipanti();
		if(rovers!=null) return rovers.size();
		else return 0;
	}
	
	public ArrayList<Rover> getPartecipanti(){
		if(slot==null) slot=1;
		if(lab==null) lab=getLab();
		
		if(slot==1)	
			return (ArrayList<Rover>) lab.getPartecipant1();	
		if(slot==2)	
			return (ArrayList<Rover>) lab.getPartecipant2();
		if(slot==3)	
			return (ArrayList<Rover>) lab.getPartecipant3();
		
		return null;
		
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
