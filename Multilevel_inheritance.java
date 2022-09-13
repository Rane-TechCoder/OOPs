package myproject;
//multilevel inheritance
class Shape {
	public void area() {
	System.out.println("Display area");
	}
}

class GetValue extends Shape
{
	int length;
	int height;
	
	public void getInput(int l,int h) {
		length=l;
		height=h;
	}
}

class Triangle extends GetValue{
	public void triangleArea() {
		System.out.println("Area of Triangle is "+0.5*length*height);
	}
}

class temp_file {	
		
	public static void main(String args[]) {
		Triangle t1=new Triangle();
		t1.area();
		t1.getInput(5,3);
		t1.triangleArea();
	}
}
