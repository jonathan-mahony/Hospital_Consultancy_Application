import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Practice Practice1 = new Practice();
		System.out.println("Practice Created");
		
		Consultant consultant1 = new Consultant("12", "0860317434", "Jim" , "Cardiology");
		Consultant consultant2 = new Consultant("13", "0891234673", "John" , "Cancer");
		Consultant consultant3 = new Consultant( "14", "0851927393", "Patrick" , "Phsyio");
		
		Patient patient1 = new Patient("25", "0860317494", "James" ,"Heart Problems", 3);
		Patient patient2 = new Patient("26", "0872291494", "Darragh" , "corona", 5);
		Patient patient3 = new Patient("27", "0860317492", "Max" ,"Pulled ligaments", 1);
		
		Visit visit1 = new Visit("Initial Consultation", "23/03/2018");
		Visit visit2 = new Visit("Covid test", "12/08/2020");
		Visit visit3 = new Visit("Patient must return in two weeks", "05/11/2020");
		
		
		Practice1.addConsultant(consultant1);
		Practice1.addConsultant(consultant2);
		Practice1.addConsultant(consultant3);
		
		consultant1.addPatient(patient1);
		consultant2.addPatient(patient2);
		consultant3.addPatient(patient3);
		
		patient1.addPatient_Visit(visit1);
		patient2.addPatient_Visit(visit2);
		patient3.addPatient_Visit(visit3);
		
//		
//		
//		System.out.println(" ");
//		
//		System.out.println("Adds 3/4 consultants");
//		Practice1.showAllConsultants();
//		System.out.println(" ");
//		
//		System.out.println("Adds patients consultants");
//		Practice1.showAllPatient();
//		System.out.println(" ");
//		
//		System.out.println("Adds patients Visits");
//		consultant1.showAllPatientVisits();
//		consultant2.showAllPatientVisits();
//		consultant3.showAllPatientVisits();
//		
//		System.out.println(" ");
//		System.out.println("Finds Consultant + Patient ");
//		System.out.println(Practice1.findConsultant("12"));
//		System.out.println(Practice1.findPatient("13"));
		
		
		int response;
		String notes;
		String date;
		Scanner scan = new Scanner(System.in);
		System.out.println("**Menu**");
		do {
			System.out.println();
			System.out.println("[1]-Record a patients visit");
			System.out.println("[2]-Display all patients of particular consultant");
			System.out.println("[3]-Display all consultants and their patients");
			System.out.println("[4]-Load information from txt file");
			System.out.println("[5]-Quit");
			System.out.println("Enter choice [1,2,3,4,5]:");
			response = scan.nextInt();
			System.out.println();
			
			switch(response) {
			case 1:
				System.out.println("Enter patient ID for new visit:(25,26 or 27)");
				String patientId = scan.next();
				Patient vpatient = Practice1.findPatient(patientId);
				System.out.println("Input Note: ");
				notes = scan.next();
				System.out.println("Input date (dd/mm/year): ");
				date = scan.next();
				Visit visit = new Visit(notes,date);
				vpatient.addPatient_Visit(visit);
				vpatient.showAllPatient_Visits();
				break;
				
			case 2:
				System.out.println("Enter consultant id:");
				String consultantId = scan.next();
				Consultant cons = Practice1.findConsultant(consultantId);				
				cons.showAllPatient();
				break;
				
			case 3:
				Practice1.showAllConsultants();
				Practice1.showAllPatient();
				break;
				
			case 4:	
					try {
				      File read_file = new File("src\\Practice");
				      Scanner Read = new Scanner(read_file);
				      	while (Read.hasNextLine()) {
				      		String elements = Read.nextLine();
				      		System.out.println(elements);
				      }				      
				      Read.close();
				    }				
				catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }  			
				
				break;
				
			case 5:
				System.out.println("Thank you Good Bye");
				return;
		}
	

	}
		while (response != 5);
			System.out.println("Error");
		
	}
}
