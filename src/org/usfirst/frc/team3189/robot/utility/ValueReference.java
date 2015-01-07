package org.usfirst.frc.team3189.robot.utility;

public class ValueReference <T> {
	
	/**
	 * the data instance variable of type T
	 */
	private T data;
	
	public ValueReference(T data){
		this.data = data;
	}
	
	/**
	 * 
	 * @return data var of type T
	 */
	public T getData () {
		return data;
	}
	
	/**
	 * Sets data from an arg of type T
	 * @param data: the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
}
