package com.mycompany.app;

public class Kajukatli extends Sweets{
	Kajukatli()
	{
		price =50 ;
		weight=20;
	}

	@Override
	public void Adding_Sweets() {
		// TODO Auto-generated method stub
		Sweets.sweets_price.add(price);
	}

}
