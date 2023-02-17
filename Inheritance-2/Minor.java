package person;

public class Minor extends YoungAdult{
	
	int gradeLevel;
	
	Minor(String name, String gender, int age, int kabit, int gradeLevel){
		super(name,gender,age,kabit);
		this.gradeLevel = gradeLevel;
	}
	
	void sayGradeLevel() {
		System.out.println("I'am grade : " + gradeLevel);
	}

}
