package factorydesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      GetPlanFactory p= new GetPlanFactory();
      System.out.println("enter the plan for which bill genrated=");
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      String planname=br.readLine();
      System.out.println("enter th number of unit for bill will calculated=");
	   int units=Integer.parseInt(br.readLine());
	   
	   Plan p1=p.getPlan(planname);
	   System.out.println("Bill amount"+planname+"of "+units+"=");
	   p1.getrate();
	   p1.calculatebill(units);
	}

}
