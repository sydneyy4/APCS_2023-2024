public class Rectangle{
	private double b;
	private double h;
	
	public Rectangle(double b, double h){
		this.b = b;
		this.h = h;
	}
	public double accessBase(){
		return this.b;
	}
	public double accessHeight(){
		return this.h;
	}
	public double area(){
		double area = b*h;
		return area;
	}
	public double perimeter(){
		double perimeter = 2*(b)+2*(h);
		return perimeter;
	}
	public double diagonal(){
		double diagonal = Math.sqrt(b*b+h*h);
		return diagonal;
	}
}