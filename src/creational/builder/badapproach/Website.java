package creational.builder.badapproach;

public class Website {

	private String name;
	private String cms;
	private int price;

	public void setName(final String name) {
		this.name = name;
	}

	public void setCms(final String cms) {
		this.cms = cms;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Website{" + "name='" + name + '\'' + ", cms='" + cms + '\'' + ", price=" + price + '}';
	}
}
