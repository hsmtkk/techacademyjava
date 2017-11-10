package kadai17bmi;

public class Kadai17 {

	public static void main(String[] args) {
		CalcBMI c = new CalcBMI();
		BodyData bodyData = new BodyData(1.65, 55);
		double bmi = c.calcBMI(bodyData);
		System.out.println(c.judgeBMI(bmi));
	}

}
