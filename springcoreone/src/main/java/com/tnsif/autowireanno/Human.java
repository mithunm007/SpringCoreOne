package com.tnsif.autowireanno;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}
	
//	@Autowired
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
	
	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	

}
