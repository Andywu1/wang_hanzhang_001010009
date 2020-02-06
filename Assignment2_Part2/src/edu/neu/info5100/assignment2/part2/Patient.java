package edu.neu.info5100.assignment2.part2;

import java.util.Scanner;

import java.util.ArrayList;

public class Patient {
	
	private ArrayList<VitalSigns> vsh;
    
    public Patient() {
        this.vsh = new ArrayList<VitalSigns>();
    }
    
    public void addToVsh(VitalSigns vs){
        vsh.add(vs);
    }
	
	public ArrayList<VitalSigns> getVsh() {
		return vsh;	
	}

	public void setVsh(ArrayList<VitalSigns> vsh) {
		this.vsh = vsh;
	}

	public static void isPatientNormal(VitalSigns vs) {
		boolean result = true;
		if (vs.getAge()==0) {
			System.out.println("Patient age group: New Born");
			if (vs.getrRate()>=30&&vs.getrRate()<=50&&vs.gethRate()>=120&&vs.gethRate()<=160&&vs.getBlood()>=50&&vs.getBlood()<=70&&vs.getWeight()>=2&&vs.getWeight()<=3&&vs.getPound()>=4.5&&vs.getPound()<=7) {
				result = true;
			}
			else result=false;
		}
		else if (vs.getAge()>0 && vs.getAge()<1) {
			System.out.println("Patient age group: Infant");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=80&&vs.gethRate()<=140&&vs.getBlood()>=70&&vs.getBlood()<=100&&vs.getWeight()>=4&&vs.getWeight()<=10&&vs.getPound()>=9&&vs.getPound()<=22) {
				result = true;
			}
			else result= false;
		}
		else if (vs.getAge()>=1 && vs.getAge()<3) {
			System.out.println("Patient age group: Toddler");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=80&&vs.gethRate()<=130&&vs.getBlood()>=80&&vs.getBlood()<=110&&vs.getWeight()>=10&&vs.getWeight()<=14&&vs.getPound()>=22&&vs.getPound()<=31) {
				result = true;
			}
			else result = false;
		}
		else if (vs.getAge()>=3 && vs.getAge()<=5) {
			System.out.println("Patient age group: Preschooler");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=80&&vs.gethRate()<=120&&vs.getBlood()>=80&&vs.getBlood()<=110&&vs.getWeight()>=14&&vs.getWeight()<=18&&vs.getPound()>=31&&vs.getPound()<=40) {
				result = true;
			}
			else result = false;
		}
		else if (vs.getAge()>=6 && vs.getAge()<=12) {
			System.out.println("Patient age group: School Age");
			if (vs.getrRate()>=20&&vs.getrRate()<=30&&vs.gethRate()>=70&&vs.gethRate()<=110&&vs.getBlood()>=80&&vs.getBlood()<=120&&vs.getWeight()>=20&&vs.getWeight()<=42&&vs.getPound()>=41&&vs.getPound()<=92) {
				result = true;
			}
			else result = false;
		}
		else if (vs.getAge()>=13) {
			System.out.println("Patient age group: Adolescent");
			if (vs.getrRate()>=12&&vs.getrRate()<=20&&vs.gethRate()>=50&&vs.gethRate()<=105&&vs.getBlood()>=110&&vs.getBlood()<=120&&vs.getWeight()>=50&&vs.getPound()>=110) {
				result = true;
			}
			else result = false;
		}
		if (result== true) {
    		System.out.println("Patient "+vs.getName()+ " is fine! No worry!");
    	}
    	else System.out.println("Patient "+vs.getName()+" is ill!");
	}

	public static void isThisVitalSignNormal(String vitals, VitalSigns vs) {
		boolean result = false;
		if (vitals.equalsIgnoreCase("respiratoryrate")) {

			if (vs.getAge()==0) {
				System.out.println("Patient age group: New Born");
				if (vs.getrRate()>=30&&vs.getrRate()<=50) result = true;
				else result=false;
			}
			else if (vs.getAge()>0 && vs.getAge()<1) {
				System.out.println("Patient age group: Infant");
				if (vs.getrRate()>=20&&vs.getrRate()<=30) result = true;
				else result= false;
			}
			else if (vs.getAge()>=1 && vs.getAge()<3) {
				System.out.println("Patient age group: Toddler");
				if (vs.getrRate()>=20&&vs.getrRate()<=30) result = true;
				else result = false;
			}
			else if (vs.getAge()>=3 && vs.getAge()<=5) {
				System.out.println("Patient age group: Preschooler");
				if (vs.getrRate()>=20&&vs.getrRate()<=30) result = true;
				else result = false;
			}
			else if (vs.getAge()>=6 && vs.getAge()<=12) {
				System.out.println("Patient age group: School Age");
				if (vs.getrRate()>=20&&vs.getrRate()<=30) {
					result = true;
				}
				else result = false;
			}
			else if (vs.getAge()>=13) {
				System.out.println("Patient age group: Adolescent");
				if (vs.getrRate()>=12&&vs.getrRate()<=20) {
					result = true;
				}
				else result = false;
			}
		}
		else if (vitals.equalsIgnoreCase("heartrate")) {
			if (vs.getAge()==0) {
				System.out.println("Patient age group: New Born");
				if (vs.gethRate()>=120&&vs.gethRate()<=160) result = true;
				else result=false;
			}
			else if (vs.getAge()>0 && vs.getAge()<1) {
				System.out.println("Patient age group: Infant");
				if (vs.gethRate()>=80&&vs.gethRate()<=140) result = true;
				else result= false;
			}
			else if (vs.getAge()>=1 && vs.getAge()<3) {
				System.out.println("Patient age group: Toddler");
				if (vs.gethRate()>=80&&vs.gethRate()<=130) result = true;
				else result = false;
			}
			else if (vs.getAge()>=3 && vs.getAge()<=5) {
				System.out.println("Patient age group: Preschooler");
				if (vs.gethRate()>=80&&vs.gethRate()<=120) result = true;
				else result = false;
			}
			else if (vs.getAge()>=6 && vs.getAge()<=12) {
				System.out.println("Patient age group: School Age");
				if (vs.gethRate()>=70&&vs.gethRate()<=110) {
					result = true;
				}
				else result = false;
			}
			else if (vs.getAge()>=13) {
				System.out.println("Patient age group: Adolescent");
				if (vs.gethRate()>=55&&vs.gethRate()<=105) {
					result = true;
				}
				else result = false;
			}
			else System.out.println("wrong!");
		}
		else if (vitals.equalsIgnoreCase("bloodpressure")) {

			if (vs.getAge()==0) {
				System.out.println("Patient age group: New Born");
				if (vs.getBlood()>=50&&vs.getBlood()<=70) result = true;
				else result=false;
			}
			else if (vs.getAge()>0 && vs.getAge()<1) {
				System.out.println("Patient age group: Infant");
				if (vs.getBlood()>=70&&vs.getBlood()<=100) result = true;
				else result= false;
			}
			else if (vs.getAge()>=1 && vs.getAge()<3) {
				System.out.println("Patient age group: Toddler");
				if (vs.getBlood()>=80&&vs.getBlood()<=110) result = true;
				else result = false;
			}
			else if (vs.getAge()>=3 && vs.getAge()<=5) {
				System.out.println("Patient age group: Preschooler");
				if (vs.getBlood()>=80&&vs.getBlood()<=110) result = true;
				else result = false;
			}
			else if (vs.getAge()>=6 && vs.getAge()<=12) {
				System.out.println("Patient age group: School Age");
				if (vs.getBlood()>=80&&vs.getBlood()<=120) {
					result = true;
				}
				else result = false;
			}
			else if (vs.getAge()>=13) {
				System.out.println("Patient age group: Adolescent");
				if (vs.getBlood()>=110&&vs.getBlood()<=120) {
					result = true;
				}
				else result = false;
			}
		}
		else if (vitals.equalsIgnoreCase("weightinkilo")) {

			if (vs.getAge()==0) {
				System.out.println("Patient age group: New Born");
				if (vs.getWeight()>=2&&vs.getWeight()<=3) result = true;
				else result=false;
			}
			else if (vs.getAge()>0 && vs.getAge()<1) {
				System.out.println("Patient age group: Infant");
				if (vs.getWeight()>=4&&vs.getWeight()<=10) result = true;
				else result= false;
			}
			else if (vs.getAge()>=1 && vs.getAge()<3) {
				System.out.println("Patient age group: Toddler");
				if (vs.getWeight()>=10&&vs.getWeight()<=14) result = true;
				else result = false;
			}
			else if (vs.getAge()>=3 && vs.getAge()<=5) {
				System.out.println("Patient age group: Preschooler");
				if (vs.getWeight()>=14&&vs.getWeight()<=18) result = true;
				else result = false;
			}
			else if (vs.getAge()>=6 && vs.getAge()<=12) {
				System.out.println("Patient age group: School Age");
				if (vs.getWeight()>=20&&vs.getWeight()<=42) {
					result = true;
				}
				else result = false;
			}
			else if (vs.getAge()>=13) {
				System.out.println("Patient age group: Adolescent");
				if (vs.getWeight()>=50) {
					result = true;
				}
				else result = false;
			}
		}
		else if (vitals.equalsIgnoreCase("weightinpounds")) {

			if (vs.getAge()==0) {
				System.out.println("Patient age group: New Born");
				if (vs.getPound()>=4.5&&vs.getPound()<=7) result = true;
				else result=false;
			}
			else if (vs.getAge()>0 && vs.getAge()<1) {
				System.out.println("Patient age group: Infant");
				if (vs.getPound()>=9&&vs.getPound()<=22) result = true;
				else result= false;
			}
			else if (vs.getAge()>=1 && vs.getAge()<3) {
				System.out.println("Patient age group: Toddler");
				if (vs.getPound()>=22&&vs.getPound()<=31) result = true;
				else result = false;
			}
			else if (vs.getAge()>=3 && vs.getAge()<=5) {
				System.out.println("Patient age group: Preschooler");
				if (vs.getPound()>=31&&vs.getPound()<=40) result = true;
				else result = false;
			}
			else if (vs.getAge()>=6 && vs.getAge()<=12) {
				System.out.println("Patient age group: School Age");
				if (vs.getPound()>=41&&vs.getPound()<=92) {
					result = true;
				}
				else result = false;
			}
			else if (vs.getAge()>=13) {
				System.out.println("Patient age group: Adolescent");
				if (vs.getPound()>=110) {
					result = true;
				}
				else result = false;
			}
		}
		if (result== true) {
    		System.out.println("Patient "+vs.getName()+ "'s "+ vitals +" is fine!");
    	}
    	else System.out.println("Patient "+vs.getName()+"'s "+ vitals +" is Abnormal!");
		
	}
	public static void main(String[] args) {
		// NEW BORN TEST CASE
		VitalSigns patient1 = new VitalSigns("John",0,40,130,60,2.5,5);
		System.out.println("Patient NEWBORN: Respiratory rate "+patient1.getrRate()+"\tHeart Rate "+ patient1.gethRate()+ "\tBlood Pressure "+ patient1.getBlood()+"\tWeight in kilo "+ patient1.getWeight()+"\tWeight in pounds "+ patient1.getPound());
		isPatientNormal(patient1);
		isThisVitalSignNormal("bloodpressure", patient1);
			
		
		// INFANT TEST CASE
		VitalSigns patient2 = new VitalSigns("Daniel",0.5,25,90,80,5,15);
		System.out.println("\nPatient INFANT: Respiratory rate "+patient2.getrRate()+"\tHeart Rate "+ patient2.gethRate()+ "\tBlood Pressure "+ patient2.getBlood()+"\tWeight in kilo "+ patient2.getWeight()+"\tWeight in pounds "+ patient2.getPound());
		isPatientNormal(patient2);
		isThisVitalSignNormal("weightinkilo", patient2);
		
		// ABNORMAL PATIENT TEST CASE
		VitalSigns patient3 = new VitalSigns("Renyi",100,25,90,80,100,100);
		System.out.println("\nPatient Abnormal: Respiratory rate "+patient3.getrRate()+"\tHeart Rate "+ patient3.gethRate()+ "\tBlood Pressure "+ patient3.getBlood()+"\tWeight in kilo "+ patient3.getWeight()+"\tWeight in pounds "+ patient3.getPound());
		isPatientNormal(patient3);
		isThisVitalSignNormal("weightinpounds", patient3);
		
		
		
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Patient  patient = new Patient();
        //TIPS
        System.out.println("TIPS:\n*If patient is a newborn, enter 0 for patient age.");
		System.out.println("*If patient is less than 1 year old, enter approximate age in float(unit: year).");
		System.out.println("For example, 6 month patient should enter 0.5");

		char response='Y';
	    while(response=='Y'){
	    	VitalSigns vs= new VitalSigns();
			System.out.println("Please enter the patient name:");
			String name = myObj.next();
			System.out.println("Please enter the patient age(year):");
			double age = myObj.nextFloat();
			System.out.println("Please enter patient's respiratory rate: ");
			double rRate = myObj.nextFloat();
			System.out.println("Please enter patient's heart rate: ");
			double hRate = myObj.nextFloat();
			System.out.println("Please enter patient's blood pressure: ");
			double blood = myObj.nextFloat();
			System.out.println("Please enter patient's  weight in kilo: ");
			double weight = myObj.nextFloat();
			System.out.println("Please enter patient's  weight in pounds: ");
			double pound = myObj.nextFloat();
			vs.setName(name);
			vs.setAge(age);
			vs.setrRate(rRate);
			vs.sethRate(hRate);
			vs.setBlood(blood);
			vs.setWeight(weight);
			vs.setPound(pound);
			isPatientNormal(vs);
			System.out.println("\nDo you want to input another record? Y/N:");
			response = myObj.next().charAt(0);
			if (response!='Y') {
				System.out.println("Which vital sign you want to check?");
				String vitals = "";
                vitals = myObj.next();
				isThisVitalSignNormal(vitals,vs);
				break;
			}
			else patient.addToVsh(vs);
	    }
	    
	    System.out.println("All Patients Vital Signs History:()");
	    for (VitalSigns output: patient.getVsh()) {
	    	System.out.println("Patient name: "+output.getName()+"\t"+output.getrRate()+"\t"+output.gethRate()+"\t"+output.getBlood()+"\t"+output.getWeight()+"\t"+output.getPound());
	    		
	    }
	    System.out.println("Done...");
	    myObj.close();
	}
	
	

}

