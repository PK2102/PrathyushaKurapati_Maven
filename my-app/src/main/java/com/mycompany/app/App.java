package com.mycompany.app;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	int number_of_children;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of children");
		number_of_children = scan.nextInt();
		
		GiftPack [] temp = new GiftPack[number_of_children];
		for(int i=0;i<number_of_children;i++) {
			temp[i] = new GiftPack();
			System.out.println("Enter the choice of items you want in the gift pack of child"+(i+1));
			char choice ='y';
			int weight_taken = 0;
			int price_taken =0;
			while(choice!='n')
			{
				System.out.println("Enter the items you want");
				System.out.println("1.Dairy Milk");
				System.out.println("2.Fuse");
				System.out.println("3.Swiss");
				System.out.println("4.FerroRochar");
				System.out.println("5.Rasuglla");
				System.out.println("6.GulabJamun");
				System.out.println("7.Jalebi");
				System.out.println("8.Kaju Katli");
				System.out.print("Enter a number:");
				int wish = scan.nextInt();
				switch(wish)
				{
				case 1:
					DairyMilk dm = new DairyMilk();
					price_taken+=dm.price;
					weight_taken+=dm.weight;
					dm.Adding();
					break;
				case 2:
					Fuse fuse = new Fuse();
					price_taken+=fuse.price;
					weight_taken+=fuse.weight;
					fuse.Adding();
					break;
				case 3:
					Swiss swiss = new Swiss();
					price_taken+=swiss.price;
					weight_taken+=swiss.weight;
					swiss.Adding();
					break;
				case 4:
					FerroRochar fr = new FerroRochar();
					price_taken+=fr.price;
					weight_taken+=fr.weight;
					fr.Adding();
					break;
				case 5:
					Rasugulla rasuglla =  new Rasugulla();
					price_taken+= rasuglla.price;
					weight_taken+=rasuglla.weight;	
					rasuglla.Adding_Sweets();
					break;
				case 6:
					GulabJamun gulabjamun =new  GulabJamun(); 
					price_taken+= gulabjamun.price;
					weight_taken+=gulabjamun.weight;	
					gulabjamun.Adding_Sweets();
					break;
				case 7:
					Jalebi jalebi =  new Jalebi();
					price_taken+= jalebi.price;
					weight_taken+=jalebi.weight;
					jalebi.Adding_Sweets();
					break;
				case 8:
					Kajukatli kajukatli = new Kajukatli();
					price_taken+= kajukatli.price;
					weight_taken+=kajukatli.weight;	
					kajukatli.Adding_Sweets();
					break;
				default:
					System.out.println("Sorry you had chossen item is unavailable please try again");
					break;
				}
				
				System.out.println("Do you want to contine(y/n)?");
				choice  = scan.next().charAt(0);
				//System.out.print(choice);
				
			}
			//System.out.println(price_taken);
			//System.out.println(weight_taken);
			GiftPack.gift_weight.add(weight_taken);
			
		}
		//System.out.println("The total weight of the gift pack is");
		temp[number_of_children-1].display();
		System.out.println("Enter the lower limit of price of chocaltes/sweets/candies in the gift");
		int lower_limit = scan.nextInt();
		System.out.println("Enter the upper limit of price of chocaltes/sweets/candies  in the gift");
		int upper_limit =  scan.nextInt();
		int chocaltes_count=0;
		for(int i=0;i<Chocaltes.chocaltes_price.size();i++)
		{
			int value = Chocaltes.chocaltes_price.get(i);
			//System.out.println(value);
			if(value>=lower_limit && value<=upper_limit)
				chocaltes_count++;
		}
		System.out.println("Chocaltes available in the gift  pack for given range are "+chocaltes_count);
		int sweets_count=0;
		for(int i=0;i<Sweets.sweets_price.size();i++)
		{
			int value = Sweets.sweets_price.get(i);
			//System.out.println(value);
			if(value>=lower_limit && value<=upper_limit)
				sweets_count++;
		}
		System.out.println("Sweets available in the gift pack for given range are "+sweets_count);
    }
}
