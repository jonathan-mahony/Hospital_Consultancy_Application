import java.util.ArrayList;

public class Patient extends Person {

	ArrayList<Visit> Patient_Visit = new ArrayList<Visit>();
	private String Illness;
	private int patientSeverity;
	enum Severity {
		one,
		two,
		three,
		four,
		five
	}
		
	public Patient(String id, String phone, String name , String Illness, int patientSeverity) {
		super(name, id, phone);
		this.Illness = Illness;
		this.patientSeverity = patientSeverity;
	}

	public String getIllness() {
		return Illness;
	}

	public void setIllness(String illness) {
		Illness = illness;
	}

	public void addPatient_Visit(Visit newPatient_Visit) {
		Patient_Visit.add(newPatient_Visit);
	}
	
	public void showAllPatient_Visits() {
		for (int i = 0; i <= Patient_Visit.size()-1; i++)
			System.out.println(Patient_Visit.get(i));
	}	

	public int getPatientSeverity() {
		return patientSeverity;
	}

	public void setPatientSeverity(int patientSeverity) {
		this.patientSeverity = patientSeverity;
	}

	public String toString() {
		return "Patient [ID = " + id + ", Phone = " + phone + ", Severitiy = " + patientSeverity + ", Illness = " + Illness + ", Name = " + name + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (Illness == null) {
			if (other.Illness != null)
				return false;
		} else if (!Illness.equals(other.Illness))
			return false;
		if (Patient_Visit == null) {
			if (other.Patient_Visit != null)
				return false;
		} else if (!Patient_Visit.equals(other.Patient_Visit))
			return false;
		if (patientSeverity != other.patientSeverity)
			return false;
		return true;
	}
	
	
	
}
