public class Shopkeeper {
	String name_;

	public Shopkeeper(String name) {
		name_ = name;
	}
	public void checkPrice(Cartoy auto1, Cartoy auto2, Traintoy rail1) {
		System.out.println("店長の" + name_ + "です。これから価格のチェックをします");
		System.out.println("商品コード" + auto1.code_ + "の価格は" + auto1.price_ + "円です");
		System.out.println("商品コード" + auto2.code_ + "の価格は" + auto2.price_ + "円です");
		System.out.println("商品コード" + rail1.code_ + "の価格は" + rail1.price_ + "円です");
		System.out.println();
	}
	public void doDemo(Cartoy auto1, Cartoy auto2, Traintoy rail1) {
		System.out.println("店長の" + name_ + "です。これからデモをします");
		System.out.println("車1を走らせます");
		auto1.go();
		System.out.println("車2を走らせます");
		auto2.go();
		System.out.println("電車を走らせます");
		rail1.go();
		System.out.println();
	}
}