//Basmala Ahmad
//Hanrath cs115 L02
// Sahel Sharma
import java.io.*;
import java.io.File;
import java.util.Scanner;
public class ahmadbasmala
{
    public static void main(String [] args) throws IOException
	{		
		
	    //find file w the designer data
	    File runwayFile = new File("runwaycs115.txt");
		//scanner reads from file
		Scanner runwayScanner = new Scanner(runwayFile);
		//read in data/traverse the array
		String season1 = " ";
	  	String season2 = " ";
		String season3 = " ";
	    if(!season1.equals("ENDOFFILE")) {
		season1 = runwayScanner.next();
		int season1num= runwayScanner.nextInt(); 
		//System.out.println(season1+season1num);
	    int numofDesignersperSeason1 = runwayScanner.nextInt();
		for(int i=0;i<numofDesignersperSeason1;i++)
	    {
			String Last_Name1 = runwayScanner.next();
	        String First_Name1 = runwayScanner.next();
	        int Age1= runwayScanner.nextInt();
			double Salary1 = runwayScanner.nextDouble();
			String Status1 = runwayScanner.next();
		    String Favorite_TV_Show1 = runwayScanner.nextLine();
			//ArrayofDesigners1(i,Last_Name1,First_Name1,Age1,Salary1,Status1,Favorite_TV_Show1);

		}
		}	
		if(!season2.equals("ENDOFFILE")) {
		season2 = runwayScanner.next();
		int season2num= runwayScanner.nextInt(); 
		//System.out.println(season2+season2num);
	    int numofDesignersperSeason2 = runwayScanner.nextInt();
		for(int i=0;i<numofDesignersperSeason2;i++)
	    {
			String Last_Name2 = runwayScanner.next();
	        String First_Name2 = runwayScanner.next();
	        int Age2= runwayScanner.nextInt();
			double Salary2 = runwayScanner.nextDouble();
			String Status2 = runwayScanner.next();
			String Favorite_TV_Show2 = runwayScanner.nextLine();
			//ArrayofDesigners2(i,Last_Name2,First_Name2,Age2,Salary2,Status2,Favorite_TV_Show2);

		}
		}
		if(!season3.equals("ENDOFFILE")) {
		season3 = runwayScanner.next();
		int season3num= runwayScanner.nextInt(); 
		//System.out.println(season3+season3num);
	    int numofDesignersperSeason3 = runwayScanner.nextInt();
		for(int i=0;i<numofDesignersperSeason3;i++)
	    {
			String Last_Name3 = runwayScanner.next();
	        String First_Name3 = runwayScanner.next();
	        int Age3= runwayScanner.nextInt();
			double Salary3 = runwayScanner.nextDouble();
			String Status3 = runwayScanner.next();
			String Favorite_TV_Show3 = runwayScanner.nextLine();
			//ArrayofDesigners3(i,Last_Name3,First_Name3,Age3,Salary3,Status3,Favorite_TV_Show3);
			
		}
		}
	
	
		Scanner scan = new Scanner(System.in);
		boolean menuorstats=true;
		do{
	    System.out.print("Enter M to call menu or Enter Q to call finalStats: ");
		String menuOrFinalStats = scan.next();
		if(menuOrFinalStats.equals("m")||menuOrFinalStats.equals("M"))
		{
			menu();
			
			menuorstats=true;
		}
	    else if(menuOrFinalStats.equals("q")||menuOrFinalStats.equals("Q"))
		{
			finalStats();
			menuorstats=false;
		}
		else
		{
			System.out.println("ERROR TRY AGAIN");
			menuorstats=true;
		}
		}
		while(menuorstats);
		
	}

	public static void ArrayofDesigners1(int i,String L,String F,int A, double S,String ST,String FA)
	{
		   
			ahmadbasmalaDesigner season1designers = new ahmadbasmalaDesigner();
			season1designers.setLast_Name(L);
			season1designers.setFirst_Name(F);
			season1designers.setAge(A);
			season1designers.setSalary(S);
			season1designers.setStatus(ST);
			season1designers.setFavorite_TV_Show(FA);
			ahmadbasmalaDesigner designerArray1[] = new ahmadbasmalaDesigner[50];
			designerArray1[i]= season1designers;
			System.out.println(designerArray1[i].display());
	}
	public static void ArrayofDesigners2(int i, String L,String F,int A, double S,String ST,String FA)
	{
		 
			ahmadbasmalaDesigner season2designers = new ahmadbasmalaDesigner();
			season2designers.setLast_Name(L);
			season2designers.setFirst_Name(F);
			season2designers.setAge(A);
			season2designers.setSalary(S);
			season2designers.setStatus(ST);
			season2designers.setFavorite_TV_Show(FA);
			ahmadbasmalaDesigner designerArray2[] = new ahmadbasmalaDesigner[50];
			designerArray2[i]= season2designers;
			System.out.println(designerArray2[i].display());
	}
	public static void ArrayofDesigners3(int i,String L,String F,int A, double S,String ST,String FA)
	{
		   
			ahmadbasmalaDesigner season3designers = new ahmadbasmalaDesigner();
			season3designers.setLast_Name(L);
			season3designers.setFirst_Name(F);
			season3designers.setAge(A);
			season3designers.setSalary(S);
			season3designers.setStatus(ST);
			season3designers.setFavorite_TV_Show(FA);
			ahmadbasmalaDesigner designerArray3[] = new ahmadbasmalaDesigner[50];
			designerArray3[i]= season3designers;
			System.out.println(designerArray3[i].display());
			
	}
	public static void menu() throws IOException
	{
	    Scanner scan = new Scanner(System.in);
		boolean tryAgain=true;
		do {
		System.out.print("Enter L for list, D for designer report, S for Season Report, M for Salary, T for Status, or Q to return to main: ");
		String nextmove= scan.next();
		if(nextmove.equals("L") || nextmove.equals("l"))
		{
		    int timesLentered=0;
			timesLentered = timesLentered +1;
			listall();
			tryAgain = false;
		}
		else if(nextmove.equals("d") || nextmove.equals("D"))
		{
			int timesDentered=0;
			timesDentered = timesDentered +1;
		    designerReport();
		    tryAgain = false;
		}
		else if(nextmove.equals("s") || nextmove.equals("S"))
		{
			int timesSentered=0;
			timesSentered = timesSentered +1;
			seasonReport();
			tryAgain = false;
		}
		else if(nextmove.equals("m") || nextmove.equals("M"))
		{
			int timesMentered=0;
			timesMentered = timesMentered +1;
			salaryReport();
			tryAgain = false;
			
		}
		else if(nextmove.equals("t") || nextmove.equals("T"))
		{
			int timesTentered=0;
			timesTentered = timesTentered +1;
			statusReport();
			tryAgain = false;
			
		}
		else if(nextmove.equals("q") || nextmove.equals("Q"))
		{
			int timesQentered=0;
			timesQentered = timesQentered +1;
		    tryAgain = false;
		}
		else 
			System.out.println("Error Try again");
			int timesErrorentered=0;
			timesErrorentered = timesErrorentered + 1;
		}
		while(tryAgain);
	}
	public static void listall() throws IOException
	{
		System.out.println("You made it here listall");
		//find file w the designer data
	    File runwayFile = new File("runwaycs115.txt");
		//scanner reads from file
		Scanner runwayScanner = new Scanner(runwayFile);
		//read in data/traverse the array
		String season1 = " ";
	  	String season2 = " ";
		String season3 = " ";
	    if(!season1.equals("ENDOFFILE")) {
		season1 = runwayScanner.next();
		int season1num= runwayScanner.nextInt(); 
		System.out.println(season1+season1num);
	    int numofDesignersperSeason1 = runwayScanner.nextInt();
		for(int i=0;i<numofDesignersperSeason1;i++)
	    {
			String Last_Name1 = runwayScanner.next();
	        String First_Name1 = runwayScanner.next();
	        int Age1= runwayScanner.nextInt();
			double Salary1 = runwayScanner.nextDouble();
			String Status1 = runwayScanner.next();
		    String Favorite_TV_Show1 = runwayScanner.nextLine();
			ArrayofDesigners1(i,Last_Name1,First_Name1,Age1,Salary1,Status1,Favorite_TV_Show1);

		}
		}
		
		if(!season2.equals("ENDOFFILE")); {
		season2 = runwayScanner.next();
		int season2num= runwayScanner.nextInt(); 
		System.out.println(season2+season2num);
	    int numofDesignersperSeason2 = runwayScanner.nextInt();
		for(int i=0;i<numofDesignersperSeason2;i++)
	    {
			String Last_Name2 = runwayScanner.next();
	        String First_Name2 = runwayScanner.next();
	        int Age2= runwayScanner.nextInt();
			double Salary2 = runwayScanner.nextDouble();
			String Status2 = runwayScanner.next();
			String Favorite_TV_Show2 = runwayScanner.nextLine();
			ArrayofDesigners2(i,Last_Name2,First_Name2,Age2,Salary2,Status2,Favorite_TV_Show2);

		}
		}
		if(!season3.equals("ENDOFFILE")); {
		season3 = runwayScanner.next();
		int season3num= runwayScanner.nextInt(); 
		System.out.println(season3+season3num);
	    int numofDesignersperSeason3 = runwayScanner.nextInt();
		for(int i=0;i<numofDesignersperSeason3;i++)
	    {
			String Last_Name3 = runwayScanner.next();
	        String First_Name3 = runwayScanner.next();
	        int Age3= runwayScanner.nextInt();
			double Salary3 = runwayScanner.nextDouble();
			String Status3 = runwayScanner.next();
			String Favorite_TV_Show3 = runwayScanner.nextLine();
			ArrayofDesigners3(i,Last_Name3,First_Name3,Age3,Salary3,Status3,Favorite_TV_Show3);
			
		}
		}

	}
	
	public static boolean designerReport() throws IOException
	{
		System.out.println("You made it here designereport");
		System.out.print("Enter last name ONLY of designer: ");
		//String lastnamesearch = scan.next();
		return true;
		
	}
	
	public static void seasonReport() throws IOException
	{
		System.out.println("You made it here seasonreport");
	}
	
	public static void salaryReport() throws IOException
	{
		System.out.println("You made it here salaryreport");
	}
	
	public static void statusReport() throws IOException
	{
		System.out.println("You made it here statusreport");
	}
	
	public static void finalStats() throws IOException
	{
		System.out.println("You made it here finalstats");
		//System.out.print(timesLentered + " " + timesDentered + " " + timesSentered + " " timesMentered + " " + timesTentered+ " " +timesQentered+ " " +timesErrorentered);
	
	}
}