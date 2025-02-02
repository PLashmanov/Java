package //your package here;

public class Box {
	private double length;
	private double width;
	private double height;
	
	
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Box(double side) {
		this(side ,side, side);
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Returns Volume of the box*/
	public double getVolume() {
		return (width * height * length);
	}
	
	public double getSurfaceArea() {
		return ((width * length + length * height + height * width) * 2);
	}
	
	public void printBox() {
		if (length <= 0 || height <=0 || width <=0) {
			System.out.println("Box Has invalid values");
			
		}else {
			System.out.println("Length = " + length);
			System.out.println("Width = " + width);
			System.out.println("Height = " + height);
			System.out.println("Volume = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
		}
	}
}
