package com.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	private List<String> friends;
	private Map<String, Integer> feestructure;
	private Properties property;

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", property=" + property + "]";
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

}
