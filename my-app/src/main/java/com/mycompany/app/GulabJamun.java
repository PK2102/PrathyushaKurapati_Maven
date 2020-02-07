package com.mycompany.app;

public class GulabJamun  extends Sweets{
	GulabJamun()
	{
		price = 30;
		weight = 20;
	}

	@Override
	public void Adding_Sweets() {
		// TODO Auto-generated method stub
		Sweets.sweets_price.add(price);
	}

}
