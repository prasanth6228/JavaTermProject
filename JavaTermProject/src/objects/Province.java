/**
 * 
 */
package objects;

/**
 * @author Satya Dantuluri
 *
 */
public class Province {
	public String provinceId; // unique Id that represents the province
	private String provinceName;
	private String country;
	
	public Province(String provinceName) {
		this.provinceName = provinceName;
		this.country = "Canada";
	}
	
	public Province() {
		
	}
	
	public static void createProvince() {
		
	}
	
	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	public static void deleteProvince() {
		
	}
	
	public static void updateProvince() {
		
	}
}
