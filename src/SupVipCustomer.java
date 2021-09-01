
public class SupVipCustomer extends Customer{
	private static SupVipCustomer superVipOnly;
	private String role;

	private SupVipCustomer(String name, String address, String iD, String phone) {
		super(name, address, iD, phone);
		this.role = "Super Vip customer";
	}
	
	public static SupVipCustomer getInstance(String name, String address, String iD, String phone) {
		if (superVipOnly == null) {
			superVipOnly = new SupVipCustomer(name, address, iD, phone);
		}
		return superVipOnly;
	}
}
