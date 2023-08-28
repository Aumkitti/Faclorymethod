
public class FactorymethodDemo {

	public static void main(String[] args) {
		ShapeFactory ShapeFactory = new ConcreteShapeFactory();
		
		Shape shape1 = ShapeFactory.getShape("triangle");
		shape1.draw();
	}

}
