
//Basmala Ahmad
//Hanrath cs115 L02
// Sahel Sharma
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class test {
	
	static ahmadbasmalaDesigner designerArray1[] = new ahmadbasmalaDesigner[9];
	static ahmadbasmalaDesigner designerArray2[] = new ahmadbasmalaDesigner[5];
	static ahmadbasmalaDesigner designerArray3[] = new ahmadbasmalaDesigner[8];
	static int[] counter = new int[7];
	static String[] counterstr = new String[7];
	static int timesLentered = 0;
	static int timesDentered = 0;
	static int timesSentered = 0;
	static int timesMentered = 0;
	static int timesTentered = 0;
	static int timesQentered = 0;
	static int timesErrorentered = 0;


	public static void main(String[] args) throws IOException {
		// find file w the designer data
		File runwayFile = new File("C:\\Users\\Basmala\\eclipse-workspace\\Project Runway\\runwaycs115");
		// scanner reads from file
		Scanner runwayScanner = new Scanner(runwayFile);
		// read in data/traverse the array
		String season1 = " ";
		String season2 = " ";
		String season3 = " ";
		if (!season1.equals("ENDOFFILE")) {
			season1 = runwayScanner.next();
			int season1num = runwayScanner.nextInt();
			// System.out.println(season1+season1num);
			int numofDesignersperSeason1 = runwayScanner.nextInt();
			for (int i = 0; i < numofDesignersperSeason1; i++) {
				String Last_Name1 = runwayScanner.next();
				String First_Name1 = runwayScanner.next();
				int Age1 = runwayScanner.nextInt();
				double Salary1 = runwayScanner.nextDouble();
				String Status1 = runwayScanner.next();
				String Favorite_TV_Show1 = runwayScanner.nextLine();
				ArrayofDesigners1(i, Last_Name1, First_Name1, Age1, Salary1, Status1, Favorite_TV_Show1);

			}
		}

		if (!season2.equals("ENDOFFILE")) {
			season2 = runwayScanner.next();
			int season2num = runwayScanner.nextInt();
			// System.out.println(season1+season1num);
			int numofDesignersperSeason2 = runwayScanner.nextInt();
			for (int i = 0; i < numofDesignersperSeason2; i++) {
				String Last_Name2 = runwayScanner.next();
				String First_Name2 = runwayScanner.next();
				int Age2 = runwayScanner.nextInt();
				double Salary2 = runwayScanner.nextDouble();
				String Status2 = runwayScanner.next();
				String Favorite_TV_Show2 = runwayScanner.nextLine();
				ArrayofDesigners2(i, Last_Name2, First_Name2, Age2, Salary2, Status2, Favorite_TV_Show2);

			}
		}

		if (!season3.equals("ENDOFFILE")) {
			season3 = runwayScanner.next();
			int season3num = runwayScanner.nextInt();
			// System.out.println(season3+season3num);
			int numofDesignersperSeason3 = runwayScanner.nextInt();
			for (int i = 0; i < numofDesignersperSeason3; i++) {
				String Last_Name3 = runwayScanner.next();
				String First_Name3 = runwayScanner.next();
				int Age3 = runwayScanner.nextInt();
				double Salary3 = runwayScanner.nextDouble();
				String Status3 = runwayScanner.next();
				String Favorite_TV_Show3 = runwayScanner.nextLine();
				ArrayofDesigners3(i, Last_Name3, First_Name3, Age3, Salary3, Status3, Favorite_TV_Show3);

			}
		}

		// statusReport();
		// seasonReport();
		// designerReport();
		// salaryReport();

		Scanner scan = new Scanner(System.in);
		boolean menuorstats = true;
		do {
			System.out.print("Enter M to call menu or Enter Q to call finalStats: ");
			String menuOrFinalStats = scan.next();
			if (menuOrFinalStats.equals("m") || menuOrFinalStats.equals("M")) {
				menu();

				menuorstats = true;
			} else if (menuOrFinalStats.equals("q") || menuOrFinalStats.equals("Q")) {
				finalStats();
				menuorstats = false;
			} else {
				System.out.println("ERROR TRY AGAIN");
				menuorstats = true;
			}
		} while (menuorstats);

	}

	public static ahmadbasmalaDesigner ArrayofDesigners1(int i, String L, String F, int A, double S, String ST,
			String FA) {
		ahmadbasmalaDesigner season1designers = new ahmadbasmalaDesigner();
		season1designers.setLast_Name(L);
		season1designers.setFirst_Name(F);
		season1designers.setAge(A);
		season1designers.setSalary(S);
		season1designers.setStatus(ST);
		season1designers.setFavorite_TV_Show(FA);
		// ahmadbasmalaDesigner designerArray1[] = new ahmadbasmalaDesigner[50];
		designerArray1[i] = season1designers;
		return designerArray1[i];
	}

	public static ahmadbasmalaDesigner ArrayofDesigners2(int i, String L, String F, int A, double S, String ST,
			String FA) {

		ahmadbasmalaDesigner season2designers = new ahmadbasmalaDesigner();
		season2designers.setLast_Name(L);
		season2designers.setFirst_Name(F);
		season2designers.setAge(A);
		season2designers.setSalary(S);
		season2designers.setStatus(ST);
		season2designers.setFavorite_TV_Show(FA);
		// ahmadbasmalaDesigner designerArray2[] = new ahmadbasmalaDesigner[50];
		designerArray2[i] = season2designers;
		return designerArray2[i];
	}

	public static ahmadbasmalaDesigner ArrayofDesigners3(int i, String L, String F, int A, double S, String ST,
			String FA) {

		ahmadbasmalaDesigner season3designers = new ahmadbasmalaDesigner();
		season3designers.setLast_Name(L);
		season3designers.setFirst_Name(F);
		season3designers.setAge(A);
		season3designers.setSalary(S);
		season3designers.setStatus(ST);
		season3designers.setFavorite_TV_Show(FA);
		// ahmadbasmalaDesigner designerArray3[] = new ahmadbasmalaDesigner[50];
		designerArray3[i] = season3designers;
		return designerArray3[i];
	}

	public static void menu() throws IOException {
		Scanner scan = new Scanner(System.in);
		boolean tryAgain = true;
		do {
			System.out.print(
					"Enter L for list, D for designer report, S for Season Report, M for Salary, T for Status, or Q to return to main: ");
			String nextmove = scan.next();
			if (nextmove.equals("L") || nextmove.equals("l")) {
				timesLentered = timesLentered + 1;
				counter[0] = timesLentered;
				listall();
				tryAgain = false;
			} else if (nextmove.equals("d") || nextmove.equals("D")) {
				timesDentered = timesDentered + 1;
				counter[1] = timesDentered;
				designerReport();
				tryAgain = false;
			} else if (nextmove.equals("s") || nextmove.equals("S")) {
				timesSentered = timesSentered + 1;
				counter[2] = timesSentered;
				seasonReport();
				tryAgain = false;
			} else if (nextmove.equals("m") || nextmove.equals("M")) {
				timesMentered = timesMentered + 1;
				counter[3] = timesMentered;
				salaryReport();
				tryAgain = false;

			} else if (nextmove.equals("t") || nextmove.equals("T")) {
				timesTentered = timesTentered + 1;
				counter[4] = timesTentered;
				statusReport();
				tryAgain = false;

			} else if (nextmove.equals("q") || nextmove.equals("Q")) {
				timesQentered = timesQentered + 1;
				counter[5] = timesQentered;
				tryAgain = false;
			} else {
				System.out.println("Error Try again");
				timesErrorentered = timesErrorentered + 1;
				counter[6] = timesErrorentered;
			}

		} while (tryAgain);
	}

	public static void listall() throws IOException {
		// find file w the designer data
		File runwayFile = new File("C:\\Users\\Basmala\\eclipse-workspace\\Project Runway\\runwaycs115");
		// scanner reads from file
		Scanner runwayScanner = new Scanner(runwayFile);
		// read in data/traverse the array
		String season1 = " ";
		String season2 = " ";
		String season3 = " ";
		if (!season1.equals("ENDOFFILE")) {
			season1 = runwayScanner.next();
			int season1num = runwayScanner.nextInt();
			System.out.println(season1 + season1num);
			int numofDesignersperSeason1 = runwayScanner.nextInt();
			for (int i = 0; i < numofDesignersperSeason1; i++) {
				String Last_Name1 = runwayScanner.next();
				String First_Name1 = runwayScanner.next();
				int Age1 = runwayScanner.nextInt();
				double Salary1 = runwayScanner.nextDouble();
				String Status1 = runwayScanner.next();
				String Favorite_TV_Show1 = runwayScanner.nextLine();
				ArrayofDesigners1(i, Last_Name1, First_Name1, Age1, Salary1, Status1, Favorite_TV_Show1);
				System.out.println(designerArray1[i].display());

			}
		}

		if (!season2.equals("ENDOFFILE"))
			;
		{
			season2 = runwayScanner.next();
			int season2num = runwayScanner.nextInt();
			System.out.println(season2 + season2num);
			int numofDesignersperSeason2 = runwayScanner.nextInt();
			for (int i = 0; i < numofDesignersperSeason2; i++) {
				String Last_Name2 = runwayScanner.next();
				String First_Name2 = runwayScanner.next();
				int Age2 = runwayScanner.nextInt();
				double Salary2 = runwayScanner.nextDouble();
				String Status2 = runwayScanner.next();
				String Favorite_TV_Show2 = runwayScanner.nextLine();
				ArrayofDesigners2(i, Last_Name2, First_Name2, Age2, Salary2, Status2, Favorite_TV_Show2);
				System.out.println(designerArray2[i].display());

			}
		}
		if (!season3.equals("ENDOFFILE"))
			;
		{
			season3 = runwayScanner.next();
			int season3num = runwayScanner.nextInt();
			System.out.println(season3 + season3num);
			int numofDesignersperSeason3 = runwayScanner.nextInt();
			for (int i = 0; i < numofDesignersperSeason3; i++) {
				String Last_Name3 = runwayScanner.next();
				String First_Name3 = runwayScanner.next();
				int Age3 = runwayScanner.nextInt();
				double Salary3 = runwayScanner.nextDouble();
				String Status3 = runwayScanner.next();
				String Favorite_TV_Show3 = runwayScanner.nextLine();
				ArrayofDesigners3(i, Last_Name3, First_Name3, Age3, Salary3, Status3, Favorite_TV_Show3);
				System.out.println(designerArray3[i].display());

			}
		}

	}

	public static boolean designerReport() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter last name of designer: ");
		String lastnamesearch = scan.next();
		for (int i = 0; i < designerArray1.length; i++) {
			if (lastnamesearch.equals(designerArray1[i].getLast_Name())) {
				System.out.println("In Season 1:");
				System.out.println(designerArray1[i].getLast_Name() + "	" + designerArray1[i].getFirst_Name() + "	"
						+ designerArray1[i].getFavorite_TV_Show());
				break;
				// return true;
			}
		}

		for (int i = 0; i < designerArray3.length; i++) {
			if (lastnamesearch.equals(designerArray3[i].getLast_Name())) {
				System.out.println("In Season 3:");
				System.out.println(designerArray3[i].getLast_Name() + "	" + designerArray3[i].getFirst_Name() + "	"
						+ designerArray3[i].getFavorite_TV_Show());
				break;
			}
		}

		for (int i = 0; i < designerArray2.length; i++) {
			if (lastnamesearch.equals(designerArray2[i].getLast_Name())) {
				System.out.println("In Season 2:");
				System.out.println(designerArray2[i].getLast_Name() + "	" + designerArray2[i].getFirst_Name() + "	"
						+ designerArray2[i].getFavorite_TV_Show());
				break;
			}
		}
		// System.out.println("Designer does not exist");
		// return false;
		return false;

	}

	public static void salaryReport() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter last name or 'all': ");
		String salarySearch = scan.next();
		boolean found1 = false;
		boolean found2 = false;
		boolean found3 = false;
		for (int i = 0; i < designerArray1.length; i++) {
			if (!found1) {
				if (designerArray1[i].getLast_Name().equals(salarySearch)) {
					System.out.println("In Season 1:");
					System.out.println(designerArray1[i].getLast_Name() + "	" + designerArray1[i].getFirst_Name()
							+ "	" + designerArray1[i].getSalary());
					found1 = true;
				}
			}
		}
		for (int i = 0; i < designerArray2.length; i++) {
			if (!found2) {
				if (designerArray2[i].getLast_Name().equals(salarySearch)) {
					System.out.println("In Season 2:");
					System.out.println(designerArray2[i].getLast_Name() + "	" + designerArray2[i].getFirst_Name()
							+ "	" + designerArray2[i].getSalary());
					found2 = true;
				}
			}
		}
		for (int i = 0; i < designerArray3.length; i++) {
			if (!found3) {
				if (designerArray3[i].getLast_Name().equals(salarySearch)) {
					System.out.println("In Season 3:");
					System.out.println(designerArray3[i].getLast_Name() + "	" + designerArray3[i].getFirst_Name()
							+ "	" + designerArray3[i].getSalary());
					found3 = true;
				}
			}
		}
	}

	public static void seasonReport() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter season number only or all: ");
		String seasonEntered = scan.next();
		if (seasonEntered.equals("1")) {
			System.out.println("In Season 1:");
			for (int i = 0; i < designerArray1.length; i++)
				System.out.println(designerArray1[i].display());
		} else if (seasonEntered.equals("2")) {
			System.out.println("In Season 2:");
			for (int i = 0; i < designerArray2.length; i++)
				System.out.println(designerArray2[i].display());
		} else if (seasonEntered.equals("3")) {
			System.out.println("In Season 3:");
			for (int i = 0; i < designerArray3.length; i++)
				System.out.println(designerArray3[i].display());
		} else if (seasonEntered.equals("all") || seasonEntered.equals("All")) {
			System.out.println("In Season 1:");
			for (int i = 0; i < designerArray1.length; i++)
				System.out.println(designerArray1[i].display());
			System.out.println("In Season 2:");
			for (int i = 0; i < designerArray2.length; i++)
				System.out.println(designerArray2[i].display());
			System.out.println("In Season 3:");
			for (int i = 0; i < designerArray3.length; i++)
				System.out.println(designerArray3[i].display());
		} else
			System.out.print("Season Not Found");
	}

	public static void statusReport() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter status(ie 'a' or'p') or all: ");
		String statusEntered = scan.next();
		for (int i = 0; i < designerArray1.length; i++) {
			if (statusEntered.equals(designerArray1[i].getStatus())) {
				System.out.print("In Season 1:");
				if (statusEntered.equals("a")) {
					System.out.print(designerArray1[i].getLast_Name() + "	" + designerArray1[i].getFirst_Name()
							+ "	" + designerArray1[i].getStatus());
					System.out.println("	Currently Amateur");
				} else if (statusEntered.equals("p")) {
					System.out.println(designerArray1[i].getLast_Name() + "	" + designerArray1[i].getFirst_Name()
							+ "	Status: " + designerArray1[i].getStatus() + "	Age: " + designerArray1[i].getAge()
							+ "	Current salary: " + designerArray1[i].getSalary() + "	Potential Career Earnings: "
							+ designerArray1[i].potentialEarnings());
				}
			}
		}

		for (int i = 0; i < designerArray2.length; i++) {
			if (statusEntered.equals(designerArray2[i].getStatus())) {
				System.out.print("In Season 2:");
				if (statusEntered.equals("a")) {
					System.out.print(designerArray2[i].getLast_Name() + "	" + designerArray2[i].getFirst_Name()
							+ "	" + designerArray2[i].getStatus());
					System.out.println("	Currently Amateur");
				} else if (statusEntered.equals("p")) {
					System.out.println(designerArray2[i].getLast_Name() + "	" + designerArray2[i].getFirst_Name()
							+ "	Status: " + designerArray2[i].getStatus() + "	Age: " + designerArray2[i].getAge()
							+ "	Current salary: " + designerArray2[i].getSalary() + "	Potential Career Earnings: "
							+ designerArray2[i].potentialEarnings());
				}
			}
		}

		for (int i = 0; i < designerArray3.length; i++) {
			if (statusEntered.equals(designerArray3[i].getStatus())) {
				System.out.print("In Season 3:");
				if (statusEntered.equals("a")) {
					System.out.print(designerArray3[i].getLast_Name() + "	" + designerArray3[i].getFirst_Name()
							+ "	" + designerArray3[i].getStatus());
					System.out.println("	Currently Amateur");
				} else if (statusEntered.equals("p")) {
					System.out.println(designerArray3[i].getLast_Name() + "	" + designerArray3[i].getFirst_Name()
							+ "	Status: " + designerArray3[i].getStatus() + "	Age: " + designerArray3[i].getAge()
							+ "	Current salary: " + designerArray3[i].getSalary() + "	Potential Career Earnings: "
							+ designerArray3[i].potentialEarnings());
				}
			}
		}

		if (statusEntered.equals("all") || statusEntered.equals("All")) {

			for (int i = 0; i < designerArray1.length; i++) {
				if (designerArray1[i].getStatus().equals("a")) {
					System.out.print("In Season 1:");
					System.out.println(designerArray1[i].getLast_Name() + "	" + designerArray1[i].getFirst_Name()
							+ "	" + designerArray1[i].getStatus());
				}
			}

			for (int i = 0; i < designerArray2.length; i++) {
				if (designerArray2[i].getStatus().equals("a")) {
					System.out.print("In Season 2:");
					System.out.println(designerArray2[i].getLast_Name() + "	" + designerArray2[i].getFirst_Name()
							+ "	" + designerArray2[i].getStatus());
				}
			}

			for (int i = 0; i < designerArray3.length; i++) {
				if (designerArray3[i].getStatus().equals("a")) {
					System.out.print("In Season 3:");
					System.out.println(designerArray3[i].getLast_Name() + "	" + designerArray3[i].getFirst_Name()
							+ "	" + designerArray3[i].getStatus());
				}
			}

			for (int i = 0; i < designerArray1.length; i++) {
				if (designerArray1[i].getStatus().equals("p")) {
					System.out.print("In Season 1:");
					System.out.println(designerArray1[i].getLast_Name() + "	" + designerArray1[i].getFirst_Name()
							+ "	" + designerArray1[i].getStatus() + designerArray1[i].potentialEarnings());
				}
			}

			for (int i = 0; i < designerArray2.length; i++) {
				if (designerArray2[i].getStatus().equals("p")) {
					System.out.print("In Season 2:");
					System.out.println(designerArray2[i].getLast_Name() + "	" + designerArray2[i].getFirst_Name()
							+ "	" + designerArray2[i].getStatus() + designerArray2[i].potentialEarnings());
				}
			}

			for (int i = 0; i < designerArray3.length; i++) {
				if (designerArray3[i].getStatus().equals("p")) {
					System.out.print("In Season 3:");
					System.out.println(designerArray3[i].getLast_Name() + "	" + designerArray3[i].getFirst_Name()
							+ "	" + designerArray3[i].getStatus() + designerArray3[i].potentialEarnings());
				}
			}

		}

	}

	public static void finalStats() throws IOException {

		counterstr[0] = "timesLentered";
		counterstr[1] = "timesDentered";
		counterstr[2] = "timesSentered";
		counterstr[3] = "timesMentered";
		counterstr[4] = "timesTentered";
		counterstr[5] = "timesQentered";
		counterstr[6] = "timesErrorentered";

		System.out.println("You made it here finalstats");
		for (int i = 0; i < 7; i++) {
			System.out.println(counterstr[i] + ":    " + counter[i]);
		}
	}
}