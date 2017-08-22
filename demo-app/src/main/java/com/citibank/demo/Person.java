package com.citibank.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Person {
	public Person(String name) {

		setName(name);
		tasks = new ArrayList<Task>();
	}

	private List<Task> tasks;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name can't be blank");
		}

		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name can't be empty");
		}

		this.name = name;
	}

	public void addTask(Task task) {
		if (tasks.size()==5) 
		{			throw new IllegalArgumentException("Name can't be empty");
}
		else
		{
		tasks.add(task);
		}
	}

	public List<Task> getTask()

	{
		return tasks;
	}

}
