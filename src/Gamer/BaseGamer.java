package Gamer;

public class BaseGamer {
	
	private String firstName;
	private String lastName;
	private String internationalityId;
	private String birthDay;
	public BaseGamer() {
		
	}
	public BaseGamer(String firstName, String lastName, String internationalityId, String birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.internationalityId = internationalityId;
		this.birthDay = birthDay;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInternationalityId() {
		return internationalityId;
	}
	public void setInternationalityId(String internationalityId) {
		this.internationalityId = internationalityId;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	

}
