package person;

public class YoungAdult extends Person{
	
	int kabit;
	
	YoungAdult(String name, String gender, int age,int kabit){
		super(name,gender,age);
		this.kabit = kabit;
	}
	
	void drink() {
		System.out.println(name +" Is Drinking alcohol");
	}
	
	void checkStatus() {
		super.checkStatus();
		System.out.println("kabit counts : " + kabit);
		
	}

}
