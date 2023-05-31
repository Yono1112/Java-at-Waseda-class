public class Cartoy {
	String code_;
	int price_;

	public Cartoy(String code, int price) {
		code_ = code;
		price_ = price;
	}
	public void go() {
		System.out.println("ブロロー！");
	}
	public void horn() {
		System.out.println("ピカーー！");
	}
}