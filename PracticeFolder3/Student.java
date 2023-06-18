
public class Student {
	
	String firstname, lastname, year, course, section;
	float midtermgrade, finalgrade;
	
	Student(String firstname, 
			String lastname, 
			String year, 
			String course, 
			String section, 
			float midtermgrade, 
			float finalgrade){
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.year = year;
		this.course = course;
		this.section = section;
		this.midtermgrade = midtermgrade;
		this.finalgrade = finalgrade;
		
	}
	
	void IntroduceSelf() {
		System.out.println("Full Name: " + firstname + " " + lastname);
		System.out.println("Course: " + course);
		System.out.println("year: " + year);
		System.out.println("section: " + section);
	}
	void EvaluateGrade() {
		float average = (midtermgrade + finalgrade) / 2;
		System.out.println("Full Name: " + firstname + " " + lastname);
		System.out.println("Average: " + average);
		
		String remark;
		if(average > 100) remark = "Invalid Grade";
		else if(average >= 98) remark = "With Highest Honor";
		else if(average >= 95) remark = "With High Honors";
		else if(average >= 90) remark = "With Honors";
		else if(average >= 85) remark = "One of the Top 10";
		else if(average >= 75) remark = "Passed";
		else remark = "Failed";
		
		System.out.println("Remarks: " + remark);
		
 	}
}
