package it.rn14.managerlab.proxyobj;

import java.io.Serializable;

import it.rn14.managerlab.Event;

public class Rover implements Serializable {

	/** Nome del rs */
	private String name;
	/** Cognome del rs */
	private String surname;
	/** Codice censimento del rs */
	private double code;
	/** Eta del rs */
	private int age;
	/** Gruppo di appartenenza del rs */
	private Group group;
	
	/** Il rs e' portatore di handicap */
	private boolean handicap;
	/** Il rs e' un novizio */
	private boolean novice;

	/** Il rs ha indicato la preferenza per la 1a strada di coraggio? */
	private boolean road1;
	/** Il rs ha indicato la preferenza per la 2a strada di coraggio? */
	private boolean road2;
	/** Il rs ha indicato la preferenza per la 3a strada di coraggio? */
	private boolean road3;
	/** Il rs ha indicato la preferenza per la 4a strada di coraggio? */
	private boolean road4;
	/** Il rs ha indicato la preferenza per la 5a strada di coraggio? */
	private boolean road5;
	
	/** Primo evento assegnato */
	private Event assign1;
	/** Secondo evento assegnato */
	private Event assign2;
	/** Terzo evento assegnato */
	private Event assign3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getCode() {
		return code;
	}
	public void setCode(double code) {
		this.code = code;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public boolean isHandicap() {
		return handicap;
	}
	public void setHandicap(boolean handicap) {
		this.handicap = handicap;
	}
	public boolean isNovice() {
		return novice;
	}
	public void setNovice(boolean novice) {
		this.novice = novice;
	}
	public boolean isRoad1() {
		return road1;
	}
	public void setRoad1(boolean road1) {
		this.road1 = road1;
	}
	public boolean isRoad2() {
		return road2;
	}
	public void setRoad2(boolean road2) {
		this.road2 = road2;
	}
	public boolean isRoad3() {
		return road3;
	}
	public void setRoad3(boolean road3) {
		this.road3 = road3;
	}
	public boolean isRoad4() {
		return road4;
	}
	public void setRoad4(boolean road4) {
		this.road4 = road4;
	}
	public boolean isRoad5() {
		return road5;
	}
	public void setRoad5(boolean road5) {
		this.road5 = road5;
	}
	public Event getAssign1() {
		return assign1;
	}
	public void setAssign1(Event assign1) {
		this.assign1 = assign1;
	}
	public Event getAssign2() {
		return assign2;
	}
	public void setAssign2(Event assign2) {
		this.assign2 = assign2;
	}
	public Event getAssign3() {
		return assign3;
	}
	public void setAssign3(Event assign3) {
		this.assign3 = assign3;
	}

}
