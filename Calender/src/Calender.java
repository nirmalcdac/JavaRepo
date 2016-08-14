public class Calender {
	public static void main(String[] args) {
		int m = 0, h = 0, d = 0, mn = 0, y = 0;
		for (int s = 1; s < 61; s++) {
			if (s == 60) {
				m = m + 1;
				s = 0;
				if (m == 60) {
					h = h + 1;
					m = 0;
					if (h == 23) {
						d = d + 1;
						h = 0;
						if (d == 30) {
							mn = mn + 1;
							d = 0;
							if (mn == 12) {
								y = y + 1;
								mn = 0;
							}
						}
					}
				}
			}
		}
	}
}