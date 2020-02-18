package DesignPatterns.Builder_1;

public class Car implements IBuilder {

	private Product product = new Product();

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		product.Add("This is a body of a Car");
	}

	@Override
	public void InsertWheels() {
		// TODO Auto-generated method stub
		product.Add("4 wheels are added");
	}

	@Override
	public void AddHeadlights() {
		// TODO Auto-generated method stub
		product.Add("2 Headlights are added");
	}

	@Override
	public Product GetVehicle() {
		// TODO Auto-generated method stub
		return product;
	}

}