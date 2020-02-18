package DesignPatterns.Builder_1;

public interface IBuilder {
	void BuildBody();

	void InsertWheels();

	void AddHeadlights();

	Product GetVehicle();
}
