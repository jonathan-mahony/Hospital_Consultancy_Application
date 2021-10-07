import java.util.ArrayList;

public class Consultant extends Person {
	
	private String Expertise;
	ArrayList<Patient> Patient_list = new ArrayList<Patient>();
	

	public Consultant(String id, String phone, String name, String expertise) {
		super(name, id, phone);
		this.Expertise = expertise;
	}


	public void addPatient(Patient newPatient) {
		Patient_list.add(newPatient);
	}
	
	public ArrayList<Patient> getPatients() {
		return Patient_list;
	}
	
	public void showAllPatient() {
		for (int i = 0; i <= Patient_list.size()-1; i++)
			System.out.println(Patient_list.get(i));
	}

	public String getExpertise() {
		return Expertise;
	}


	public void setExpertise(String expertise) {
		Expertise = expertise;
	}
	
	
	public void showAllPatientVisits() {
		for (int j = 0; j <= Patient_list.size()-1; j++) {
			ArrayList<Visit> Patient_Visit = Patient_list.get(j).Patient_Visit;
				for (int i = 0; i <= Patient_Visit.size()-1; i++)
					System.out.println(Patient_Visit.get(i));
		}
	}
			

	
	
	public String toString() {
		return "Consultant [Expertise =" + Expertise + ", Number of Patients = " + Patient_list.size() + ", Name = " + name + ", id = " + id
				+ ", phone =" + phone + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultant other = (Consultant) obj;
		if (Expertise == null) {
			if (other.Expertise != null)
				return false;
		} else if (!Expertise.equals(other.Expertise))
			return false;
		if (Patient_list == null) {
			if (other.Patient_list != null)
				return false;
		} else if (!Patient_list.equals(other.Patient_list))
			return false;
		return true;
	}

	

	
	
		
}
