package com.springcore.standalone;

import java.util.List;

public class Model {
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Model [friends=" + friends + "]";
	}
	

}
