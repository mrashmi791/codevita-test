package codevita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListObj {
	int first;
	int second;

	ListObj() {
		this.first = Integer.MAX_VALUE;
		this.second = Integer.MAX_VALUE;
	}
}

public class Elections {

	public static void main(String[] args) {
		int n;
		String sp;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sp = sc.next();

		List<ListObj> listObj = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			listObj.add(new ListObj());
		}

		for (int i = 0; i < n; i++) {

			if (sp.charAt(i) == 'A') {

				int t = 0;
				int j = i - 1;
				if (j >= 0) {

					for (; j >= 0; j--) {

						if (sp.charAt(j) == '-') {

							listObj.get(j).first = Math.min(listObj.get(j).first, t);

						}

						else if (sp.charAt(j) == 'A' || sp.charAt(j) == 'B') {

							break;

						}

						++t;

					}

				}

			}

			else if (sp.charAt(i) == 'B') {

				int t = 0;

				int j = i + 1;

				if (j < n) {

					for (; j < n; j++) {

						if (sp.charAt(j) == '-') {

							listObj.get(j).second = Math.min(listObj.get(j).second, t);

						} else if (sp.charAt(j) == 'B' || sp.charAt(j) == 'A') {

							break;

						}

						t++;

					}

				}

			}

		}

		int a_count = 0;

		int b_count = 0;

		for (int mt = 0; mt < n; mt++) {

			int x = listObj.get(mt).first;

			int y = listObj.get(mt).second;

			if (sp.charAt(mt) == 'A') {

				a_count++;

			}

			else if (sp.charAt(mt) == 'B') {

				b_count++;

			} if (sp.charAt(mt) == '-') {

				if (x > y) {

					b_count++;

				} else if (x < y) {

					a_count++;

				}

			}

		}

		if (a_count > b_count) {

			System.out.print("A");

		} else if (b_count > a_count) {

			System.out.print("B");

		} else {

			System.out.print("Coalition government");

		}

		sc.close();
	}

}
