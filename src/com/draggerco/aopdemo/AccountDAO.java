package com.draggerco.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass() + " : DOING MY DIRTY JOB");
	}
}
