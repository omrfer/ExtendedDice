import java.util.Random;

public class Dice {
		private int m_dicetotal, m_numberofdice, rollnumber = 0;
		private int[] diceArray = new int[100];
		public Dice () {
			m_numberofdice = 1;
		}
		public Dice(int dicenumber) {
			if (dicenumber > 0)
				m_numberofdice = dicenumber;
			else
				m_numberofdice = 1;
			// always have at least 1 dice
		}

		public void Roll() {
			int total = 0;
			Random rnumber = new Random();
			for (int i = 0; i < m_numberofdice; i++) {
				int cpunum = (rnumber.nextInt(6) + 1);
				total = cpunum + total;
				// System.out.println(cpunum);
				// System.out.println(total); tested in main class by changing to return int
				// total
			}
			// for 1 dice it will only run once, for 2 twice and so on
			// will return value in the range of (1-6) * m_numberofdice
			m_dicetotal = total;
			// stores total amount into private variable
			// rollnumber will be 0
			diceArray[rollnumber] = m_dicetotal;
			// stores value in array index 0
			rollnumber++;
			// rollnumber will increase by 1 for next time
		}

		public void SetDices(int dicenumber) {
			m_numberofdice = dicenumber;
		}

		public int Value() {
			return m_dicetotal;
			// returns most recent random number generated
		}

		public String History() {
			int i = 0;
			String history = "";

			for (i = 0; i < rollnumber; i++) {
				history = (history + "For game " + (i + 1) + " the dice was " + diceArray[i] + ".");

			}
			return history;
		}
	}


