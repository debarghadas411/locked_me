package phase1project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\chegg_files";
		Scanner sc=new Scanner(System.in);
		Display dsp =new Display();
		Operations op =new Operations(path);
		dsp.display("App name");
		dsp.display("dev name");
		String screen="main menu";
		int choice;
		while(true) {
			dsp.display(screen);
			System.out.print("\n>>\t");
			try {
			choice=sc.nextInt();
			if(screen.equals("main menu")) {
				switch(choice) {
				case 1:{
					System.out.print("\n**************************************************************************************************\n");
					op.show();
					System.out.print("\n**************************************************************************************************\n\n");
				}break;
				case 2:{
					screen="operation";
				}
				break;
				case 3:{
					System.out.print("\n**************************************************************************************************\n");
					System.out.println("\t\t\t\tThank you!! Please visit Again!");
					System.out.print("\n**************************************************************************************************\n");
					System.exit(0);
				} break;
				default: System.out.println("INVALID CHOICE");
				}
			}
			else if(screen.equals("operation")) {
				switch(choice) {
				case 1:{
					System.out.print("\n**************************************************************************************************\n");
					System.out.print("Enter file name to create : ");
					String fname=sc.next();
					try {
					op.add(path+"\\"+fname);
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.print("\n**************************************************************************************************\n\n");
				}break;
				case 2:{
					System.out.print("\n**************************************************************************************************\n");
					System.out.print("Enter file name to delete : ");
					String fname=sc.next();
					try {
						op.delete(path+"\\"+fname);
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
					System.out.print("\n**************************************************************************************************\n\n");
				}
				break;
				case 3:{
					System.out.print("\n**************************************************************************************************\n");
					System.out.print("Enter file name to search : ");
					String fname=sc.next();
					try {
						op.search(fname);
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
					System.out.print("\n**************************************************************************************************\n\n");
				}
				break;
				case 4:{
					screen="main menu";
				}
				break;
				default: System.out.println("INVALID CHOICE");
				}
			}
		}catch(Exception e) {
			sc.nextLine();
			System.out.print("\n**************************************************************************************************\n");
			System.out.println("INVALID INPUT!!");
			System.out.print("\n**************************************************************************************************\n");
		}
		}
		

	}

}
