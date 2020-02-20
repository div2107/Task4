package task4.HouseConstruction;
import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("Enter standard_of_material");
		String standard_of_material=s.next();
		myout.print("Do you want a fully automated house?");
		String fully_automated=s.next();
		myout.print("Enter total area");
		double total_area=s.nextDouble();
		HouseConstruction hc=new HouseConstruction(standard_of_material,fully_automated,total_area);
		myout.print("Construction cost of house is:");
		myout.print(hc.calc_construction_cost());
				
	}

}
