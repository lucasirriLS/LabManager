package it.rn14.managerlab;

import it.rn14.managerlab.proxyobj.Group;
import it.rn14.managerlab.proxyobj.Rover;

import java.util.List;

public class Event {

	private String name;
	private int road;
	
	private int maxpartecipant;
	private int minpartecipant;
	
	private Group organizer;
	
	private List<Rover> partecipant1;
	private List<Rover> partecipant2;
	private List<Rover> partecipant3;
	
	private int workingday = 1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoad() {
		return road;
	}

	public void setRoad(int road) {
		this.road = road;
	}

	public int getMaxpartecipant() {
		return maxpartecipant;
	}

	public void setMaxpartecipant(int maxpartecipant) {
		this.maxpartecipant = maxpartecipant;
	}

	public int getMinpartecipant() {
		return minpartecipant;
	}

	public void setMinpartecipant(int minpartecipant) {
		this.minpartecipant = minpartecipant;
	}

	public Group getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Group organizer) {
		this.organizer = organizer;
	}

	public List<Rover> getPartecipant1() {
		return partecipant1;
	}

	public void setPartecipant1(List<Rover> partecipant1) {
		this.partecipant1 = partecipant1;
	}

	public List<Rover> getPartecipant2() {
		return partecipant2;
	}

	public void setPartecipant2(List<Rover> partecipant2) {
		this.partecipant2 = partecipant2;
	}

	public List<Rover> getPartecipant3() {
		return partecipant3;
	}

	public void setPartecipant3(List<Rover> partecipant3) {
		this.partecipant3 = partecipant3;
	}

	public int getWorkingday() {
		return workingday;
	}

	public void setWorkingday(int workingday) {
		this.workingday = workingday;
	}

}
