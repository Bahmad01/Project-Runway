import java.io.*;
public class ahmadbasmalaDesigner
{
private String Last_Name;
private String First_Name;
private int Age;
private String Status;
private String Favorite_TV_Show;
private double Salary;

public ahmadbasmalaDesigner()
{
    Last_Name= " ";
	First_Name= " ";
	Age = 0;
	Status = " ";
	Favorite_TV_Show = " ";
	Salary = 0;
}
public void setLast_Name(String n){
	Last_Name = n;
}

public String getLast_Name(){
     return Last_Name;	
}

public void setFirst_Name(String n){
	First_Name=n;
}

public String getFirst_Name(){
     return First_Name;	
}

public void setAge(int i){
	Age=i;
}

public int getAge(){
     return Age;	
}

public void setSalary(double d){
	Salary=d;
}

public double getSalary(){
     return Salary;	
}

public void setStatus(String n){
	Status = n;
}

public String getStatus(){
     return Status;	
}

public String getFavorite_TV_Show(){
     return Favorite_TV_Show;	
}
public void setFavorite_TV_Show(String n){
	Favorite_TV_Show = n;
}
public String display()
{
	return Last_Name + " " + First_Name+ " " +Age+ " " + Salary + " "  + Status +"  "+ Favorite_TV_Show;
}

public double potentialEarnings() {
	double ageAverage = (412000*(75-Age))+(Salary*(Age-16));
	if(ageAverage<10000000) {
		return ageAverage;
	}
	else
		return 10000000;
}
}
