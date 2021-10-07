import java.util.ArrayList;


public class Practice {
	
	ArrayList<Consultant> consultant_list = new ArrayList<Consultant>();
	
	public Practice() {
		super();
	}


	public void addConsultant(Consultant newConsultant) {
		consultant_list.add(newConsultant);
	}
		
	
	public void showAllConsultants() {
		for (int i = 0; i <= consultant_list.size()-1; i++)
			System.out.println(consultant_list.get(i));
		
	}
	
	public void showAllPatient() {
		for (int j = 0; j <= consultant_list.size()-1; j++) {
			ArrayList<Patient> patient_list = consultant_list.get(j).getPatients();
				for (int i = 0; i <= patient_list.size()-1; i++)
					System.out.println(patient_list.get(i));
		}
	}
	
	
	public Consultant findConsultant(String consultantId) {
		for (int i = 0; i <= consultant_list.size()-1; i++) {
			if (consultant_list.get(i).getId().equals(consultantId))
				return consultant_list.get(i); 
		}
		return null;
	}
	
	
	public Patient findPatient(String patientId) {
		for (int j = 0; j <= consultant_list.size()-1; j++) {
			ArrayList<Patient> patient_list = consultant_list.get(j).getPatients();
			for (int i = 0; i <= patient_list.size()-1; i++) {
				if (patient_list.get(i).getId().equals(patientId))
					return patient_list.get(i); 
			}
		}
		return null;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Practice other = (Practice) obj;
		if (consultant_list == null) {
			if (other.consultant_list != null)
				return false;
		} else if (!consultant_list.equals(other.consultant_list))
			return false;
		return true;
	}

	public String toString() {
		return "Practice [consultant_list=" + consultant_list + "]";
	}
	

}

	
