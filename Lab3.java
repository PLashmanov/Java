package //import your package here;

public class Lab3 {

	public static void main(String[] args) {
		String [] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		System.out.println("Start of output EX 1");
		for(int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}
		System.out.println("Output ex1 enchanced");
		for(String day : daysOfWeek) {
			System.out.println(day);
		}
		System.out.println("Outpur ex 1 reversed");
		for(int j =6; j >= 0; j--) {
			System.out.println(daysOfWeek[j]);
		}
		
		System.out.println("Output ex 2");
		int count = 0;
		while(count <= 20 ) {
			count ++;
			if((count % 2) == 1) {
				continue;
			}
			System.out.println(count + " ");
		}
		
		System.out.println("Output ex 3");
		
		for(int k = 1; k <= 100; k++) {
			if(k > 49 && k < 61) {
				continue;
			}
			System.out.println(k + " ");
		}
		
		System.out.println("Output ex 4");
		int monthCount = 1;
		while (monthCount <= 12) {
			switch (monthCount ) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("There are 31 days in " + monthNames[monthCount - 1]);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("There are 30 days in " + monthNames[monthCount - 1]);
				break;
			case 2:
				System.out.println("There are 28 days in " + monthNames[monthCount - 1]);
				break;
			default:
				System.out.println("Wrong month number");
			}
			monthCount++;
		}

	}

}
