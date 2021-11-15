package factorydesign;

public class GetPlanFactory {
  public Plan getPlan(String plantype) {
	  if(plantype==null) {
		  return null;
	  }
	  if(plantype.equalsIgnoreCase("domestic")) {
		  return new domestic();
	  }
	  else if(plantype.equalsIgnoreCase("Commercial")) {
		  return new Commercial();
	  }
	  else if(plantype.equalsIgnoreCase("Institutional")) {
		  return new Institutional();
	  }
	  return null;
  }
}
