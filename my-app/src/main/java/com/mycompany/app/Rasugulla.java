package com.mycompany.app;

public class Rasugulla extends Sweets {
	Rasugulla()
	{
		price=40;
		weight=20;
	}

	@Override
	public void Adding_Sweets() {
		// TODO Auto-generated method stub
		Sweets.sweets_price.add(price);
	}

}
