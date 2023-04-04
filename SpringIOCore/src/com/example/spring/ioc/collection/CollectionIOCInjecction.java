package com.example.spring.ioc.collection;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class CollectionIOCInjecction {
	
	 List phoneNo;
	 Set country;
	
	 Map recordMap;
	
	 Properties bankAccount;

	public List getPhoneNo() {
		System.out.println("List Elements :"  + phoneNo);
		return phoneNo;
	}

	public void setPhoneNo(List phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	public Set getCountry() {
		System.out.println("Set Elements :"  + country);
		return country;
	}

	public void setCountry(Set country) {
		this.country = country;
	}

	public Map getRecordMap() {
		System.out.println("Map Elements :"  + recordMap);
		return recordMap;
	}

	public void setRecordMap(Map recordMap) {
		this.recordMap = recordMap;
	}

	
	public Properties getBankAccount() {
		System.out.println("Properties Elements :"  + bankAccount);
		return bankAccount;
	}

	public void setBankAccount(Properties bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankAccount, country, phoneNo, recordMap);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionIOCInjecction other = (CollectionIOCInjecction) obj;
		return Objects.equals(bankAccount, other.bankAccount) && Objects.equals(country, other.country)
				&& Objects.equals(phoneNo, other.phoneNo) && Objects.equals(recordMap, other.recordMap);
	}
	
	
}
