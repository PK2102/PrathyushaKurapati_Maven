package com.mycompany.app;

public class FerroRochar extends Chocaltes {
	FerroRochar()
	{
		price=40;
		weight=5;
	}

	@Override
	public void Adding() {
		// TODO Auto-generated method stub
		Chocaltes.chocaltes_price.add(price);
	}

}
