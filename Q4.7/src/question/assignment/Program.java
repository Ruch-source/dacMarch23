package question.assignment;

import java.util.Scanner;

public class Program {
	static Scanner sc=new Scanner(System.in);
	static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2.Display Details");
		System.out.println("Enter choice:");
		return sc.nextInt();
	}
	static int subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Graduate Student");
		System.out.println("2.Under Graduate student");
		System.out.println("Enter choice:");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Test t=new Test();
		int choice1=0,choice2=0;
		while((choice1=Program.menuList())!=0) {
			switch(choice1) {
			case 1: while((choice2=Program.subMenuList())!=0) {
					switch(choice2) {
					case 1: t.acceptRecord(new Graduate());
							break;
					case 2: t.acceptRecord(new UnderGraduate());
							break;
						}
					}
					break;
			case 2: t.printRecord();
					break;
			
			}
		}
	}
}
