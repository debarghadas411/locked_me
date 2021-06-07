package phase1project;

public class Display {
	public void display(String screen) {
		if(screen.equalsIgnoreCase("App name")) {
			System.out.println("\n\n##########################################################################################################\n\n");
			System.out.println("\t\t*      *     ***  *  *  ****  ***    *   *   ****        ***    *     *   * ");
			System.out.println("\t\t*    *   *  *     * *   *     *  *  * * * *  *          *     *   *  * * * *");
			System.out.println("\t\t*    *   *  *     **    ****  *  *  *  *  *  ****       *     *   *  *  *  *");
			System.out.println("\t\t*    *   *  *     * *   *     *  *  *  *  *  *          *     *   *  *  *  *");
			System.out.println("\t\t***    *     ***  *  *  ****  ***   *  *  *  ****   *    ***    *    *  *  *");
			System.out.println("\n\n##########################################################################################################");
		}
		else if(screen.equalsIgnoreCase("dev name")) {
			System.out.println("##########################################################################################################\n\n");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tBY : DEBARGHA DAS");
			System.out.println("\n\n##########################################################################################################\n\n");
		}
		else if(screen.equalsIgnoreCase("main menu")){
			System.out.print("\n\n");
			System.out.println("1.Return current directory file names in ascending order");
			System.out.println("2.User operation interface");
			System.out.println("3.Exit");
		}
		else if(screen.equalsIgnoreCase("operation")) {
			System.out.print("\n\n");
			System.out.println("1.Add a file");
			System.out.println("2.Delete a file");
			System.out.println("3.search a file");
			System.out.println("4.back to main menu");
		}
		
		
	}

}
