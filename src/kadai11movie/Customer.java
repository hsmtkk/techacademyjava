package kadai11movie;

import java.util.Random;

public class Customer {
	private int age;
	private Sex sex;
	private boolean isMovieDay;
	private boolean isLadyDay;
	private boolean isLateShow;
	private boolean is3D;

	public Customer(int age, Sex sex) {
		this.age = age;
		this.sex = sex;
		randomizeAttributes();
	}

	private void randomizeAttributes() {
		Random r = new Random();
		isMovieDay = r.nextBoolean();
		isLadyDay = r.nextBoolean();
		isLateShow = r.nextBoolean();
		is3D = r.nextBoolean();
	}

	public int getAge() {
		return age;
	}

	public Sex getSex() {
		return sex;
	}

	public boolean isMovieDay() {
		return isMovieDay;
	}

	public boolean isLadyDay() {
		return isLadyDay;
	}

	public boolean isLateShow() {
		return isLateShow;
	}

	public boolean is3D() {
		return is3D;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		String newLine = String.format("%n");
		buf.append(age + "歳" + newLine);
		buf.append(sex.toString() + newLine);
		if (isMovieDay) {
			buf.append("映画の日" + newLine);
		}
		if (isLadyDay) {
			buf.append("レディースデイ" + newLine);
		}
		if (isLateShow) {
			buf.append("レイトショー" + newLine);
		}
		if (is3D) {
			buf.append("3D" + newLine);
		}
		return buf.toString();
	}
}
