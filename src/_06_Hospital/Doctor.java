package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Doctor {
	ArrayList<Patient> pat = new ArrayList<Patient>();
	public void assignPatient(Patient p) throws DoctorFullException{
	
			if(pat.size()>=3) {
				throw new DoctorFullException();
			}
			else {
				pat.add(p);
			}
		
			
		
	}
	public ArrayList<Patient> getPatients() {
		return pat;
	}
	
	public void doMedicine() {
		for (int i=0; i<pat.size(); i++) {
			pat.get(i).checkPulse();
		}
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	public boolean performsSurgery() {
		return false;
	}

}
