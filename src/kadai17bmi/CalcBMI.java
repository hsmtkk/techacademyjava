package kadai17bmi;

public class CalcBMI {
	public double calcBMI(BodyData bodyData) {
		double weight = bodyData.getWeight();
		double height = bodyData.getHeight();
		return weight / (height * height);
	}

	public String judgeBMI(double bmi) {
		if (bmi < 18.5) {
			return "‚â‚¹Œ^";
		} else if (18.5 <= bmi && bmi < 25) {
			return "•W€";
		} else {
			return "”ì–ž";
		}
	}
}
