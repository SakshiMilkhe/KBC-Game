package dsp2;

/*
 * Deepika Pomendkar
*/
import java.util.*;
public class Kbc1 extends Thread {
	int ll1=0;
	static int game=1;
	int fiftyfifty=1;
	static int fliptheque=1;
	int audiencepoll=1;
	int doubledip=1;
	static int m[]={1000,2000,3000,5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,500000,1000000};
	static int money=0;
	static int turn=0;
	
	int pos;
	 void  newkbc1(int x)
	{
		 	 pos=1;
		 	 turn=1;
			int n,n1,i,n2,n3,n4,aans=2,ans,z=0;
			// char ll;
			int r1=1,d1;
			Random r=new Random();
			int ra=r.nextInt(3);
			System.out.println();
			int ll,opt=0;
			Scanner sc=new Scanner(System.in);
			String str=new String();
			str="Which living bird lays the world's LARGEST egg?";
			n=str.length();
			char a[]=new char[n];
			a=str.toCharArray();
			System.out.println("\n");
			///////
			String str1=new String();
			str1="Vulture";
			n1=str1.length();
			char a1[]=new char[n1];
			a1=str1.toCharArray();
			////////
			String str2=new String();
			str2="Ostrich";
			n2=str2.length();
			char a2[]=new char[n1];
			a2=str2.toCharArray();
			/////
			String str3=new String();
			str3="Owl";
			n3=str3.length();
			char a3[]=new char[n3];
			a3=str3.toCharArray();
			///////
			String str4=new String();
			str4="Eagle";
			n4=str4.length();
			char a4[]=new char[n4];
			a4=str4.toCharArray();
			////////////////
			
			System.out.println("\nYou Have the following LIFELINE left.");
			if(fiftyfifty==1)
			{
				System.out.println(".50-50");
			}
			if(fliptheque==1)
			{
				System.out.println(".Flip the question");
			}
			if(audiencepoll==1)
			{
				System.out.println(".Audience Poll");
			}
			if( doubledip==1)
			{
				System.out.println(".Double Dip");
			}
			//////////////
			
			//System.out.print("\n\n "+pos+". Question\n");
			System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("THIS QUESTION IS FOR "+x+"Rs");
			System.out.print("\n");
			for(i=0;i<50;i++)
			{
				System.out.print("_");
			}
			System.out.print("\n");
			
			System.out.print(" ");
			for(i=0;i<n;i++)
			{	
				System.out.print("_");
			}
			
			System.out.print("\n"+"/");
			for(i=0;i<n;i++)
			{	
				System.out.print(""+a[i]);
			}
			System.out.print("\\");
			
			
			System.out.print(" ");
			System.out.print("\n"+"\\");

			
			for(i=0;i<n;i++)
			{	
				System.out.print("_");
			}
			System.out.print("/");
			System.out.print("\n");
			//System.out.print("\n");
			for(i=0;i<50;i++)
			{
				System.out.print("_");
			}
			System.out.print("\n");
			
			////////////////
			
			
			System.out.print("\n"+" ");
			for(i=0;i<n1+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("\t");
			System.out.print(" ");
			for(i=0;i<n2+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("\n"+"/");
			System.out.print("1.");
			for(i=0;i<n1;i++)
			{	
				System.out.print(""+a1[i]);
			}
			System.out.print("\\");
			System.out.print("\t");
			
			System.out.print("/");
			System.out.print("2.");
			for(i=0;i<n2;i++)
			{	
				System.out.print(""+a2[i]);
			}
			System.out.print("\\");
		
			System.out.print("\n"+""+"\\");
			for(i=0;i<n1+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("/");
			System.out.print("\t"+""+"\\");
			for(i=0;i<n2+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("/");
			////////
			System.out.print("\n"+" ");
			for(i=0;i<n3+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("\t\t");
			System.out.print(" ");
			for(i=0;i<n4+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("\n"+"/");
			System.out.print("3.");
			for(i=0;i<n3;i++)
			{	
				System.out.print(""+a3[i]);
			}
			System.out.print("\\");
			System.out.print("\t\t");
			
			System.out.print("/");
			System.out.print("4.");
			for(i=0;i<n4;i++)
			{	
				System.out.print(""+a4[i]);
			}
			System.out.print("\\");
		
			System.out.print("\n"+""+"\\");
			for(i=0;i<n3+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("/");
			System.out.print("\t\t" +""+""+"\\");
			for(i=0;i<n4+2;i++)
			{	
				System.out.print("_");
			}
			System.out.print("/");
			System.out.print("\n");
			for(i=0;i<50;i++)
			{
				System.out.print("_");
			}
			System.out.print("\n");
			
			if(ll1<4)
			{
				do
				{
					System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
					ll=sc.nextInt();
					if(ll==1)
					{
						r1=1;
						System.out.println("ENTER");
						if(fiftyfifty==1)
						{
							System.out.println("1.50-50");
						
							
						}
						if(fliptheque==1)
						{
							System.out.println("2.Flip the question");
						}
						if(audiencepoll==1)
						{
							System.out.println("3.Audience Poll");
						}
						if( doubledip==1)
						{
							System.out.println("4.Double Dip");
						}
						opt=sc.nextInt();
						if(opt==1&&fiftyfifty!=0)
						{
							ll1=ll1+1;
							fiftyfifty=0;
							System.out.print("\n");
							for(i=0;i<50;i++)
							{
								System.out.print("_");
							}
							System.out.print("\n");
							System.out.print(" ");
							for(i=0;i<n;i++)
							{	
								System.out.print("_");
							}
							
							System.out.print("\n"+"/");
							for(i=0;i<n;i++)
							{	
								System.out.print(""+a[i]);
							}
							System.out.print("\\");
							
							
							System.out.print(" ");
							System.out.print("\n"+"\\");
		
							
							for(i=0;i<n;i++)
							{	
								System.out.print("_");
							}
							System.out.print("/");
							//System.out.println("\n");
							System.out.print("\n");
							for(i=0;i<50;i++)
							{
								System.out.print("_");
							}
							System.out.print("\n");
							////////////////
							
							
							System.out.print("\n"+" ");
							for(i=0;i<n1+2;i++)
							{	
								System.out.print("_");
							}
							System.out.print("\t");
							System.out.print(" ");
							for(i=0;i<n2+2;i++)
							{	
								System.out.print("_");
							}
							System.out.print("\n"+"/");
							System.out.print("1.");
							for(i=0;i<n1;i++)
							{	
								System.out.print(""+a1[i]);
							}
							System.out.print("\\");
							System.out.print("\t");
							
							System.out.print("/");
							System.out.print("2.");
							for(i=0;i<n2;i++)
							{	
								System.out.print(""+a2[i]);
							}
							System.out.print("\\");
						
							System.out.print("\n"+""+"\\");
							for(i=0;i<n1+2;i++)
							{	
								System.out.print("_");
							}
							System.out.print("/");
							System.out.print("\t"+""+"\\");
							for(i=0;i<n2+2;i++)
							{	
								System.out.print("_");
							}
							System.out.print("/");
							System.out.print("\n");
							for(i=0;i<50;i++)
							{
								System.out.print("_");
							}
							System.out.print("\n");
						}
						if(opt==2&&fliptheque==1)
						{
							z=1;
							ll1=ll1+1;
							fliptheque=0;
							newkbc16(x);
							//System.exit(0);
							 
						}
						if(opt==3&&audiencepoll==1)
						{
							audiencepoll=0;
							ll1=ll1+1;
							System.out.println("The Audience has voted for option "+aans);
							
						}
						if(opt==4&&doubledip==1)
						{
							ll1=ll1+1;
							doubledip=0;
							System.out.println("You have 2 Chances to answer this question.Enter your choice.");
							d1=sc.nextInt();
							if(d1==aans)
							{
								ans=aans;
								System.out.println("You have entered the correct option.");
								System.out.println("You are promoted to the next round.");
							}
							else
							{
								System.out.println("Your 2nd chance to answer.Enter the option.");
								d1=sc.nextInt();
								
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
									money=x;
									System.out.println("Your Current Amount is "+money+" Rs");
								}
								else
								{
									System.out.println("You entered the wrong option.");
									System.out.println("You lost the game.");
									if(money>0)
									{
										System.out.println("You WON a total amount of "+money+" Rs");
									}
									game=0;
								}
							}
							
						}
						
					}
					
					else if(ll==0)
					{
						r1=1;
					}
					else 
					{
						r1=0;
						System.out.println("You entered the wrong option try again.");
					}
				}while(r1==0);
			}
			else
			{
				System.out.println("No lifeline");
			}
			if(z!=1)
			{
				if(opt!=4)
				{
					
				System.out.println("\nChoose ur option");
				ans=sc.nextInt();
				if(ans==aans)
				{
					System.out.println("You have entered the correct option.");
					System.out.println("You are promoted to the next round.");
					money=x;
					System.out.println("Your Current Amount is "+money+" Rs");
				}
				else
				{
					System.out.println("You entered the wrong option.");
					System.out.println("You lost the game.");
					if(money>0)
					{
						System.out.println("\n\n");
						System.out.println("You WON a total amount of "+money+" Rs");
					}
					game=0;
				}
			}
		}
				System.out.println("\n\n\n\n");
			
	}
		 /////////////////////////////////////////////////////////////////
	 void  newkbc2(int x)
		{
			 	 pos=2;
			 	 turn=2;
				int n,n1,i,n2,n3,n4,aans=2,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll, opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Who was the Former PM of India?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Narendra Modi";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Manmohan Singh";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Atal Bihari Vajpayee";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="P.V.Narasimha Rao";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				//System.out.println("\n");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								ll1=ll1+1;
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No life line");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						System.out.println("\nChoose ur option");
						ans=sc.nextInt();
						if(ans==aans)
						{
							System.out.println("You have entered the correct option.");
							System.out.println("You are promoted to the next round.");
							money=x;
							System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
				
		}
	 /////////////////////////////////////////////////////////////////
	 void  newkbc3(int x)
		{
			 	 pos=3;
			 	 turn=3;
				int n,n1,i,n2,n3,n4,aans=3,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Which of the following are Indian brands of mobile?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Samsung";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Nokia";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Intex Technologies";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Motorola";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				//System.out.println("\n");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								ll1=ll1+1;
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("3.");
								for(i=0;i<n3;i++)
								{	
									System.out.print(""+a3[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								fliptheque=0;
								z=1;
							
								newkbc16(x);
								
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No life line left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
				
		}
	 void  newkbc4(int x)
		{
			 	 pos=1;
			 	 turn=4;
				int n,n1,i,n2,n3,n4,aans=4,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Which of these place is not located in Mumbai?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="The Gateway of India";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="The Kamla Nehru Park";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="The Juha Beach";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="The Charminar";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t\t");
				System.out.print(" ");
				
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
	
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
	
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc5(int x)
		{
			 	 pos=1;
			 	 turn=5;
				int n,n1,i,n2,n3,n4,aans=2,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="What are the Western Ghats in Maharashtra known as?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Nilgiris";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Sahyadris";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Cardamon Hills";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Annamalai";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					
				
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc6(int x)
		{
			 	 pos=1;
			 	 turn=6;
				int n,n1,i,n2,n3,n4,aans=1,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Which Indian State has most Airports?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Gujrat";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Maharashtra";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Delhi";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Kerla";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								ll1=ll1+1;
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left.");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc7(int x)
		{
			 	 pos=1;
			 	 turn=7;
				int n,n1,i,n2,n3,n4,aans=3,ans,z=0;
				// char ll;
				int r1=1,d1;
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Which is the OLDEST Mountain Range in India?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Himalayas";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Nilgiris";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Aravallis";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Vindhyas";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
			
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								ll1=ll1+1;
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("3.");
								for(i=0;i<n3;i++)
								{	
									System.out.print(""+a3[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left.");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc8(int x)
		{
			 	 pos=1;
			 	 turn=8;
				int n,n1,i,n2,n3,n4,aans=4,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="From where does Veeru propose to Basanti in Sholay?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Top of a roof";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Top of a ladder";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Top of a hill";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Top of a water tank";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n4+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("4.");
								for(i=0;i<n4;i++)
								{	
									System.out.print(""+a4[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n4+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No life line left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc9(int x)
		{
			 	 pos=1;
			 	 turn=9;
				int n,n1,i,n2,n3,n4,aans=3,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="In Harry Potter who plays Hermione Granger in the movie?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Emily Watson";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Emma Thompson";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Emma Watson";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Emma Woodhouse";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("3.");
								for(i=0;i<n3;i++)
								{	
									System.out.print(""+a3[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
				}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc10(int x)
		{
			 	 pos=1;
			 	 turn=10;
				int n,n1,i,n2,n3,n4,aans=1,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="What is the name of Tipu Sultan's father?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Haydar Ali";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Pandit Purnia";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Ghazi Khan";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Mir Sadiq";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								ll1=ll1+1;
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
				}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc11(int x)
		{
			 	 pos=1;
			 	 turn=11;
				int n,n1,i,n2,n3,n4,aans=3,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Which museum is largest in India?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Indian Museum";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Tagore Museum";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Calcutta Museum";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Subhash Chandra Bose Museum";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<70;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<70;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<70;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<70;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<70;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("3.");
								for(i=0;i<n3;i++)
								{	
									System.out.print(""+a3[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n3+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<70;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No life line left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc12(int x)
		{
			 	 pos=1;
			 	 turn=12;
				int n,n1,i,n2,n3,n4,aans=2,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Which are the main components of Biogas & Natural gas?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Ethane";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Methane";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Propane";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Butane";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<60;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<60;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc13(int x)
		{
			 	 pos=1;
			 	 turn=13;
				int n,n1,i,n2,n3,n4,aans=2,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Aspirin can be found in mant houshold medicine cabinets.But what is it chemically called?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Paracetamol";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Acetylsalicylic acid";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Acetaminophen";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Ibuprofen";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<90;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<90;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<90;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<90;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<90;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<90;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc14(int x)
		{
			 	 pos=1;
			 	 turn=14;
				int n,n1,i,n2,n3,n4,aans=2,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="In the United States the television broadcast standard is.....?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="PAL";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="NTSC";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="SECAM";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="RGB";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<65;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<65;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<65;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No life line left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc15(int x)
		{
			 	 pos=1;
			 	 turn=15;
				int n,n1,i,n2,n3,n4,aans=4,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="All these countries,except one,uses the currency in dollars.Which one is exception?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="New Zealand";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Hong Kong";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Belize";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Vanuatu";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<85;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<85;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<85;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<85;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n4+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("4.");
								for(i=0;i<n4;i++)
								{	
									System.out.print(""+a4[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n4+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<85;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								ll1=ll1+1;
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								newkbc16(x);
								//System.exit(0);
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No lifeline left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 void  newkbc16(int x)
		{
			 	 pos=1;
			 	 
				int n,n1,i,n2,n3,n4,aans=1,ans,z=0;
				// char ll;
				int r1=1,d1;
				Random r=new Random();
				int ra=r.nextInt(3);
				System.out.println();
				int ll,opt=0;
				Scanner sc=new Scanner(System.in);
				String str=new String();
				str="Where is the headquarters of Microsoft located?";
				n=str.length();
				char a[]=new char[n];
				a=str.toCharArray();
				System.out.println("\n");
				///////
				String str1=new String();
				str1="Santa Clara,California";
				n1=str1.length();
				char a1[]=new char[n1];
				a1=str1.toCharArray();
				////////
				String str2=new String();
				str2="Tucson,Arizona";
				n2=str2.length();
				char a2[]=new char[n1];
				a2=str2.toCharArray();
				/////
				String str3=new String();
				str3="Richmond,Virginia";
				n3=str3.length();
				char a3[]=new char[n3];
				a3=str3.toCharArray();
				///////
				String str4=new String();
				str4="Redmond,Washington";
				n4=str4.length();
				char a4[]=new char[n4];
				a4=str4.toCharArray();
				////////////////
				
				System.out.println("\nYou Have the following LIFELINE left.");
				if(fiftyfifty==1)
				{
					System.out.println(".50-50");
				}
				if(fliptheque==1)
				{
					System.out.println(".Flip the question");
				}
				if(audiencepoll==1)
				{
					System.out.println(".Audience Poll");
				}
				if( doubledip==1)
				{
					System.out.println(".Double Dip");
				}
				//////////////
				
				//System.out.print("\n\n "+pos+". Question\n");
				System.out.println("Your next question is"+"\n."+"\n."+"\n."+"\n.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("THIS QUESTION IS FOR "+x+"Rs");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				System.out.print(" ");
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				
				System.out.print("\n"+"/");
				for(i=0;i<n;i++)
				{	
					System.out.print(""+a[i]);
				}
				System.out.print("\\");
				
				
				System.out.print(" ");
				System.out.print("\n"+"\\");

				
				for(i=0;i<n;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				//System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				
				////////////////
				
				
				System.out.print("\n"+" ");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("1.");
				for(i=0;i<n1;i++)
				{	
					System.out.print(""+a1[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("2.");
				for(i=0;i<n2;i++)
				{	
					System.out.print(""+a2[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n1+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n2+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				////////
				System.out.print("\n"+" ");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\t");
				System.out.print(" ");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("\n"+"/");
				System.out.print("3.");
				for(i=0;i<n3;i++)
				{	
					System.out.print(""+a3[i]);
				}
				System.out.print("\\");
				System.out.print("\t");
				
				System.out.print("/");
				System.out.print("4.");
				for(i=0;i<n4;i++)
				{	
					System.out.print(""+a4[i]);
				}
				System.out.print("\\");
			
				System.out.print("\n"+""+"\\");
				for(i=0;i<n3+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\t"+""+"\\");
				for(i=0;i<n4+2;i++)
				{	
					System.out.print("_");
				}
				System.out.print("/");
				System.out.print("\n");
				for(i=0;i<50;i++)
				{
					System.out.print("_");
				}
				System.out.print("\n");
				if(ll1<4)
				{
					do
					{
						System.out.println("\nDo you want to use any of your LIFELINE? 1 for Yes 0 for No");
						ll=sc.nextInt();
						if(ll==1)
						{
							r1=1;
							System.out.println("ENTER");
							if(fiftyfifty==1)
							{
								System.out.println("1.50-50");
							
								
							}
							if(fliptheque==1)
							{
								System.out.println("2.Flip the question");
							}
							if(audiencepoll==1)
							{
								System.out.println("3.Audience Poll");
							}
							if( doubledip==1)
							{
								System.out.println("4.Double Dip");
							}
							opt=sc.nextInt();
							if(opt==1&&fiftyfifty!=0)
							{
								ll1=ll1+1;
								fiftyfifty=0;
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								System.out.print(" ");
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								
								System.out.print("\n"+"/");
								for(i=0;i<n;i++)
								{	
									System.out.print(""+a[i]);
								}
								System.out.print("\\");
								
								
								System.out.print(" ");
								System.out.print("\n"+"\\");
			
								
								for(i=0;i<n;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								//System.out.println("\n");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
								////////////////
								
								
								System.out.print("\n"+" ");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\t");
								System.out.print(" ");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("\n"+"/");
								System.out.print("1.");
								for(i=0;i<n1;i++)
								{	
									System.out.print(""+a1[i]);
								}
								System.out.print("\\");
								System.out.print("\t");
								
								System.out.print("/");
								System.out.print("2.");
								for(i=0;i<n2;i++)
								{	
									System.out.print(""+a2[i]);
								}
								System.out.print("\\");
							
								System.out.print("\n"+""+"\\");
								for(i=0;i<n1+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\t"+""+"\\");
								for(i=0;i<n2+2;i++)
								{	
									System.out.print("_");
								}
								System.out.print("/");
								System.out.print("\n");
								for(i=0;i<50;i++)
								{
									System.out.print("_");
								}
								System.out.print("\n");
							}
							if(opt==2&&fliptheque==1)
							{
								ll1=ll1+1;
								z=1;
								fliptheque=0;
								
								 
							}
							if(opt==3&&audiencepoll==1)
							{
								ll1=ll1+1;
								audiencepoll=0;
								System.out.println("The Audience has voted for option "+aans);
								
							}
							if(opt==4&&doubledip==1)
							{
								ll1=ll1+1;
								doubledip=0;
								System.out.println("You have 2 Chances to answer this question.Enter your choice.");
								d1=sc.nextInt();
								if(d1==aans)
								{
									ans=aans;
									System.out.println("You have entered the correct option.");
									System.out.println("You are promoted to the next round.");
								}
								else
								{
									System.out.println("Your 2nd chance to answer.Enter the option.");
									d1=sc.nextInt();
									
									if(d1==aans)
									{
										ans=aans;
										System.out.println("You have entered the correct option.");
										System.out.println("You are promoted to the next round.");
										money=x;
										System.out.println("Your Current Amount is "+money+" Rs");
									}
									else
									{
										System.out.println("You entered the wrong option.");
										System.out.println("You lost the game.");
										if(money>0)
										{
											System.out.println("You WON a total amount of "+money+" Rs");
										}
										game=0;
									}
								}
								
							}
						}
						
						else if(ll==0)
						{
							r1=1;
						}
						else 
						{
							r1=0;
							System.out.println("You entered the wrong option try again.");
						}
					}while(r1==0);
				}
				else
				{
					System.out.println("No life line left");
				}
				if(z!=1)
				{
					if(opt!=4)
					{
						
					System.out.println("\nChoose ur option");
					ans=sc.nextInt();
					if(ans==aans)
					{
						System.out.println("You have entered the correct option.");
						System.out.println("You are promoted to the next round.");
						money=x;
						System.out.println("Your Current Amount is "+money+" Rs");
					}
					else
					{
						System.out.println("You entered the wrong option.");
						System.out.println("You lost the game.");
						if(money>0)
						{
							System.out.println("\n\n");
							System.out.println("You WON a total amount of "+money+" Rs");
						}
						game=0;
					}
				}
			}
					System.out.println("\n\n\n\n");
				
		}
	 
			 

	
	

	public static void main(String[] args) {
		Kbc1 k=new Kbc1();
		int i;
		
		System.out.println("Welcome to KBC");
		
		
		k.newkbc1(m[0]);
		if(game==1&&turn<=1)
		{
			k.newkbc2(m[1]);
		}
		if(game==1&&turn<=2)
		{
			k.newkbc3(m[2]);
		}
		if(game==1&&turn<=3)
		{
			k.newkbc4(m[3]);
		}
		if(game==1&&turn<=4)
		{
			k.newkbc5(m[4]);
		}
		if(game==1&&turn<=5)
		{
			k.newkbc6(m[5]);
		}
		if(game==1&&turn<=6)
		{
			k.newkbc7(m[6]);
		}
		if(game==1&&turn<=7)
		{
			k.newkbc8(m[7]);
		}
		if(game==1&&turn<=8)
		{
			k.newkbc9(m[8]);
		}
		if(game==1&&turn<=9)
		{
			k.newkbc10(m[9]);
		}
		if(game==1&&turn<=10)
		{
			k.newkbc11(m[10]);
		}
		if(game==1&&turn<=11)
		{
			k.newkbc12(m[11]);
		}
		if(game==1&&turn<=12)
		{
			k.newkbc13(m[12]);
		}
		if(game==1&&turn<=13)
		{
			k.newkbc14(m[13]);
		}
		if(game==1&&turn<=14)
		{
			k.newkbc15(m[14]);
		}
		if(money==1000000)
		{
			System.out.println("\n");
			for(i=0;i<35;i++)
			{
				System.out.print("-");
			}
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|CONGRATULATION YOU WON 1Crore Rs |");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n|"+"\t\t\t\t  "+"|");
			System.out.print("\n");
			for(i=0;i<35;i++)
			{
				System.out.print("-");
			}
		}
		
		
		
		
		
		
	}

}
