package com.tnsif.autowire;

public class Human {
	
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Human() {
		super();
	}
	
	public void startPumping() {
		
		if(heart!=null) {
			
			heart.pump();
		}
		else {
			System.out.println("Dead");
		}
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	

}
