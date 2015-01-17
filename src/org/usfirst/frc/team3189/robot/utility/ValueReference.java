package org.usfirst.frc.team3189.robot.utility;

public class ValueReference <T> {
	
	/**
	 * the data instance variable of type T
	 */
	private T value;
	
	public ValueReference(T value){
		this.value = value;
	}
	
	/**
	 * 
	 * @return data var of type T
	 */
	public T get () {
		return value;
	}
	
	/**
	 * Sets data from an arg of type T
	 * @param data: the data to set
	 */
	public void set(T value) {
		this.value = value;
	}
	
}
