package factorydesign;

public abstract class Plan {
 protected double rate;
 abstract void getrate();
 
 public void calculatebill(int units) {
	 System.out.println(units*rate);
 }
}
