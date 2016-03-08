
public class NewZealadroids extends Robot {

	int percentPowerNewZealadroids=100;

	public NewZealadroids(String robotName, String robotColor, String robotFunction) {
		this.robotName = robotName;
		this.robotColor = robotColor;
		this.robotFunction = robotFunction;
	}

	public void climbMtDoom() {
		System.out.println("don't forget the precious");
		percentPowerNewZealadroids -= 10;
		System.out.println(percentPower);
		if (percentPowerNewZealadroids <= 0)
			System.out.println("you are out of power");
	}

	public void eatRoboLembas() {
		System.out.println("Oh yes, lovely. Lembas bread. And look! More lembas bread.");
		percentPowerNewZealadroids += 10;
		System.out.println(percentPowerNewZealadroids);
	}

}
