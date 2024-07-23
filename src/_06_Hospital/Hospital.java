package _06_Hospital;

import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
	
	/* 5. Create a Hospital class capable of holding lists of Doctors and unassigned 
	 * Patients, adding to both lists and assigning up to a maximum of 3 Patients to
	 *  Doctors.
	 * 
	 * 6. Create a DoctorFullException. A Doctor should throw this exception 
	 * whenever more than three patients are being assigned to them.
	 */
	
	ArrayList <Doctor> docs = new ArrayList <Doctor>();
	ArrayList <Patient> pats = new ArrayList <Patient>();
	
	public void addDoctor(Doctor d) {
		docs.add(d);
		
	}
	
	public void addPatient(Patient p) {
		pats.add(p);
	}
	
	public ArrayList getDoctors() {
		return docs;
	}
	public ArrayList getPatients() {
		return pats;
	}
	
public void assignPatientsToDoctors() throws DoctorFullException {
	boolean go = true;
		int i=0;
		int j=0;
		int c = pats.size();
	while(c>=3) {

			docs.get(i).assignPatient(pats.get(j));
			j++;
			docs.get(i).assignPatient(pats.get(j));
			j++;
			docs.get(i).assignPatient(pats.get(j));
			j++;
				i++;
		c-=3;
	}
		 if(pats.size()>0) {
			for(int k=0; k<c; k++) {
				docs.get(i).assignPatient(pats.get(j));
				j++;
			}	
		}
		else {
			go=false;
		}
		
	
	
	
}
}
