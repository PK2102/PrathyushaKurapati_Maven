package com.mycompany.app;

public class Jalebi extends Sweets {

	Jalebi()
	{
		price = 25;
		weight = 20;
	}

	@Override
	public void Adding_Sweets() {
		// TODO Auto-generated method stub
		Sweets.sweets_price.add(price);
	}
	
}
