package com.mycompany.app;

import java.util.*;

public class GiftPack {

	static int count=0;
	static int totalweight=0;
	static ArrayList<Integer> gift_weight = new ArrayList<>();
	GiftPack()
	{
		
	}
	
	void display()
	{
		//System.out.println("The total weight of gift packs is "+totalweight);
		System.out.println("The weight of each gift pack is");
		for (int i=0;i<gift_weight.size();i++)
		{
			System.out.print(gift_weight.get(i)+" ");
			totalweight+=gift_weight.get(i);
		}
		System.out.println();
		System.out.println("The total weight of gift packs is "+totalweight);
	}
}
