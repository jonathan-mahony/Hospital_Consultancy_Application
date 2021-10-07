import java.util.Date;

public class Visit {
	
	private String notes;
	private String date_of_visit;
	
	public Visit(String notes, String date_of_visit) {
		super();
		this.notes = notes;
		this.date_of_visit = date_of_visit;
	}
	
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDate_of_visit() {
		return date_of_visit;
	}
	public void setDate_of_visit(String date_of_visit) {
		this.date_of_visit = date_of_visit;
	}
	
	public String toString() {
		return "Visit [Notes=" + notes + ", Date=" + date_of_visit + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visit other = (Visit) obj;
		if (date_of_visit == null) {
			if (other.date_of_visit != null)
				return false;
		} else if (!date_of_visit.equals(other.date_of_visit))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

}
