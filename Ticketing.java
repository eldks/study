public class Ticketing {
	private int rem_seat = 20;
	private int password = 2700;
	private String name;
	
	public Ticketing(String name) {
		this.name = name;
	}
	public void ticket(int amount) throws NoMoreExeption{
		if (amount <= 0) {
			throw new NoMoreExeption();
		}
		if (rem_seat < amount) {
			throw new NoMoreExeption();
		}
		rem_seat -= amount;
	}
	public void check(int passint) throws WrongNumberException{
		if (passint != password) {
			throw new WrongNumberException();
		}
	}
	public void prt() {
		System.out.println(name +" ³²Àº ÁÂ¼® : " +rem_seat);
	}

}
