package it.rn14.managerlab.proxyobj;

import it.rn14.managerlab.Event;

public class Rover  {

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

}
