
public class Ameribots extends Robot {

	int percentPowerAmeribots = 100;
	int roboWaist = 100;

	public Ameribots(String robotName, String robotColor, String robotFunction) {
		this.robotName = robotName;
		this.robotColor = robotColor;
		this.robotFunction = robotFunction;
	}

	public void consumeRoboBurger() {
		System.out.println("nom nom nom");
		roboWaist += 20;
		percentPowerAmeribots += 5;
		System.out.println(roboWaist);
		System.out.println(percentPowerAmeribots);
	}

	public void move(){
		System.out.println("ugh...can't someone else do it");
		roboWaist-=5;
		percentPowerAmeribots-=10;
		System.out.println(roboWaist);
		System.out.println(percentPowerAmeribots);
		
		
		if (roboWaist>=150)
			{System.out.println("Sorry, you are too large to move");
		
}
	}

}
