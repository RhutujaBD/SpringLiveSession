package com.example.spring.ioc.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionIOCInjecction {
	
	private ArrayList<String> phoneNo;
	
	private Set<String> country;
	
	private Map<Integer, String> recordMap;
	
	private Properties bankAccount;

	public ArrayList<String> getPhoneNo() {
		System.out.println("List Elements :"  + phoneNo);
		return phoneNo;
	}

	public void setPhoneNo(ArrayList<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Set<String> getCountry() {
		System.out.println("Set Elements :"  + country);
		return country;
	}

	public void setCountry(Set<String> country) {
		this.country = country;
	}

	public Map<Integer, String> getRecordMap() {
		System.out.println("Map Elements :"  + recordMap);
		return recordMap;
	}

	public void setRecordMap(Map<Integer, String> recordMap) {
		this.recordMap = recordMap;
	}

	public Properties getBankAccount() {
		System.out.println("Properties Elements :"  + bankAccount);
		return bankAccount;
	}

	public void setBankAccount(Properties bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

}
