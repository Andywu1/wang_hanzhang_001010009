package edu.neu.info5100.assignment2.part1;

import java.util.Scanner;

public class Patient {
	
	public static boolean isPatientNormal(VitalSigns vs) {
		boolean result = true;
		if (vs.getAge()==0) {
			System.out.println("Patient age group: New Born");
			if (vs.getrRate()>=30&&vs.getrRate()<=50&&vs.gethRate()>=120&&vs.gethRate()<=160&&vs.getBlood()>=50&&vs.getBlood()<=70&&vs.getWeight()>=2&&vs.getWeight()<=3) {
				result = true;
			}
			else result=false;
		}
		else if (vs.getAge()>0 && vs.getAge()<1) {
			System.out.println("Patient age group: Infant");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=80&&vs.gethRate()<=140&&vs.getBlood()>=70&&vs.getBlood()<=100&&vs.getWeight()>=4&&vs.getWeight()<=10) {
				result = true;
			}
			else result= false;
		}
		else if (vs.getAge()>=1 && vs.getAge()<3) {
			System.out.println("Patient age group: Toddler");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=80&&vs.gethRate()<=130&&vs.getBlood()>=80&&vs.getBlood()<=110&&vs.getWeight()>=10&&vs.getWeight()<=14) {
				result = true;
			}
			else result = false;
		}
		else if (vs.getAge()>=3 && vs.getAge()<=5) {
			System.out.println("Patient age group: Preschooler");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=80&&vs.gethRate()<=120&&vs.getBlood()>=80&&vs.getBlood()<=110&&vs.getWeight()>=14&&vs.getWeight()<=18) {
				result = true;
			}
			else result = false;
		}
		else if (vs.getAge()>=6 && vs.getAge()<=12) {
			System.out.println("Patient age group: School Age");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=70&&vs.gethRate()<=110&&vs.getBlood()>=80&&vs.getBlood()<=120&&vs.getWeight()>=20&&vs.getWeight()<=42) {
				result = true;
			}
			else result = false;
		}
		else if (vs.getAge()>=13) {
			System.out.println("Patient age group: Adolescent");
			if (vs.getrRate()>=12&&vs.getrRate()<=20&&vs.gethRate()>=50&&vs.gethRate()<=105&&vs.getBlood()>=110&&vs.getBlood()<=120&&vs.getWeight()>=50) {
				result = true;
			}
			else return false;
		}
		return result;
	}

	public static void main(String[] args) {
		// NEW BORN TEST CASE
		VitalSigns patient1 = new VitalSigns(0,40,130,60,2.5);
		System.out.println("Patient NEWBORN: Respiratory rate "+patient1.getrRate()+"\tHeart Rate "+ patient1.gethRate()+ "\tBlood Pressure "+ patient1.getBlood()+"\tWeight in kilo "+ patient1.getWeight());
		boolean test1 = isPatientNormal(patient1);
		if (test1== true) {
	    	System.out.println("Patient is fine! No worry!\n");
	    }
	    else System.out.println("The patient is ill!\n");	
		
		// INFANT TEST CASE
		VitalSigns patient2 = new VitalSigns(0.5,25,90,80,5);
		System.out.println("Patient Abnormal: Respiratory rate "+patient2.getrRate()+"\tHeart Rate "+ patient2.gethRate()+ "\tBlood Pressure "+ patient2.getBlood()+"\tWeight in kilo "+ patient2.getWeight());
		boolean test2 = isPatientNormal(patient2);
		if (test2== true) {
	    	System.out.println("Patient is fine! No worry!\n");
	    }
	    else System.out.println("The patient is ill!\n");
		
		// ABNORMAL PATIENT TEST CASE
		VitalSigns patient3 = new VitalSigns(100,25,90,80,100);
		System.out.println("Patient INFANT: Respiratory rate "+patient3.getrRate()+"\tHeart Rate "+ patient3.gethRate()+ "\tBlood Pressure "+ patient3.getBlood()+"\tWeight in kilo "+ patient2.getWeight());
		boolean test3 = isPatientNormal(patient3);
		if (test3== true) {
	    	System.out.println("Patient is fine! No worry!\n");
	    }
	    else System.out.println("The patient is ill!\n");
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    VitalSigns vs = new VitalSigns();
	    System.out.println("*If patient is a newborn, enter 0 for patient age.");
	    System.out.println("*If patient is less than 1 year old, enter approximate age in float(unit: year).");
	    System.out.println("For example, 6 month patient should enter 0.5");
		System.out.println("Please enter the patient age(year):");
	    double age = myObj.nextFloat();
		System.out.println("Please enter patient's respiratory rate: ");
		double rRate = myObj.nextFloat();
		System.out.println("Please enter patient's heart rate: ");
		double hRate = myObj.nextFloat();
		System.out.println("Please enter patient's blood pressure: ");
		double blood = myObj.nextFloat();
		System.out.println("Please enter patient's  weight: ");
		double weight = myObj.nextFloat();
	    vs.setAge(age);
	    vs.setrRate(rRate);
	    vs.sethRate(hRate);
	    vs.setBlood(blood);
	    vs.setWeight(weight);
	    //System.out.println("Username is: " + userName);  // Output user input
	    myObj.close();
	    
	    boolean result = isPatientNormal(vs);
	    if (result== true) {
	    	System.out.println("Patient is fine! No worry!");
	    }
	    else System.out.println("The patient is ill!");	
	    
	}
	
	

}
