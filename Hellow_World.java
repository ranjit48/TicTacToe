// package codechef;

import java.util.Scanner;

public class Hellow_World {
	public static void printlist(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			// System.out.println("------------");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
			System.out.println("------------");
		}
	}

	public static void main(String[] args) throws Exception {
		int[][] a = new int[][] { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };
		// Arrays.fill(a, array);
		Scanner sc = new Scanner(System.in);
		int p2 = 0;
		int p1 = 0;
		boolean turn = false;
		System.out.println("for player1 press 1 \nfor player2 press 2 \n");
		outer: for (int i = 0; i < a.length; i++) {
			// System.out.println("------------");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
			System.out.println("------------");
		}

		outer1: for (int b = 0; b < 5; b++) {
			System.out.println("Input for player1 :  ");
			p1 = sc.nextInt();
			if (p1 == 11) {
				if (a[0][0] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[0][0] = 1;
				}
				printlist(a);

			} else if (p1 == 12) {
				if (a[0][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[0][1] = 1;
				}
				printlist(a);

			} else if (p1 == 13) {
				if (a[0][2] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[0][2] = 1;
				}
				printlist(a);

			} else if (p1 == 14) {
				if (a[1][0] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[1][0] = 1;
				}
				printlist(a);

			} else if (p1 == 15) {
				if (a[1][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[1][1] = 1;
				}
				printlist(a);

			} else if (p1 == 16) {
				if (a[1][2] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[1][2] = 1;
				}
				printlist(a);

			} else if (p1 == 17) {
				if (a[2][0] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[2][0] = 1;
				}
				printlist(a);

			} else if (p1 == 18) {
				if (a[2][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[2][1] = 1;
				}
				printlist(a);

			}
			if (p1 == 19) {
				if (a[2][2] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[2][2] = 1;
				}
				printlist(a);

			}

			if ((a[0][0] == a[0][1] && a[0][1] == a[0][2]) || (a[1][0] == a[1][1] && a[1][1] == a[1][2])
					|| (a[2][0] == a[2][1] && a[2][1] == a[2][2]) || (a[0][0] == a[1][0] && a[1][0] == a[2][0])
					|| (a[0][1] == a[1][1] && a[1][1] == a[2][1]) || (a[0][2] == a[1][2] && a[1][2] == a[2][2])
					|| (a[0][0] == a[1][1] && a[1][1] == a[2][2]) || (a[0][2] == a[1][1] && a[1][1] == a[2][0])) {
				System.out.println("win player 1 ");
				System.out.println("-----------------------");
				printlist(a);
				break;

			}
			System.out.println("Input for player2 :  ");
			p2 = sc.nextInt();
			if (p2 == 11) {
				if (a[0][0] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[0][0] = 0;
				}
				printlist(a);

			} else if (p2 == 12) {
				if (a[0][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[0][1] = 0;
				}
				printlist(a);

			} else if (p2 == 13) {
				if (a[0][2] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[0][2] = 0;
				}
				printlist(a);

			} else if (p2 == 14) {
				if (a[1][0] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[1][0] = 0;
				}
				printlist(a);

			} else if (p2 == 15) {
				if (a[1][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[1][1] = 0;
				}
				printlist(a);

			} else if (p2 == 16) {
				if (a[1][2] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[1][2] = 0;
				}
				printlist(a);

			} else if (p2 == 17) {
				if (a[2][0] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[2][0] = 0;
				}
				printlist(a);

			} else if (p2 == 18) {
				if (a[2][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[2][1] = 0;
				}
				printlist(a);

			}
			if (p2 == 19) {
				if (a[2][1] <= 1) {
					System.out.println("already reserved");
					break;
				} else {

					a[2][2] = 0;
				}
				printlist(a);

			}

			if ((a[0][0] == a[0][1] && a[0][1] == a[0][2]) || (a[1][0] == a[1][1] && a[1][1] == a[1][2])
					|| (a[2][0] == a[2][1] && a[2][1] == a[2][2]) || (a[0][0] == a[1][0] && a[1][0] == a[2][0])
					|| (a[0][1] == a[1][1] && a[1][1] == a[2][1]) || (a[0][2] == a[1][2] && a[1][2] == a[2][2])
					|| (a[0][0] == a[1][1] && a[1][1] == a[2][2]) || (a[0][2] == a[1][1] && a[1][1] == a[2][0])) {
				System.out.println("win player 2 ");
				System.out.println("-----------------------");
				printlist(a);
				break;

			}
		}

	}

}
