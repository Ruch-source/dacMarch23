package question.assignment;
import java.util.*;


public class Test {
		Scanner sc=new Scanner(System.in);
		Student[] s=new Student[10];
		int index=0;
		void addRecord(Student s) {//upcasting
			this.s[index]=s;
			this.s[index].calculateTuition();
			this.index++;
		}
		void printRecord() {
			for(int i=0;i<index;i++) {
				if(s[i]!=null) {
					s[i].printTuition();		//dynamic method dispatch
				}
			}
		}
		void acceptRecord(Student s) {//upcasting///Student s=new Graduate
			System.out.println("Enter name:");
			s.setName(sc.nextLine());
			System.out.println("Enter ID:");
			s.setId(sc.nextInt());
			System.out.println("Enter Major:");
			sc.nextLine();
			s.setMajor(sc.nextLine());
			System.out.println("Enter GPA:");
			s.setGpa(sc.nextDouble());
			if(s instanceof Graduate) {
				Graduate g=(Graduate)s;
				System.out.println("Enter credit hours:");
				g.setCreditHours(sc.nextInt());
				System.out.println("Enter research Fee:");
				g.setResearchFee(sc.nextInt());
				sc.nextLine();
				addRecord(g);
			
				
			}
			else {
				UnderGraduate ug=(UnderGraduate)s;	
				System.out.println("Enter credit hours:");
				ug.setCreditHours(sc.nextInt());
				addRecord(ug);
			}
			
		}
}





/*

s[0]=new Graduate
s[1]=new UnderGraduate
a[2]=new UnderGraduate;


*/