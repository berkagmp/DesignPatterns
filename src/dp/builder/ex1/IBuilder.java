package dp.builder.ex1;

public interface IBuilder {
	void BuildBody();

	void InsertWheels();

	void AddHeadlights();

	Product GetVehicle();
}
