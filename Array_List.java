
import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice, size, value;

		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(99);

		do {
			System.out.println("ENter Choice");
			System.out.println("1 TO Display");
			System.out.println("2 TO Insert At End");
			System.out.println("3 TO Insert At Start");
			System.out.println("4 To Insert At Any Index");
			System.out.println("5 To Delete Any Number");
			System.out.println("6 To Delete At End");
			System.out.println("7 To Delete At Start");
			System.out.println("8 To Update any value ");
			System.out.println("9 To Search any value ");
			choice = sc.nextInt();
			switch (choice) {

				case 1:
					Display(array);

					break;
				case 2:
					System.out.println("Enter VAlue To Add At End");
					int adEnd = sc.nextInt();
					array.add(adEnd);
					System.out.println(array);
					break;

				case 3:
					System.out.println("Enter VAlue To Add At Start");
					int adstart = sc.nextInt();
					array.add(0, adstart);
					System.out.println(array);
					break;

				case 4:
					int val, loc;
					System.out.println("Enter Loc");
					loc = sc.nextInt();
					System.out.println("Enter Value");
					val = sc.nextInt();
					array.add(loc, val);
					System.out.println(array);
					break;

				case 5:
					int rem;
					System.out.println("Enter Index TO remove value");
					rem = sc.nextInt();
					array.remove(rem);
					System.out.println(array);
					break;

				case 6:
					array.remove(array.size() - 1);
					System.out.println(array);
					break;

				case 7:
					array.remove(0);
					System.out.println(array);
					break;

				case 8:
					System.out.println("Enter Location To Update");
					int loca = sc.nextInt();
					System.out.println("Enter New value ");
					int ad = sc.nextInt();
					array.set(loca, ad);
					System.out.println(array);
					break;

				case 9:
					System.out.println("Enter Value To search");
					int src = sc.nextInt();
					if (array.contains(src) == true) {
						System.out.println("VAlue Found At Index " + array.indexOf(src));
					} else {
						System.out.println("VAlue Not Found");
					}
					break;
				case 10:

					System.out.println(array.get(1));
			}
		} while (choice >= 1 && choice <= 10);
	}

	public static void insertAtEnd(ArrayList<Integer> array) {

	}

	public static void insertAtStart(int[] array) {

	}

	public static void insertAtAny(int[] array) {

	}

	public static void Delete(int[] array) {
		Scanner sc = new Scanner(System.in);

		int val;

	}

	public static void Update(int[] array) {

	}

	public static void Search(ArrayList<Integer> array) {

	}

	public static void DeleteAtEnd(int[] array) {

	}

	public static void DeleteAtStart(int[] array) {

	}

	public static void Display(ArrayList<Integer> array) {

		System.out.println(array);

	}

}
