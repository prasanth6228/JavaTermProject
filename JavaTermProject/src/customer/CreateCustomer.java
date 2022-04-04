/**
 * 
 */
package customer;

/**
 * @author Satya Dantuluri
 *	
 * 1) Contains methods to 
 * 		1.1 Create a customer
 * 		1.2 Allows customer to Login
 *      
 *
 */
public class CreateCustomer {
	
	private String userName;
	private String password;
	private String firstName;
	private String LastName;
	private String gender;
	private String city;
	private String street;
	private String Province;
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return Province;
	}

	/**
	 * @param province the province to set
	 *
	public void setProvince(String province) {
		Province = province;
	}*/
	
	
	// constructor to initialize the customer fields 
	public CreateCustomer(String UserName,
						  String password,
						  String firstName,
						  String LastName,
						  String gender,
						  String city,
						  String street,
						  String Province){
		
			this.userName = UserName;
			this.password = password; 
			this.firstName = firstName;
			this.LastName = LastName;
			this.gender = gender;
			this.city = city;
			this.street = Province;
			this.Province = Province;
	}
	
	public CreateCustomer() {
		
	}

}
