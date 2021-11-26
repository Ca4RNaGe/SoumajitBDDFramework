package interfacepack;



public class Circle implements Graphic {
  private float radius;
  public Circle(float radius) {
	  this.radius=radius;
	  
  }
  public float area()
  {
	  return(PI*radius*radius);
  }
  public float peri()
  {
	  return 2*PI*radius;
  }

}
