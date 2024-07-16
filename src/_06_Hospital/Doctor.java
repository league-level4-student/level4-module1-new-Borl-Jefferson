package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> pat = new ArrayList<Patient>();
	public void assignPatient(Patient p){
		pat.add(p);
	}
	public ArrayList<Patient> getPatients() {
		return pat;
	}
}
