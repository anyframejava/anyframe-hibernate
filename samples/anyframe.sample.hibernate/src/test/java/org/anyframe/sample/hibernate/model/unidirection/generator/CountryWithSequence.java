package org.anyframe.sample.hibernate.model.unidirection.generator;

// Generated 2008. 9. 1 ���� 1:00:42 by Hibernate Tools 3.2.1.GA

/**
 * Country generated by hbm2java
 */
public class CountryWithSequence implements java.io.Serializable {

	private int countryCode;
	private String countryId;
	private String countryName;

	public CountryWithSequence() {
	}

	public CountryWithSequence(int countryCode, String countryId, String countryName) {
		this.countryCode = countryCode;
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public int getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
