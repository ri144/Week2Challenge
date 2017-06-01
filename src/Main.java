import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your name");
		String name = s.nextLine();
		System.out.println("Please input your email address");
		String email = s.nextLine();
		String[] degree = new String[10];
		String[] major = new String[10];
		String[] school = new String[10];
		String[] year = new String[10];
		
		System.out.println("Please enter your first educational experience ('degree', 'major', 'school', 'year') each on different lines");
		degree[0] = s.nextLine();
		major[0] = s.nextLine();
		school[0] = s.nextLine();
		year[0] = s.nextLine();
		int count = 1;
		do{
			System.out.println("Do you have another educational experience to input? ('Y/N')");
			if (s.nextLine().equals("N")){
				break;
			}
			System.out.println("Please enter your next educational experience ('degree','major', 'school', 'year') each on different lines");
			degree[count] = s.nextLine();
			major[count] = s.nextLine();
			school[count] = s.nextLine();
			year[count] = s.nextLine();
			count++;
		}while(count < 10);
		
		String[] title = new String[10];
		String[] company = new String[10];
		String[] start = new String[10];
		String[] end = new String[10];
		String[] duty1 = new String[10];
		String[] duty2 = new String[10];
		
		int workCount = 0;
		do{
			System.out.println("Do you have a work experience to input? ('Y/N')");
			if (s.nextLine().equals("N")){
				break;
			}
			System.out.println("Please enter your next work experience ('title', 'company', 'start', 'end', 'duty1', 'duty2') each on different lines");
			title[workCount] = s.nextLine();
			company[workCount] = s.nextLine();
			start[workCount] = s.nextLine();
			end[workCount] = s.nextLine();
			duty1[workCount] = s.nextLine();
			duty2[workCount] = s.nextLine();
			workCount++;
		}while(workCount < 10);
		
		String[] skill = new String[10];
		String[] proficiency = new String[10];
		
		System.out.println("Please enter your first skill");
		skill[0] = s.nextLine();
		System.out.println("How proficient are you at this skill? ('highly skilled', 'proficient', 'familiar', 'beginner')");
		proficiency[0] = s.nextLine();
		int skillCount = 1;
		do{
			System.out.println("Do you have another skill to input? ('Y/N')");
			if (s.nextLine().equals("N")){
				break;
			}
			System.out.println("Please enter your next skill");
			skill[0] = s.nextLine();
			System.out.println("How proficient are you at this skill? ('highly skilled', 'proficient', 'familiar', 'beginner')");
			proficiency[0] = s.nextLine();
			skillCount++;
		}while(skillCount < 20);
		System.out.println("=============================================================");
		System.out.println(name);
		System.out.println(email);
		System.out.println("\nEducation");
		for(int i = 0; i<count;i++){
			System.out.printf("%s in %s,\n%s, %s\n\n", degree[i], major[i], school[i], year[i]);
		}
		System.out.println("Experience");
		for(int i = 0; i<workCount;i++){
			System.out.printf("%s\n%s, %s - %s\n-Duty1, %s\n-Duty2, %s\n\n", title[i], company[i], start[i], end[i], duty1[i], duty2[i]);
		}
		System.out.println("Skills");
		for(int i = 0; i<skillCount;i++){
			System.out.printf("%s, %s\n", skill[i], proficiency[i]);
		}
	}

}
