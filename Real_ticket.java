public class Real_ticket {

	public static void main(String[] args) {
		Ticketing Lee = new Ticketing("�̼���");
		
		try {
			Lee.ticket(10);
		
		} catch (NoMoreExeption me) {
			me.printStackTrace();
		}
		
		try {
			Lee.check(2709);
		}catch (WrongNumberException be) {
			be.printStackTrace();
		}
		
		

	}

}
