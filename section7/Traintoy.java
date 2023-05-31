public class Traintoy {
	String code_;
	int price_;

	public Traintoy(String code, int price) {
		code_ = code;
		price_ = price;
	}
	public void go() {
		System.out.println("ガタンゴトン");
	}
	public void horn() {
		System.out.println("ブォー！");
	}
}