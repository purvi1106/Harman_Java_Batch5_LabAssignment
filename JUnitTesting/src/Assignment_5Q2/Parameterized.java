package Assignment_5Q2;

public class Parameterized {
	private String name;
	private String about;
	private int birthYear;
	
	public Parameterized(String name, String about, int birthYear) {
		this.name = name;
		this.about = about;
		this.birthYear = birthYear;
	}

	Parameterized(){
		
	}
	public String getName() {
		return name;
	}

	public String getAbout() {
		return about;
	}

	public int getBirthYear() {
		return birthYear;
	}

}
