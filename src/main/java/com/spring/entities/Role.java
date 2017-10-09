package com.spring.entities;

public enum Role {
	admin,
	user;

	public static boolean contains(String val) {
		for (Role r : Role.values()) {
			if (r.name().equals(val)) {
				return true;
			}
		}

		return false;
	}
}