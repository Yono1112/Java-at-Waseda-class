public class main {
	public static void main(String[] args){
		Shopkeeper okuma = new Shopkeeper("大隈");
		Cartoy car1 = new Cartoy("C001", 500);
		Cartoy car2 = new Cartoy("C002", 700);
		Traintoy train1 = new Traintoy("T001", 1000);

		okuma.checkPrice(car1, car2, train1);
		okuma.doDemo(car1, car2, train1);
	}
}