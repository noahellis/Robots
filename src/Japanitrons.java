
public class Japanitrons extends Robot {

	int percentPowerJapanitrons=100;

	public Japanitrons(String robotName, String robotColor, String robotFunction) {
		this.robotName = robotName;
		this.robotColor = robotColor;
		this.robotFunction = robotFunction;
	}

	public void fightRoboZilla() {
		percentPowerJapanitrons -= 20;
		System.out.println("poorly translated English:Run!!! Robozilla!");
		System.out.println(percentPowerJapanitrons);
		if (percentPowerJapanitrons <= 0)
			System.out.println("you are out of power");
	}

	public void eatRoboSushi() {
		System.out.println("nom nom nom");
		System.out.println(percentPowerJapanitrons);
		percentPowerJapanitrons += 10;
	}

}
