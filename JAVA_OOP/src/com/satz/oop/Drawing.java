package com.satz.oop;

public interface Drawing{
	
	public default void pencil() {
		System.out.println("HB pencil");
	}
	
	void drawingNote();
}
